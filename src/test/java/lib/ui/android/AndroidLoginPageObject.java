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
                WELCOME_TITLE="id:com.sentryd.trade:id/tv_title";
                EMAIL_LOGIN="id:com.sentryd.trade:id/edit_text_username_email";
                PASSWORD_LOGIN="id:com.sentryd.trade:id/edit_text_password";
                SHOW_PASSWORD_LOGIN="id:com.sentryd.trade:id/show_password";
                REMEMBER_USERNAME="xpath://android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.TextView";
                REMEMBER_USERNAME_TOGGLE="id:com.sentryd.trade:id/switch_remember_user";
                LOGIN="id:com.sentryd.trade:id/button_sign_in";
                FORGOT_PASSWORD="id:com.sentryd.trade:id/text_view_forgot_password";
                SIGN_UP="id:com.sentryd.trade:id/text_view_sign_up";
                ERROR_INVALID_EMAIL_FORMAT="id:com.sentryd.trade:id/decription_email";
                ERROR_INVALID_PASSWORD="id:com.sentryd.trade:id/decription_password";
                INCORRECT_LOGIN_ERROR_FOR_REAL_ACC="xpath://*[contains(@text,'Incorrect Login. Please try again or contact customer service.')]";
                INCORRECT_LOGIN_ERROR_FOR_DEMO_ACC="xpath://*[contains(@text,'Demo account expired')]";
    }

    public AndroidLoginPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
