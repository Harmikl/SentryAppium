package tests;

import lib.CoreTestCase;
import lib.ui.LoginPageObject;
import lib.ui.MarketWatchPageObject;
import lib.ui.RealRegistrationPageObject;
import lib.ui.factories.LoginPageObjectFactory;
import lib.ui.factories.MarketwatchPageObjectFactory;
import lib.ui.factories.RealRegistrationPageObjectFactory;
import org.junit.Test;

public class SignInUpTests extends CoreTestCase {
    @Test
    public void openDemoRealAndLoin()
    {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashDemo();
        LoginPageObject.demoRegistrationScreenIsOpen();
        LoginPageObject.closeRegisterView();
        LoginPageObject.clickSplashReal();
        LoginPageObject.realRegistrationScreenIsOpen();
        LoginPageObject.clickDemoTab();
        LoginPageObject.demoRegistrationScreenIsOpen();
        LoginPageObject.closeRegisterView();
        LoginPageObject.clickSplashLogin();
        LoginPageObject.loginScreenIsOpen();

    }

    @Test
    public void demoRegistration()
    {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashDemo();

        LoginPageObject.clickCreateAccount();
        LoginPageObject.errorInvalidEmailIsShown();

        LoginPageObject.enterEmailRegister();
        LoginPageObject.clickCreateAccount();
        LoginPageObject.errorInvalidPasswordIsShown();

        LoginPageObject.enterExistingEmail();
        LoginPageObject.clickCreateAccount();
        LoginPageObject.emilExistErrorIsShown();

        LoginPageObject.enterEmailRegister();
        LoginPageObject.enterPasswordRegister();
        LoginPageObject.clickCreateAccount();

        MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
        MarketWatchPageObject.marketwatchScreenIsOpen();
    }

    @Test
    public void realRegistration()
    {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashReal();
        LoginPageObject.enterEmailRegister();
        LoginPageObject.enterPasswordRegister();
        LoginPageObject.clickCreateAccount();

        RealRegistrationPageObject RealRegistrationPageObject = RealRegistrationPageObjectFactory.get(driver);
        RealRegistrationPageObject.enterData1stWebView();
        RealRegistrationPageObject.enterData2ndWebView();
        RealRegistrationPageObject.enterData3rdWebView();


    }

}
