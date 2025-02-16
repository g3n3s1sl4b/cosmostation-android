package wannabit.io.cosmostaion.task.gRpcTask.simulate;

import cosmos.tx.v1beta1.ServiceGrpc;
import cosmos.tx.v1beta1.ServiceOuterClass;
import wannabit.io.cosmostaion.base.BaseApplication;
import wannabit.io.cosmostaion.base.BaseChain;
import wannabit.io.cosmostaion.cosmos.Signer;
import wannabit.io.cosmostaion.dao.Account;
import wannabit.io.cosmostaion.model.type.Coin;
import wannabit.io.cosmostaion.model.type.Fee;
import wannabit.io.cosmostaion.network.ChannelBuilder;
import wannabit.io.cosmostaion.task.CommonTask;
import wannabit.io.cosmostaion.task.TaskListener;
import wannabit.io.cosmostaion.task.TaskResult;
import wannabit.io.cosmostaion.utils.WKey;
import wannabit.io.cosmostaion.utils.WLog;

public class SimulUndelegateGrpcTask extends CommonTask {
    private BaseChain   mBaseChain;
    private Account     mAccount;
    private String      mValidatorAddress;
    private Coin        mAmount;
    private String      mMemo;
    private Fee         mFees;

    public SimulUndelegateGrpcTask(BaseApplication app, TaskListener listener, BaseChain basechain, Account account, String toValidatorAddress, Coin toDelegateAmount, String toDelegateMemo, Fee toFees) {
        super(app, listener);
        this.mBaseChain = basechain;
        this.mAccount = account;
        this.mValidatorAddress = toValidatorAddress;
        this.mAmount = toDelegateAmount;
        this.mMemo = toDelegateMemo;
        this.mFees = toFees;
    }

    @Override
    protected TaskResult doInBackground(String... strings) {
        try {
            ServiceGrpc.ServiceBlockingStub txService = ServiceGrpc.newBlockingStub(ChannelBuilder.getChain(mBaseChain));
            ServiceOuterClass.SimulateRequest simulateTxRequest = Signer.getGrpcUnDelegateSimulateReq(WKey.onAuthResponse(mBaseChain, mAccount), mValidatorAddress, mAmount, mFees, mMemo, mAccount.customPath, mBaseChain);
            ServiceOuterClass.SimulateResponse response = txService.simulate(simulateTxRequest);

            mResult.resultData = response.getGasInfo();
            mResult.isSuccess = true;

        } catch (Exception e) {
            WLog.e( "SimulUndelegateGrpcTask "+ e.getMessage());
            mResult.isSuccess = false;
            mResult.errorMsg = e.getMessage();
        }
        return mResult;
    }
}