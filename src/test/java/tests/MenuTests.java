package tests;

import lib.CoreTestCase;
import lib.ui.ChoseAccountPageObject;
import lib.ui.LoginPageObject;
import lib.ui.MarketWatchPageObject;
import lib.ui.MenuPageObject;
import lib.ui.factories.ChoseAccountPageObjectFactory;
import lib.ui.factories.LoginPageObjectFactory;
import lib.ui.factories.MarketwatchPageObjectFactory;
import lib.ui.factories.MenuPageObjectFactory;
import org.junit.Test;

public class MenuTests extends CoreTestCase {

    @Test
    public void compareAccountId()  {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashLogin();
        LoginPageObject.enterMyEmailAndPassword();
        LoginPageObject.clickLogin();

        ChoseAccountPageObject ChoseAccountPageObject = ChoseAccountPageObjectFactory.get(driver);
        ChoseAccountPageObject.clickAndGetAccountTypeAndAccountNumber("DEMO");

        MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
        MarketWatchPageObject.clickSkipTutorial();
        MarketWatchPageObject.marketwatchScreenIsOpen();

        MenuPageObject MenuPageObject =  MenuPageObjectFactory.get(driver);
        MenuPageObject.openMenu();
        MenuPageObject.compareAccountNumberFromChooseAccountAndMenu();
//        MenuPageObject.closeMenu();
//        MenuPageObject.openMenu();
        MenuPageObject.swipeUp(200);
        MenuPageObject.appVersionIsRight("2.140.0");
        MenuPageObject.clickLogOut();


    }
}
