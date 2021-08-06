package wannabit.io.cosmostaion.fragment.chains.osmosis;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.TimeUnit;

import osmosis.gamm.v1beta1.PoolOuterClass;
import osmosis.gamm.v1beta1.QueryGrpc;
import osmosis.gamm.v1beta1.QueryOuterClass;
import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.activities.DelegateActivity;
import wannabit.io.cosmostaion.activities.chains.osmosis.SwapActivity;
import wannabit.io.cosmostaion.base.BaseFragment;
import wannabit.io.cosmostaion.network.ChannelBuilder;
import wannabit.io.cosmostaion.task.TaskListener;
import wannabit.io.cosmostaion.task.TaskResult;
import wannabit.io.cosmostaion.task.gRpcTask.OsmosisGrpcPoolInfoTask;
import wannabit.io.cosmostaion.task.gRpcTask.OsmosisGrpcPoolListTask;
import wannabit.io.cosmostaion.utils.WDp;
import wannabit.io.cosmostaion.utils.WLog;
import wannabit.io.cosmostaion.utils.WUtil;

import static wannabit.io.cosmostaion.base.BaseConstant.CONST_PW_TX_OSMOSIS_JOIN_POOL;
import static wannabit.io.cosmostaion.base.BaseConstant.CONST_PW_TX_OSMOSIS_SWAP;
import static wannabit.io.cosmostaion.base.BaseConstant.TASK_GRPC_FETCH_OSMOSIS_POOL_INFO;
import static wannabit.io.cosmostaion.base.BaseConstant.TASK_GRPC_FETCH_OSMOSIS_POOL_LIST;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_OSMOSIS;
import static wannabit.io.cosmostaion.network.ChannelBuilder.TIME_OUT;

public class CoinSwapStep0Fragment extends BaseFragment implements View.OnClickListener, TaskListener {

    private RelativeLayout      mProgress;
    private Button              mCancelBtn, mNextBtn;

    private TextView            mSwapAvailAmount, mSwapAvailAmountSymbol;

    private ImageView           mSwapInputImg;
    private TextView            mSwapInputSymbol;
    private EditText            mSwapInputAmount;
    private ImageView           mBtnSwapInputClear;
    private Button              mBtnSwapInput1_4, mBtnSwapInputHalf, mBtnSwapInput3_4, mBtnSwapInputMax;

    private ImageView           mSwapOutputImg;
    private TextView            mSwapOutputSymbol;
    private TextView            mSwapOutputAmount;

    private int                 mInputCoinDecimal;
    private int                 mOutputCoinDecimal;
    private BigDecimal          mAvailableMaxAmount;
    private BigDecimal          mSwapRate;

    public static CoinSwapStep0Fragment newInstance(Bundle bundle) {
        CoinSwapStep0Fragment fragment = new CoinSwapStep0Fragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_swap_step0, container, false);
        mCancelBtn                  = rootView.findViewById(R.id.btn_cancel);
        mNextBtn                    = rootView.findViewById(R.id.btn_next);
        mProgress                   = rootView.findViewById(R.id.progress);

        mSwapAvailAmount            = rootView.findViewById(R.id.swap_available_amount);
        mSwapAvailAmountSymbol      = rootView.findViewById(R.id.swap_available_amount_symbol);
        mSwapInputImg               = rootView.findViewById(R.id.swap_input_icon);
        mSwapInputSymbol            = rootView.findViewById(R.id.swap_input_symbol);
        mBtnSwapInputClear          = rootView.findViewById(R.id.swap_input_clear);
        mSwapInputAmount            = rootView.findViewById(R.id.swap_input_amount);
        mBtnSwapInput1_4            = rootView.findViewById(R.id.swap_input_1_4);
        mBtnSwapInputHalf           = rootView.findViewById(R.id.swap_input_half);
        mBtnSwapInput3_4            = rootView.findViewById(R.id.swap_input_3_4);
        mBtnSwapInputMax            = rootView.findViewById(R.id.swap_input_max);

        mSwapOutputImg              = rootView.findViewById(R.id.swap_output_icon);
        mSwapOutputSymbol           = rootView.findViewById(R.id.swap_output_symbol);
        mSwapOutputAmount           = rootView.findViewById(R.id.swap_pool_output);

        mBtnSwapInputClear.setOnClickListener(this);
        mBtnSwapInput1_4.setOnClickListener(this);
        mBtnSwapInputHalf.setOnClickListener(this);
        mBtnSwapInput3_4.setOnClickListener(this);
        mBtnSwapInputMax.setOnClickListener(this);

