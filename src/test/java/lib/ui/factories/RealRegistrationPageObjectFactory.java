package lib.ui.factories;

import lib.Platform;
import lib.ui.RealRegistrationPageObject;
import lib.ui.android.AndroidRealRegistrationPageObject;
import lib.ui.ios.IOSRealRegistrationPageObject;
import lib.ui.mobile_web.MWRealRegistrationPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RealRegistrationPageObjectFactory {
    public static RealRegistrationPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidRealRegistrationPageObject(driver);
        }else if (Platform.getInstance().isIOS()){
            return new IOSRealRegistrationPageObject(driver); }
        else {
            return new MWRealRegistrationPageObject(driver); }
    }
}
