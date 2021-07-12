package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class TradeScreenPageObject extends MainPageObject {
    public TradeScreenPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    protected static String
    GO_TO_MARKETWATCH;

    public void tradeScreenIsOpen()
    {
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
    }
}
