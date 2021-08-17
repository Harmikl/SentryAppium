package lib.ui;

import lib.ui.mobile_web.MWMarketwatchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class TradeScreenPageObject extends MainPageObject {
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
    QUANTITY_TEXT,
    SELL_BUTTON,
    BUY_BUTTON,
    EXECUTE_TRADE_DIALOG_LAYOUT;





    public void chartOnlyScreenIsOpen() {
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
    public void buyButtonIsInSelected() throws InterruptedException {
        Thread.sleep(4000);
        this.clickClickableElement(BUY_BUTTON,"Cannot find Buy button",20);
        this.waitTillElementBeClickable(EXECUTE_TRADE_DIALOG_LAYOUT,"Cannot find execute trade dialog");
    }
    public void sellButtonIsInSelected() throws InterruptedException {
        Thread.sleep(2000);
//        MarketWatchPageObject MarketWatchPageObject = new MWMarketwatchPageObject(driver);
//        int number_of_click ;
//        for (number_of_click=0,number_of_click<5,number_of_click++){
//            MarketWatchPageObject.clickBid();
//            System.out.println(number_of_click);
//            if (this.waitForElementPresent(SELL_BUTTON, "Sell button is appeared",10)){
//                return;
//            }
//        }
//        if (this.waitForElementNotPresent(SELL_BUTTON, "Sell button is appeared",10)){
//            MarketWatchPageObject.clickBid();
//        }
        this.waitForElementAndClick(SELL_BUTTON,"Cannot find Sell button",20);
        this.waitForElementPresent(EXECUTE_TRADE_DIALOG_LAYOUT,"Cannot find execute trade dialog",20);
    }

    public void goToMarketwatch(){
        this.waitForElementAndClick(GO_TO_MARKETWATCH,"Cannot go to marketwatch button",20);
    }
}