        onFetchPoolInfo();
        return rootView;
    }

    private void onInitView() {
        mProgress.setVisibility(View.GONE);
        WLog.w("pool " + getSActivity().mPool.getId());

        mInputCoinDecimal = WUtil.getOsmosisCoinDecimal(getSActivity().mInputDenom);
        mOutputCoinDecimal = WUtil.getOsmosisCoinDecimal(getSActivity().mOutputDenom);
        mAvailableMaxAmount = getBaseDao().getAvailable(getSActivity().mInputDenom);
        BigDecimal txFee = WUtil.getEstimateGasFeeAmount(getContext(), getSActivity().mBaseChain, CONST_PW_TX_OSMOSIS_SWAP, 0);
        if (getSActivity().mInputDenom.equals(TOKEN_OSMOSIS)) {
            mAvailableMaxAmount = mAvailableMaxAmount.subtract(txFee);
        }
        mSwapAvailAmount.setText(WDp.getDpAmount2(getContext(), mAvailableMaxAmount, mInputCoinDecimal, mInputCoinDecimal));
        WUtil.dpOsmosisTokenName(getContext(), mSwapAvailAmountSymbol, getSActivity().mInputDenom);

        WUtil.dpOsmosisTokenName(getContext(), mSwapInputSymbol, getSActivity().mInputDenom);
        WUtil.DpOsmosisTokenImg(mSwapInputImg, getSActivity().mInputDenom);
        WUtil.dpOsmosisTokenName(getContext(), mSwapOutputSymbol, getSActivity().mOutputDenom);
        WUtil.DpOsmosisTokenImg(mSwapOutputImg, getSActivity().mOutputDenom);

        BigDecimal inputAssetAmount = BigDecimal.ZERO;
        BigDecimal inputAssetWeight = BigDecimal.ZERO;
        BigDecimal outputAssetAmount = BigDecimal.ZERO;
        BigDecimal outputAssetWeight = BigDecimal.ZERO;

        for (PoolOuterClass.PoolAsset asset: getSActivity().mPool.getPoolAssetsList()) {
            if (asset.getToken().getDenom().equals(getSActivity().mInputDenom)) {
                inputAssetAmount = new BigDecimal(asset.getToken().getAmount());
                inputAssetWeight = new BigDecimal(asset.getWeight());
            }
            if (asset.getToken().getDenom().equals(getSActivity().mOutputDenom)) {
                outputAssetAmount = new BigDecimal(asset.getToken().getAmount());
                outputAssetWeight = new BigDecimal(asset.getWeight());
            }
        }
        mSwapRate = outputAssetAmount.multiply(inputAssetWeight).divide(inputAssetAmount, 18, RoundingMode.DOWN).divide(outputAssetWeight, 18, RoundingMode.DOWN);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(mCancelBtn)) {
            getSActivity().onBeforeStep();

        } else if (v.equals(mNextBtn)) {

        } else if (v.equals(mBtnSwapInputClear)) {
            mSwapInputAmount.setText("");
            mSwapOutputAmount.setText("");

        } else if (v.equals(mBtnSwapInput1_4)) {
            BigDecimal cal = mAvailableMaxAmount.movePointLeft(mInputCoinDecimal).multiply(new BigDecimal("0.25")).setScale(mInputCoinDecimal, RoundingMode.DOWN);
            mSwapInputAmount.setText(cal.toPlainString());
            onUpdateOutputTextView();

        } else if (v.equals(mBtnSwapInputHalf)) {
            BigDecimal cal = mAvailableMaxAmount.movePointLeft(mInputCoinDecimal).multiply(new BigDecimal("0.5")).setScale(mInputCoinDecimal, RoundingMode.DOWN);
            mSwapInputAmount.setText(cal.toPlainString());
            onUpdateOutputTextView();

        } else if (v.equals(mBtnSwapInput3_4)) {
            BigDecimal cal = mAvailableMaxAmount.movePointLeft(mInputCoinDecimal).multiply(new BigDecimal("0.75")).setScale(mInputCoinDecimal, RoundingMode.DOWN);
            mSwapInputAmount.setText(cal.toPlainString());
            onUpdateOutputTextView();

        } else if (v.equals(mBtnSwapInputMax)) {
            BigDecimal max = mAvailableMaxAmount.movePointLeft(mInputCoinDecimal).setScale(mInputCoinDecimal, RoundingMode.DOWN);
            mSwapInputAmount.setText(max.toPlainString());
            onUpdateOutputTextView();

        }
    }

    private void onUpdateOutputTextView() {
        try {
            BigDecimal InputAmountTemp = new BigDecimal(mSwapInputAmount.getText().toString().trim());

            BigDecimal padding = new BigDecimal("0.97");
            BigDecimal OutputAmount = InputAmountTemp.multiply(padding).multiply(mSwapRate).setScale(mInputCoinDecimal, RoundingMode.DOWN).movePointLeft(mInputCoinDecimal);
            mSwapOutputAmount.setText(OutputAmount.movePointLeft(-mOutputCoinDecimal).toPlainString());
        } catch (Exception e) { }
    }


    private int mTaskCount;
    public void onFetchPoolInfo() {
        mTaskCount = 1;
        new OsmosisGrpcPoolInfoTask(getBaseApplication(), this, getSActivity().mBaseChain, getSActivity().mPoolId).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void onTaskResponse(TaskResult result) {
        mTaskCount--;
        if (result.taskType == TASK_GRPC_FETCH_OSMOSIS_POOL_INFO) {
            if (result.isSuccess && result.resultData != null) {
                getSActivity().mPool = (PoolOuterClass.Pool)result.resultData;
            }
        }
        if (mTaskCount == 0) {
            onInitView();
        }
    }

    private SwapActivity getSActivity() {
        return (SwapActivity)getBaseActivity();
    }



}
