package lib.ui.factories;

import lib.Platform;
import lib.ui.MenuPageObject;
import lib.ui.android.AndroidMenuPageObject;
import lib.ui.ios.IOSMenuPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MenuPageObjectFactory {
    public static MenuPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidMenuPageObject(driver);
        }else {
            return new IOSMenuPageObject(driver);
        }
    }
}
