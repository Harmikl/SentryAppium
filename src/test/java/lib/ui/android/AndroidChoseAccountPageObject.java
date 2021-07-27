package lib.ui.android;

import lib.ui.ChoseAccountPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidChoseAccountPageObject extends ChoseAccountPageObject {
    public AndroidChoseAccountPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    static
    {
        HEADER="id:com.sentryd.trade:id/header";
        CLOSE_ICON="id:com.sentryd.trade:id/close_view";
        TYPE_OF_ACCOUNT_DEMO="xpath://*[contains(@text,'DEMO')]";
        TYPE_OF_ACCOUNT_REAL="xpath://*[contains(@text,'REAL')]";
        ACCOUNT_NUMBER_XPATH ="xpath://*[contains(@text,'{ACCOUNTTYPE}')]/..//*[@resource-id='com.sentryd.trade:id/tv_id']";
        CHOOSE_ACCOUNT_VIEW="xpath://android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup";

    }
}
