package wannabit.io.cosmostaion.base.chains;

import static wannabit.io.cosmostaion.base.BaseConstant.EXPLORER_BASE_URL;

import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.base.BaseChain;

public class Nyx extends ChainConfig {

    public BaseChain baseChain() { return BaseChain.NYX_MAIN; }
    public int chainImg() { return R.drawable.chain_nyx; }
    public int chainInfoImg() { return R.drawable.infoicon_nyx; }
    public int chainInfoTitle() { return R.string.str_front_guide_title_nyx; }
    public int chainInfoMsg() { return R.string.str_front_guide_msg_nyx; }
    public int chainColor() { return R.color.color_nyx; }
    public int chainBgColor() { return R.color.colorTransBgNyx; }
    public int chainTabColor() { return R.color.color_tab_myvalidator_nyx; }
    public String chainName() { return "nyx"; }
    public String chainKoreanName() { return "닉스"; }
    public String chainIdPrefix() { return "nyx"; }

    public int mainDenomImg() { return R.drawable.token_nyx; }
    public String mainDenom() { return "unyx"; }
    public String addressPrefix() { return "n"; }

    public boolean dexSupport() { return false; }
    public boolean wcSupport() { return false; }
    public boolean authzSupport() { return true; }

    public String grpcUrl() { return "grpc-nyx.cosmostation.io"; }

    public String explorerUrl() { return EXPLORER_BASE_URL + "nyx/"; }
    public String homeInfoLink() { return  "https://nymtech.net"; }
    public String blogInfoLink() { return  "https://nymtech.net/blog"; }
    public String coingeckoLink() { return  ""; }


    public static String NYX_NYM_DENOM = "unym";
}
