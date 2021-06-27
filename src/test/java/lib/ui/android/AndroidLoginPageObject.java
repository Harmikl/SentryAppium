package lib.ui.android;

import lib.ui.LoginPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidLoginPageObject extends LoginPageObject {
    static {
        SPLASH_DEMO_ACCOUNT="id:com.sentryd.trade:id/demoButton";
        SPLASH_REAL_ACCOUNT="id:com.sentryd.trade:id/realButton";
        SPLASH_LOGIN="id:com.sentryd.trade:id/loginButton";
        CLOSE_BUTTON="id:com.sentryd.trade:id/close_view";
        DEMO_TAB="xpath://android.widget.LinearLayout[@content-desc='Demo Account']/android.widget.TextView";
                REAL_TAB="xpath://android.widget.LinearLayout[@content-desc='Real Account']/android.widget.TextView";
                DESCRIPTION="id:com.sentryd.trade:id/decription_screen";
                NEW_ACCOUNT_HEADER="xpath://hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView";
                EMAIL_INPUT="id:com.sentryd.trade:id/email_et";
                PASSWORD_INPUT="id:com.sentryd.trade:id/password_et";
                SHOW_PASSWORD_ICON="id:com.sentryd.trade:id/show_password";
                CREATE_ACCOUNT="id:com.sentryd.trade:id/create_account";
    }

    public AndroidLoginPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
