package lib.ui.factories;

import lib.Platform;
import lib.ui.TradeScreenPageObject;
import lib.ui.android.AndroidTradeScreenPageObject;
import lib.ui.ios.IOSTradeScreenPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TradeScreenPageObjectFactory {
    public static TradeScreenPageObject get(RemoteWebDriver driver){
        if (Platform.getInstance().isAndroid()){
            return new AndroidTradeScreenPageObject(driver);
        }else {
            return new IOSTradeScreenPageObject(driver);
        }
    }
}
