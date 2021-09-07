package lib.ui.android;

import lib.ui.TradeScreenPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidTradeScreenPageObject extends TradeScreenPageObject {
    public AndroidTradeScreenPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    static {
        GO_TO_MARKETWATCH="id:com.sentryd.trade:id/pair_name";
        MENU="id:com.sentryd.trade:id/logo";
        CLOSE_TUTORIAL="id:com.sentryd.trade:id/close_view";
        ONBOARDING_TUTORIAL="xpath://android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup";
        BLUE_BUTTON="id:com.sentryd.trade:id/acc_layout";
        TYPE_OF_ACCOUNT_ON_BLUE_BUTTON="id:com.sentryd.trade:id/tv_acc_title";
        ACCOUNT_NUMBER_ON_BLUE_BUTTON="id:com.sentryd.trade:id/tv_acc_descr";
        ACCOUNT_VALUE="id:com.sentryd.trade:id/balance_layout";
        ACCOUNT_VALUE_BALANCE="id:com.sentryd.trade:id/balance";
        TENOR_VIEW="id:com.sentryd.trade:id/spot_tenor_view";
        SOCKET_STATUS="id:com.sentryd.trade:id/socket_status";
        TIME="id:com.sentryd.trade:id/time";
        CURRENY_PAIR_NAME="id:com.sentryd.trade:id/pair_name";
        CYRRENCY_PAIR_TYPE="id:com.sentryd.trade:id/pair_type";
        TRADE_SCREEN_AUTOCHARTIS_BUTTON="id:com.sentryd.trade:id/autochartis_clickable";
        CHART="id:com.sentryd.trade:id/graph_view";
        STRATEGY="id:com.sentryd.trade:id/strategy_shade";
        STRATEGY_NAME="id:com.sentryd.trade:id/strat_name";
        STRATEGY_TEXT="xpath://*[contains(@text,'STRATEGY')]";
        STRATEGY_INDEX_ICON="id:com.sentryd.trade:id/tv_quantity";
        QUANTITY="id:com.sentryd.trade:id/quantity_shade";
        QUANTITY_MINUS="id:com.sentryd.trade:id/investment_minus";
        QUANTITY_PLUS="id:com.sentryd.trade:id/investment_plus";
        QUANTITY_TEXT="xpath://*[contains(@text,'QUANTITY')]";
        QUANTITY_VALUE= "id:com.sentryd.trade:id/tv_quantity";
        BUY_BUTTON="id:com.sentryd.trade:id/ov_invest";
        SELL_BUTTON ="id:com.sentryd.trade:id/ov_sell";
        EXECUTE_TRADE_DIALOG_LAYOUT="xpath://hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout";
        EXPIRATION_DATE_TEXT = "xpath://*[contains(@text,'EXPIRATION DATE')]";
        EXPIRATION_DATE_VALUE = "id:com.sentryd.trade:id/expiration_value";
        HORIZON_TEXT = "xpath://*[contains(@text,'Horizon')]";
        HORIZON_VALUE = "id:com.sentryd.trade:id/horizon_value";
        CHART_SETTINGS = "id:com.sentryd.trade:id/indicator_dialog_image";
    }
}
