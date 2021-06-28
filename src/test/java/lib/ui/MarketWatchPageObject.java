package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class MarketWatchPageObject extends MainPageObject {
    protected static String
    MENU,
    START_TUTORIAL,
    BLUE_BUTTON,
    ACCOUNT_VALUE;

    public void marketwatchScreenIsOpen()
    {
        this.waitForElementPresent(START_TUTORIAL,"Cannot find Start tutorial button",120);
        //this.waitForElementPresent(MENU,"Cannot find menu button",60);
    }
    public MarketWatchPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
