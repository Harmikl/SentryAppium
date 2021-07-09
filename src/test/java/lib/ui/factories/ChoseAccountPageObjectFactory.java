package lib.ui.factories;

import lib.Platform;
import lib.ui.ChoseAccountPageObject;
import lib.ui.android.AndroidChoseAccountPageObject;
import lib.ui.ios.IOSChoseAccountPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChoseAccountPageObjectFactory {
    public static ChoseAccountPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidChoseAccountPageObject(driver);
        }else {
            return new IOSChoseAccountPageObject(driver);
     }
    }
}
