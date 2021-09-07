package lib.ui.android;

import lib.ui.MarketWatchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMarketwatchPageObject extends MarketWatchPageObject {
    static{
                MENU="id:com.sentryd.trade:id/logo";
        START_TUTORIAL="id:com.sentryd.trade:id/start_tutorial";
        SKIP_TUTORIAL="id:com.sentryd.trade:id/skip_tutorial";
        CLOSE_TUTORIAL="xpath:/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView";
        ONBOARDING_TUTORIAL="xpath://android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup";
        TEXT_TUTORIAL_1 ="xpath://*[contains(@text,'Click any price to move to trading')]";
        TEXT_TUTORIAL_2 ="xpath://*[contains(@text,'Swipe the right panel for additional information, and Choose a Product')]";
        TEXT_TUTORIAL_3 ="xpath://*[contains(@text,'Highlight a product and choose any option tenor')]";
        TEXT_TUTORIAL_FOR_TRADE_SCREEN_1 ="xpath://*[contains(@text,'Go back to Market Watch')]";
        TEXT_TUTORIAL_FOR_TRADE_SCREEN_2 ="xpath://*[contains(@text,'Choose your trading strategy')]";
        GUIDE_CONTAINER = "id:com.sentryd.trade:id/guide_container";
        BLUE_BUTTON="id:com.sentryd.trade:id/acc_layout";
        TYPE_OF_ACCOUNT_ON_BLUE_BUTTON="id:com.sentryd.trade:id/tv_acc_title";
        ACCOUNT_NUMBER_ON_BLUE_BUTTON="id:com.sentryd.trade:id/tv_acc_descr";
        ACCOUNT_VALUE="xpath://*[contains(@text,'ACCOUNT VALUE')]";
        ACCOUNT_VALUE_BALANCE="id:com.sentryd.trade:id/balance";
        TENOR_VIEW="id:com.sentryd.trade:id/spot_tenor_view";
        SOCKET_STATUS="id:com.sentryd.trade:id/socket_status";
        TIME="id:com.sentryd.trade:id/time";
        EDIT_FAVORITES_ICON="id:com.sentryd.trade:id/config_market_watch";
        FAVORITES_GROUP_NAME="id:com.sentryd.trade:id/group_name";
        ASK_COLUMN_TITLE="xpath://*[contains(@text,'Ask')]";
        BID_COLUMN_TITLE="xpath://*[contains(@text,'Bid')]";
        CCY_PAIR_NAME ="xpath://*[contains(@text,'{PAIRNAME}')]";
        CCY_PAIR_NAME2="xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView";
        CHART_ONLY="xpath://android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]";
        VIEW_PAGER_1_HIGH="xpath://*[contains(@text,'High')]";
        VIEW_PAGER_1_LOW="xpath://*[contains(@text,'Low')]";
        VIEW_PAGER_1_CLOSE="xpath://*[contains(@text,'Close')]";
        VIEW_PAGER_1_INDICATOR="xpath://android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[1]";
        VIEW_PAGER_1_ITEM="xpath://android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.View";
        VIEW_PAGER_2_CURRENT="xpath://*[contains(@text,'Current')]";
        VIEW_PAGER_2_WEEK_AGO="xpath://*[contains(@text,'Week ago')]";
        VIEW_PAGER_2_MONTH_AGO="xpath://*[contains(@text,'Month ago')]";
        VIEW_PAGER_2_CHART_VIEW="id:com.sentryd.trade:id/volChartView";
        VIEW_PAGER_2_INDICATOR="xpath://android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[2]";
        VIEW_PAGER_3_10P="id:com.sentryd.trade:id/tv_label_1";
        VIEW_PAGER_3_10P_EURUSD="xpath://android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView[1]";
        VIEW_PAGER_3_25P="id:com.sentryd.trade:id/tv_label_2";
        VIEW_PAGER_3_25P_EURUSD = "xpath://android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView[2]";
        VIEW_PAGER_3_DN="id:com.sentryd.trade:id/tv_label_3";
        VIEW_PAGER_3_DN_EURUSD="xpath://android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView[3]";
        VIEW_PAGER_3_25C="id:com.sentryd.trade:id/tv_label_4";
        VIEW_PAGER_3_25C_EURUSD = "xpath://android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView[4]";
        VIEW_PAGER_3_10C="id:com.sentryd.trade:id/tv_label_5";
        VIEW_PAGER_3_10C_EURUSD = "xpath://android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView[5]";
        VIEW_PAGER_3_INDICATOR="xpath://android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[3]";
        VIEW_PAGER_3_ITEM="xpath://androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView";
        VIEW_PAGER_4_INTERVAL ="xpath://*[contains(@text,'Interval')]";
        VIEW_PAGER_4_PATTERN_NAME="xpath://*[contains(@text,'Pattern Name')]";
        VIEW_PAGER_4_QUALITY="xpath://*[contains(@text,'Quality')]";
        VIEW_PAGER_4_FULL_VIEW="xpath://android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]";
        VIEW_PAGER_4_SIGNALS="xpath://androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]";
        VIEW_PAGER_4_INDICATOR="xpath://android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[4]";
        VIEW_PAGER_5_LOTS_SIZE="xpath://*[contains(@text,'Lots Size')]";
        VIEW_PAGER_5_ONE_PIP="xpath://*[contains(@text,'One Pip')]";
        VIEW_PAGER_5_SPOT_L="xpath://*[contains(@text,'Spot L')]";
        VIEW_PAGER_5_OPTION_L="xpath://*[contains(@text,'Option L')]";
        VIEW_PAGER_5_ITEM="xpath://androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView";
        VIEW_PAGER_5_INDICATOR="xpath://android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[5]";
        VIEW_PAGER_6_INTEREST_LONG= "xpath://*[contains(@text,'Interest Long')]";
        VIEW_PAGER_6_INTEREST_SHORT= "xpath://*[contains(@text,'Interest Short')]";
        VIEW_PAGER_6_SPOT_TOLERANCE= "xpath://*[contains(@text,'Spot Tolerance')]";
        VIEW_PAGER_6_OPTION_TOLERANCE = "xpath://*[contains(@text,'Option Tolerance')]";
        VIEW_PAGER_6_ITEM="xpath://android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView";
        VIEW_PAGER_6_INDICATOR = "xpath://android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[6]";
    }


    public AndroidMarketwatchPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
