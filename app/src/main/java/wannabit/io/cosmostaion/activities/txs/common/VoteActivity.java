package wannabit.io.cosmostaion.activities.txs.common;

import static wannabit.io.cosmostaion.base.BaseConstant.CONST_PW_TX_VOTE;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.ledger.live.ble.app.BleCosmosHelper;

import java.util.ArrayList;
import java.util.List;

import cosmos.tx.v1beta1.ServiceOuterClass;
import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.activities.PasswordCheckActivity;
import wannabit.io.cosmostaion.base.BaseBroadCastActivity;
import wannabit.io.cosmostaion.base.BaseChain;
import wannabit.io.cosmostaion.base.BaseFragment;
import wannabit.io.cosmostaion.base.chains.ChainFactory;
import wannabit.io.cosmostaion.cosmos.MsgGenerator;
import wannabit.io.cosmostaion.cosmos.Signer;
import wannabit.io.cosmostaion.dialog.CommonAlertDialog;
import wannabit.io.cosmostaion.fragment.StepFeeSetFragment;
import wannabit.io.cosmostaion.fragment.StepMemoFragment;
import wannabit.io.cosmostaion.fragment.txs.common.VoteStep0Fragment;
import wannabit.io.cosmostaion.fragment.txs.common.VoteStep3Fragment;
import wannabit.io.cosmostaion.model.type.Msg;
import wannabit.io.cosmostaion.network.res.ResProposal;
import wannabit.io.cosmostaion.task.TaskResult;
import wannabit.io.cosmostaion.task.gRpcTask.broadcast.VoteGrpcTask;
import wannabit.io.cosmostaion.utils.LedgerManager;
import wannabit.io.cosmostaion.utils.WKey;

public class VoteActivity extends BaseBroadCastActivity {

    private Toolbar mToolbar;
    private TextView mTitle;
    private ImageView mIvStep;
    private TextView mTvStep;
    private ViewPager mViewPager;
    private VotePageAdapter mPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step);
        mToolbar = findViewById(R.id.tool_bar);
        mTitle = findViewById(R.id.toolbar_title);
        mIvStep = findViewById(R.id.send_step);
        mTvStep = findViewById(R.id.send_step_msg);
        mViewPager = findViewById(R.id.view_pager);
        mTitle.setText(getString(R.string.str_vote_c));

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mIvStep.setImageDrawable(ContextCompat.getDrawable(VoteActivity.this, R.drawable.step_4_img_1));
        mTvStep.setText(getString(R.string.str_vote_step_0));

        mAccount = getBaseDao().onSelectAccount(getBaseDao().getLastUser());
        mBaseChain = BaseChain.getChain(mAccount.baseChain);
        mChainConfig = ChainFactory.getChain(mBaseChain);
        mTxType = CONST_PW_TX_VOTE;

        mPageAdapter = new VotePageAdapter(getSupportFragmentManager());
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(mPageAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override
            public void onPageSelected(int i) {
                if (i == 0) {
                    mIvStep.setImageDrawable(ContextCompat.getDrawable(VoteActivity.this, R.drawable.step_4_img_1));
                    mTvStep.setText(getString(R.string.str_vote_step_0));
                } else if (i == 1) {
                    mIvStep.setImageDrawable(ContextCompat.getDrawable(VoteActivity.this, R.drawable.step_4_img_2));
                    mTvStep.setText(getString(R.string.str_tx_step_memo));
                } else if (i == 2) {
                    mIvStep.setImageDrawable(ContextCompat.getDrawable(VoteActivity.this, R.drawable.step_4_img_3));
                    mTvStep.setText(getString(R.string.str_tx_step_fee));
                    mPageAdapter.mCurrentFragment.onRefreshTab();
                } else if (i == 3) {
                    mIvStep.setImageDrawable(ContextCompat.getDrawable(VoteActivity.this, R.drawable.step_4_img_4));
                    mTvStep.setText(getString(R.string.str_tx_step_confirm));
                    mPageAdapter.mCurrentFragment.onRefreshTab();
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });
        mViewPager.setCurrentItem(0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mAccount == null) finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        onHideKeyboard();
        if (mViewPager.getCurrentItem() > 0) {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1, true);
        } else {
            super.onBackPressed();
        }
    }

    public void onNextStep() {
        if (mViewPager.getCurrentItem() < mPageAdapter.getCount() - 1) {
            onHideKeyboard();
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1, true);
        }
    }

    public void onBeforeStep() {
        if (mViewPager.getCurrentItem() > 0) {
            onHideKeyboard();
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1, true);
        } else {
            onBackPressed();
        }
    }

    public void onStartVote() {
        if (mAccount.isLedger()) {
            onVoteByLedger();
        } else if (getBaseDao().isAutoPass()) {
            onBroadCastTx();
        } else {
            Intent intent = new Intent(VoteActivity.this, PasswordCheckActivity.class);
            activityResultLauncher.launch(intent);
            overridePendingTransition(R.anim.slide_in_bottom, R.anim.fade_out);
        }
    }

    private void onVoteByLedger() {
        runOnUiThread(() -> LedgerManager.getInstance().signAndBroadcast(VoteActivity.this, mAccount, new LedgerManager.LedgerSignListener() {
            @NonNull
            @Override
            public String getMessage() {
                ArrayList<Msg> voteMsgs = MsgGenerator.genVoteMsgs(mAccount.address, mSelectedOpinion);
                return WKey.onGetLedgerMessage(getBaseDao(), mChainConfig, mAccount, voteMsgs, mTxFee, mTxMemo);
            }

            @NonNull
            @Override
            public ServiceOuterClass.BroadcastTxRequest makeBroadcastTxRequest(@NonNull byte[] currentPubKey) {
                return Signer.getGrpcLedgerVoteReq(WKey.onAuthResponse(mBaseChain, mAccount), mSelectedOpinion, mTxFee, mTxMemo, LedgerManager.Companion.getInstance().getCurrentPubKey(), WKey.getLedgerSigData(currentPubKey));
            }

            @Override
            public void processResponse(@NonNull TaskResult mResult, @NonNull ServiceOuterClass.BroadcastTxResponse response) {
                onCommonIntentTx(VoteActivity.this, mResult);
            }
        }));
    }

    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
        if (result.getResultCode() == Activity.RESULT_OK) {
            onShowWaitDialog();
            onBroadCastTx();
        }
    });

    private void onBroadCastTx() {
        new VoteGrpcTask(getBaseApplication(), result -> {
            onCommonIntentTx(VoteActivity.this, result);
        }, mBaseChain, mAccount, mSelectedOpinion, mTxMemo, mTxFee, getBaseDao().getChainIdGrpc()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    private class VotePageAdapter extends FragmentPagerAdapter {
        private ArrayList<BaseFragment> mFragments = new ArrayList<>();
        private BaseFragment mCurrentFragment;

        public VotePageAdapter(FragmentManager fm) {
            super(fm);
            mFragments.clear();
            mFragments.add(VoteStep0Fragment.newInstance());
            mFragments.add(StepMemoFragment.newInstance());
            mFragments.add(StepFeeSetFragment.newInstance());
            mFragments.add(VoteStep3Fragment.newInstance());
        }

        @Override
        public BaseFragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public void setPrimaryItem(ViewGroup container, int position, Object object) {
            if (getCurrentFragment() != object) {
                mCurrentFragment = ((BaseFragment) object);
            }
            super.setPrimaryItem(container, position, object);
        }

        public BaseFragment getCurrentFragment() {
            return mCurrentFragment;
        }

        public ArrayList<BaseFragment> getFragments() {
            return mFragments;
        }
    }
}
