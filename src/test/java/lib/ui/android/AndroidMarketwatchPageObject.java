package lib.ui.android;

import lib.ui.MarketWatchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMarketwatchPageObject extends MarketWatchPageObject {
    static{
                MENU="id:com.sentryd.trade:id/logo";
        START_TUTORIAL="id:com.sentryd.trade:id/start_tutorial";

    }


    public AndroidMarketwatchPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
