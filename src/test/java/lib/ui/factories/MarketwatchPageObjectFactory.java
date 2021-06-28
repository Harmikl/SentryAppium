package lib.ui.factories;

import lib.Platform;
import lib.ui.LoginPageObject;
import lib.ui.MarketWatchPageObject;
import lib.ui.android.AndroidLoginPageObject;
import lib.ui.android.AndroidMarketwatchPageObject;
import lib.ui.ios.IOSLoginPageObject;
import lib.ui.ios.IOSMarketwatchPageObject;
import lib.ui.mobile_web.MWLoginPageObject;
import lib.ui.mobile_web.MWMarketwatchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MarketwatchPageObjectFactory {
    public static MarketWatchPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidMarketwatchPageObject(driver);
        }else if (Platform.getInstance().isIOS()){
            return new IOSMarketwatchPageObject(driver); }
        else {
            return new MWMarketwatchPageObject(driver); }
    }
}
