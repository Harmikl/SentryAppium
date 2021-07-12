package tests;

import lib.CoreTestCase;
import lib.ui.ChoseAccountPageObject;
import lib.ui.LoginPageObject;
import lib.ui.MarketWatchPageObject;
import lib.ui.factories.ChoseAccountPageObjectFactory;
import lib.ui.factories.LoginPageObjectFactory;
import lib.ui.factories.MarketwatchPageObjectFactory;
import org.junit.Test;

public class MarketwatchTests extends CoreTestCase {
@Test
    public void pairNameIsInSelectedState() throws InterruptedException {
    LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
    LoginPageObject.clickSplashLogin();
    LoginPageObject.enterMyEmailAndPassword();
    LoginPageObject.clickLogin();

    ChoseAccountPageObject ChoseAccountPageObject = ChoseAccountPageObjectFactory.get(driver);
    ChoseAccountPageObject.chooseAccountIsOpen();
    ChoseAccountPageObject.clickDemoAccountType();

    MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
    String ccypairname = "USD/CAD";
    MarketWatchPageObject.marketwatchScreenIsOpen();
    MarketWatchPageObject.clickCloseTutorial();
    //MarketWatchPageObject.clickCcyName2();
    MarketWatchPageObject.clickCcyPairName(ccypairname);
    MarketWatchPageObject.ccyPairLineIsInSelectedState(ccypairname);
}
}
