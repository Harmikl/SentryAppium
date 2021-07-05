package lib.ui.android;

import lib.ui.ForgotPasswordPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidForgotPasswordPageObject extends ForgotPasswordPageObject {
    public AndroidForgotPasswordPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    static {
                CLOSE_VIEW_BUTTON="id:com.sentryd.trade:id/close_view";
                WELCOME_TEXT="xpath://android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View";
                FORGOT_YOUR_PASSWORD_TEXT="xpath://*[contains(@text,'Forgot your password?')]";
                DESCRIPTION_TEXT="xpath://android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]/android.view.View[2]/android.view.View[3]";
                EMAIL_FORGOT_PASSWORD_INPUT="xpath://android.view.View/android.view.View[7]/android.view.View[2]/android.view.View[5]/android.view.View[2]/android.view.View/android.widget.EditText";
                SUBMIT_FORGOT_PASSWORD_BUTTON="xpath://*[contains(@text,'Submit')]";
                CANCEL_FORGOT_PASSWORD_BUTTON="xpath://*[contains(@text,'Cancel')]";
                EMAIL_SENT="xpath://*[contains(@text,'Email Sent')]";
                EMAIL_SENT_DESCRIPTION="xpath://android.webkit.WebView/android.view.View/android.view.View[9]/android.view.View[6]";
                RETURN_TO_LOGIN="xpath://android.webkit.WebView/android.view.View/android.view.View[12]/android.widget.Button";
    }
}
