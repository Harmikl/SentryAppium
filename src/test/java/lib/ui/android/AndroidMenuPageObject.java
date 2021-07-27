package lib.ui.android;

import lib.ui.MenuPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMenuPageObject extends MenuPageObject {
    public AndroidMenuPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    static {
        MENU="xpath://*android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView";
                MENU_ACCOUNT_TYPE="id:com.sentryd.trade:id/tv_acc_title";
                MENU_ACCOUNT_ID="id:com.sentryd.trade:id/bot_text_header";
                MENU_OPEN_REAL_ACCOUNT="xpath://*[contains(@text,'Open Real Account')]";
                MUNU_MY_ACCOUNT="xpath://*[contains(@text,'My Account')]";
                MENU_INBOX="xpath://*[contains(@text,'Inbox')]";
                MENU_TRADER_TOOLS="xpath://*[contains(@text,'Trader Tools')]";
                MENU_TRADER_TOOLS_ECONOMIC_CALENDAR="xpath://*[contains(@text,'Economic Calendar')]";
                MENU_TRADER_TOOLS_AUTOCHARTIST="xpath://*[contains(@text,'AutoChartist')]";
                MENU_TUTORIALS="xpath://*[contains(@text,'Tutorials')]";
                MENU_CONTACT_US="xpath://*[contains(@text,'Contact Us')]";
                MENU_EDIT_FAVORITE="xpath://*[contains(@text,'Edit Favourites')]";
                MENU_VIDEOS="xpath://*[contains(@text,'Videos')]";
                MENU_STRATEGY_GUIDE="xpath://*[contains(@text,'Strategy Guide')]";
                MENU_LOGOUT="xpath://*[contains(@text,'Log Out')]";
                MENU_DEPOSIT="xpath://*[contains(@text,'Deposit')]";
                MENU_WITHDRAWAL="xpath://*[contains(@text,'Withdrawal')]";
                MENU_UPLOAD_DOCUMENTS="xpath://*[contains(@text,'Upload Documents')]";
                MENU_CLOSE="id=com.sentryd.trade:id/close_view";
                APP_VERSION="id:com.sentryd.trade:id/version";
    }
}
