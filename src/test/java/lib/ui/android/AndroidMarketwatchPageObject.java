package lib.ui.android;

import lib.ui.MarketWatchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMarketwatchPageObject extends MarketWatchPageObject {
    static{
                MENU="id:com.sentryd.trade:id/logo";
        START_TUTORIAL="id:com.sentryd.trade:id/start_tutorial";
        SKIP_TUTORIAL="id:com.sentryd.trade:id/skip_tutorial";
        CLOSE_TUTORIAL="id:com.sentryd.trade:id/close_view";
        ONBOARDING_TUTORIAL="xpath://android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup";
        TEXT_TUTORIAL_ON_FIRST_PAGE="xpath://*[contains(@text,'Click any price to move to trading')]";
        BLUE_BUTTON="id:com.sentryd.trade:id/acc_layout";
        TYPE_OF_ACCOUNT_ON_BLUE_BUTTON="id:com.sentryd.trade:id/tv_acc_title";
        ACCOUNT_NUMBER_ON_BLUE_BUTTON="id:com.sentryd.trade:id/tv_acc_descr";
        ACCOUNT_VALUE="id:com.sentryd.trade:id/balance_layout";
        ACCOUNT_VALUE_BALANCE="id:com.sentryd.trade:id/balance";
        TENOR_VIEW="id:com.sentryd.trade:id/spot_tenor_view";
        SOCKET_STATUS="id:com.sentryd.trade:id/socket_status";
        TIME="id:com.sentryd.trade:id/time";
        EDIT_FAVORITES_ICON="id:com.sentryd.trade:id/config_market_watch";
        FAVORITES_GROUP_NAME="id:com.sentryd.trade:id/group_name";
        ASK_COLUMN_TITLE="xpath://*[contains(@text,'Ask')]";
        BID_COLUMN_TITLE="xpath://*[contains(@text,'Bid')]";
    }


    public AndroidMarketwatchPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
