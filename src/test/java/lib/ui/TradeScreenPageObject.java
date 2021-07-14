package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class TradeScreenPageObject extends MainPageObject {
    public TradeScreenPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    protected static String
    GO_TO_MARKETWATCH,
    MENU,
    CLOSE_TUTORIAL,
    ONBOARDING_TUTORIAL,
    BLUE_BUTTON,
    TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,
    ACCOUNT_NUMBER_ON_BLUE_BUTTON,
    ACCOUNT_VALUE,
    ACCOUNT_VALUE_BALANCE,
    TENOR_VIEW,
    SOCKET_STATUS,
    TIME,
    CURRENY_PAIR_NAME,
    CYRRENCY_PAIR_TYPE,
    TRADE_SCREEN_AUTOCHARTIS_BUTTON,
    CHART,
    STRATEGY,
    STRATEGY_NAME,
    STRATEGY_TEXT,
    STRATEGY_INDEX_ICON,
    QUANTITY,
    QUANTITY_MINUS,
    QUANTITY_PLUS,
    QUANTITY_TEXT;





    public void chartOnlyScreenIsOpen()
    {
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
        this.waitForElementPresent(MENU,"Cannot find menu button",10);
        this.waitForElementPresent(BLUE_BUTTON,"Cannot find blue button",10);
        this.waitForElementPresent(TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,"Cannot find account value type on blue button",10);
        this.waitForElementPresent(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"Cannot find account value number on blue button",10);
        this.waitForElementPresent(ACCOUNT_VALUE,"Cannot find account value button",10);
    }




    public void tradeScreenIsOpen()
    {
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
    }
}
