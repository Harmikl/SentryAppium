package tests;

import lib.CoreTestCase;
import lib.ui.ChoseAccountPageObject;
import lib.ui.LoginPageObject;
import lib.ui.MarketWatchPageObject;
import lib.ui.TradeScreenPageObject;
import lib.ui.factories.ChoseAccountPageObjectFactory;
import lib.ui.factories.LoginPageObjectFactory;
import lib.ui.factories.MarketwatchPageObjectFactory;
import lib.ui.factories.TradeScreenPageObjectFactory;
import org.junit.Test;

public class MarketwatchTests extends CoreTestCase {
@Test
    public void marketwatchIsOpen() throws InterruptedException {
    LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
    LoginPageObject.clickSplashLogin();
    LoginPageObject.enterMyEmailAndPassword();
    LoginPageObject.clickLogin();

    ChoseAccountPageObject ChoseAccountPageObject = ChoseAccountPageObjectFactory.get(driver);
    ChoseAccountPageObject.chooseAccountIsOpen();
    ChoseAccountPageObject.clickDemoAccountType();

    //LoginPageObject.LoadingDialogIsOpen();

    MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
    MarketWatchPageObject.clickSkipTutorial();
    MarketWatchPageObject.marketwatchScreenIsOpen();
    MarketWatchPageObject.clickChartOnly();

    TradeScreenPageObject TradeScreenPageObject = TradeScreenPageObjectFactory.get(driver);
    TradeScreenPageObject.chartOnlyScreenIsOpen();
}
}
