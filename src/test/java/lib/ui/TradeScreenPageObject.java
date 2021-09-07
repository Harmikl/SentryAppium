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
    QUANTITY_VALUE,
    SELL_BUTTON,
    BUY_BUTTON,
    EXECUTE_TRADE_DIALOG_LAYOUT,
    EXPIRATION_DATE_TEXT,
    EXPIRATION_DATE_VALUE,
    HORIZON_TEXT,
    HORIZON_VALUE,
    CHART_SETTINGS;





    public void chartOnlyScreenIsOpen() {
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
        this.waitForElementPresent(MENU,"Cannot find menu button",10);
        this.waitForElementPresent(BLUE_BUTTON,"Cannot find blue button",10);
        this.waitForElementPresent(TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,"Cannot find account value type on blue button",10);
        this.waitForElementPresent(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"Cannot find account value number on blue button",10);
        this.waitForElementPresent(ACCOUNT_VALUE,"Cannot find account value button",10);
        this.assertGetAttribute(STRATEGY_NAME,"text","CHART ONLY","Strategy name is not chart only",15);
    }
    public void tradeScreenIsOpen()
    {
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
    }
    public void buyButtonIsInSelected() throws InterruptedException {
        this.clickClickableElement(BUY_BUTTON,"Cannot find Buy button",20);
        this.waitTillElementBeClickable(EXECUTE_TRADE_DIALOG_LAYOUT,"Cannot find execute trade dialog");
    }
    public void sellButtonIsInSelected() throws InterruptedException {
        this.clickClickableElement(SELL_BUTTON,"Cannot find Sell button",20);
        this.waitForElementPresent(EXECUTE_TRADE_DIALOG_LAYOUT,"Cannot find execute trade dialog",20);
    }

    public void goToMarketwatch(){
        this.clickClickableElement(GO_TO_MARKETWATCH,"Cannot go to marketwatch button",15);
    }

    public void tradeScreenFor10PEURUSDIsOpen(){
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
        this.waitForElementPresent(MENU,"Cannot find menu button",10);
        this.waitForElementPresent(BLUE_BUTTON,"Cannot find blue button",10);
        this.waitForElementPresent(TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,"Cannot find account value type on blue button",10);
        this.waitForElementPresent(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"Cannot find account value number on blue button",10);
        this.waitForElementPresent(ACCOUNT_VALUE,"Cannot find account value button",10);
        this.assertGetAttribute(STRATEGY_NAME,"text","PUT","Strategy name is not PUT",10);
        this.assertGetAttribute(CURRENY_PAIR_NAME,"text","EUR/USD","Ccy pair name is not EUR/USD",10);
        this.waitForElementPresent(TRADE_SCREEN_AUTOCHARTIS_BUTTON,"Cannot find trade autochartist button", 10);
        this.waitForElementPresent(QUANTITY_MINUS,"Cannot find quantity - button", 10);
        this.waitForElementPresent(QUANTITY_PLUS,"Cannot find quantity + button", 10);
        this.waitForElementPresent(QUANTITY_VALUE,"Cannot find quantity value", 10);
        this.waitForElementPresent(SELL_BUTTON,"Cannot find sell button", 10);
        this.waitForElementPresent(BUY_BUTTON,"Cannot find buy button", 10);
        this.waitForElementPresent(EXPIRATION_DATE_TEXT,"Cannot find exp date text ", 10);
        this.waitForElementPresent(EXPIRATION_DATE_VALUE,"Cannot find exp date value ", 10);
        this.waitForElementPresent(HORIZON_TEXT,"Cannot find horizon text ", 10);
        this.waitForElementPresent(HORIZON_VALUE,"Cannot find horizon value ", 10);
        this.waitForElementPresent(CHART_SETTINGS,"Cannot find chart settings ", 10);

    }
    public void tradeScreenFor25PEURUSDIsOpen(){
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
        this.waitForElementPresent(MENU,"Cannot find menu button",10);
        this.waitForElementPresent(BLUE_BUTTON,"Cannot find blue button",10);
        this.waitForElementPresent(TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,"Cannot find account value type on blue button",10);
        this.waitForElementPresent(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"Cannot find account value number on blue button",10);
        this.waitForElementPresent(ACCOUNT_VALUE,"Cannot find account value button",10);
        this.assertGetAttribute(STRATEGY_NAME,"text","PUT","Strategy name is not PUT",15);
    }
    public void tradeScreenForDNEURUSDIsOpen(){
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
        this.waitForElementPresent(MENU,"Cannot find menu button",10);
        this.waitForElementPresent(BLUE_BUTTON,"Cannot find blue button",10);
        this.waitForElementPresent(TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,"Cannot find account value type on blue button",10);
        this.waitForElementPresent(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"Cannot find account value number on blue button",10);
        this.waitForElementPresent(ACCOUNT_VALUE,"Cannot find account value button",10);
        this.assertGetAttribute(STRATEGY_NAME,"text","STRADDLE","Strategy name is not STRADDLE",15);
    }
    public void tradeScreenFor25CEURUSDIsOpen(){
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
        this.waitForElementPresent(MENU,"Cannot find menu button",10);
        this.waitForElementPresent(BLUE_BUTTON,"Cannot find blue button",10);
        this.waitForElementPresent(TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,"Cannot find account value type on blue button",10);
        this.waitForElementPresent(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"Cannot find account value number on blue button",10);
        this.waitForElementPresent(ACCOUNT_VALUE,"Cannot find account value button",10);
        this.assertGetAttribute(STRATEGY_NAME,"text","CALL","Strategy name is not CALL",15);
    }
    public void tradeScreenFor10CEURUSDIsOpen(){
        this.waitForElementPresent(GO_TO_MARKETWATCH,"Cannot find go to marketwatch button",10);
        this.waitForElementPresent(MENU,"Cannot find menu button",10);
        this.waitForElementPresent(BLUE_BUTTON,"Cannot find blue button",10);
        this.waitForElementPresent(TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,"Cannot find account value type on blue button",10);
        this.waitForElementPresent(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"Cannot find account value number on blue button",10);
        this.waitForElementPresent(ACCOUNT_VALUE,"Cannot find account value button",10);
        this.assertGetAttribute(STRATEGY_NAME,"text","CALL","Strategy name is not CALL",15);
    }
}
