package wannabit.io.cosmostaion.base.chains;

import static wannabit.io.cosmostaion.base.BaseConstant.COINGECKO_URL;
import static wannabit.io.cosmostaion.base.BaseConstant.EXPLORER_BASE_URL;

import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.base.BaseChain;

public class Assetmantle extends ChainConfig {

    public BaseChain baseChain() { return BaseChain.ASSETMANTLE_MAIN; }
    public int chainImg() { return R.drawable.chain_assetmantle; }
    public int chainInfoImg() { return R.drawable.infoicon_assetmantle; }
    public int chainInfoTitle() { return R.string.str_front_guide_title_assetmantle; }
    public int chainInfoMsg() { return R.string.str_front_guide_msg_assetmantle; }
    public int chainColor() { return R.color.color_assetmantle; }
    public int chainBgColor() { return R.color.colorTransBgAssetmantle; }
    public int chainTabColor() { return R.color.color_tab_myvalidator_assetmantle; }
    public String chainName() { return "asset-mantle"; }
    public String chainKoreanName() { return "에셋멘틀"; }
    public String chainIdPrefix() { return "mantle-"; }

    public int mainDenomImg() { return R.drawable.token_assetmantle; }
    public String mainDenom() { return "umntl"; }
    public String addressPrefix() { return "mantle"; }

    public boolean dexSupport() { return false; }
    public boolean wcSupport() { return false; }

    public String grpcUrl() { return "grpc-asset-mantle.cosmostation.io"; }

    public String explorerUrl() { return EXPLORER_BASE_URL + "asset-mantle/"; }
    public String homeInfoLink() { return  "https://assetmantle.one"; }
    public String blogInfoLink() { return  "https://blog.assetmantle.one"; }
    public String coingeckoLink() { return  COINGECKO_URL + "assetmantle"; }
}
