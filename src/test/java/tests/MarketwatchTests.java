package tests;

import lib.CoreTestCase;
import lib.ui.*;
import lib.ui.factories.*;
import org.junit.Test;

public class MarketwatchTests extends CoreTestCase {
@Test
    public void marketwatchIsOpenAndTutorial() throws InterruptedException {
    LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
    LoginPageObject.clickSplashLogin();
    LoginPageObject.enterMyEmailAndPassword();
    LoginPageObject.clickLogin();

    ChoseAccountPageObject ChoseAccountPageObject = ChoseAccountPageObjectFactory.get(driver);
    ChoseAccountPageObject.clickAndGetAccountTypeAndAccountNumber("DEMO");

    MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
    MarketWatchPageObject.clickStartTutorial();
    MarketWatchPageObject.onboardingTutorialIsOpen();
    MarketWatchPageObject.swipeLeft();
    MarketWatchPageObject.secondViewPageOnboardingIsOPen();
    MarketWatchPageObject.swipeLeft();
    MarketWatchPageObject.thirdViewPageOnboardingIsOPen();
    MarketWatchPageObject.clickCloseTutorial();
    MarketWatchPageObject.marketwatchScreenIsOpen();
    MarketWatchPageObject.compareAccountIdWithIdOnBlueButton();
    MarketWatchPageObject.clickChartOnly();
    MarketWatchPageObject.onboardingTutorialForTradeScreenIsOpen1();
    MarketWatchPageObject.swipeLeft();
    MarketWatchPageObject.onboardingTutorialForTradeScreenIsOpen2();
    MarketWatchPageObject.clickCloseTutorial();

    TradeScreenPageObject TradeScreenPageObject =  TradeScreenPageObjectFactory.get(driver);
    TradeScreenPageObject.chartOnlyScreenIsOpen();
}
@Test
    public void skipTutorial() throws InterruptedException {
    LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
    ChoseAccountPageObject ChoseAccountPageObject = ChoseAccountPageObjectFactory.get(driver);
    MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
    TradeScreenPageObject TradeScreenPageObject =  TradeScreenPageObjectFactory.get(driver);
    MenuPageObject MenuPageObject = MenuPageObjectFactory.get(driver);

    LoginPageObject.clickSplashLogin();
    LoginPageObject.enterMyEmailAndPassword();
    LoginPageObject.clickLogin();
    ChoseAccountPageObject.clickAndGetAccountTypeAndAccountNumber("DEMO");
    MarketWatchPageObject.clickCloseTutorial();
    MarketWatchPageObject.marketwatchScreenIsOpen();
    MarketWatchPageObject.clickChartOnly();
    TradeScreenPageObject.chartOnlyScreenIsOpen();
    MarketWatchPageObject.guideContainerIsNotOpen();
    MenuPageObject.logOut();
    LoginPageObject.clickLogin();
    ChoseAccountPageObject.clickAndGetAccountTypeAndAccountNumber("DEMO");
    MarketWatchPageObject.marketwatchScreenIsOpen();
    MarketWatchPageObject.guideContainerIsNotOpen();
}
@Test
    public void marketwatchBidAsk() throws InterruptedException {
    LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
    ChoseAccountPageObject ChoseAccountPageObject = ChoseAccountPageObjectFactory.get(driver);
    MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
    TradeScreenPageObject TradeScreenPageObject =  TradeScreenPageObjectFactory.get(driver);

    LoginPageObject.clickSplashLogin();
    LoginPageObject.enterMyEmailAndPassword();
    LoginPageObject.clickLogin();
    ChoseAccountPageObject.clickAndGetAccountTypeAndAccountNumber("DEMO");
    MarketWatchPageObject.clickCloseTutorial();
    MarketWatchPageObject.clickAsk();
    TradeScreenPageObject.buyButtonIsInSelected();
    tapBackButton();
    TradeScreenPageObject.goToMarketwatch();
    MarketWatchPageObject.clickBid();
    TradeScreenPageObject.sellButtonIsInSelected();
}
}
