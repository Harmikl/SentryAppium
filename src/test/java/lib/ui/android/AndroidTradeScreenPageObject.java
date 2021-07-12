package lib.ui.android;

import lib.ui.TradeScreenPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidTradeScreenPageObject extends TradeScreenPageObject {
    public AndroidTradeScreenPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    static {
        GO_TO_MARKETWATCH="id:com.sentryd.trade:id/pair_name";
    }
}
