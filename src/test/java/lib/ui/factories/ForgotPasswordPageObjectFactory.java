package lib.ui.factories;

import lib.Platform;
import lib.ui.ForgotPasswordPageObject;
import lib.ui.android.AndroidForgotPasswordPageObject;
import lib.ui.ios.IOSForgotPasswordPageObject;
import lib.ui.mobile_web.MWForgotPasswordPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ForgotPasswordPageObjectFactory {
    public static ForgotPasswordPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidForgotPasswordPageObject(driver);
        }else if (Platform.getInstance().isIOS()){
            return new IOSForgotPasswordPageObject(driver);
        }else {
            return new MWForgotPasswordPageObject(driver);
        }
    }
}
