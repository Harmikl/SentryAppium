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
        LoginPageObject.loginScreenIsOpenWithEmptyFields();

    }

    @Test
    public void demoRegistration() throws InterruptedException {
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
        MarketWatchPageObject.marketwatchScreenIsOpenForFirstLogin();
    }

    @Test
    public void realRegistrationAndTapSkip() throws InterruptedException {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashReal();
        LoginPageObject.enterEmailRegister();
        LoginPageObject.enterPasswordRegister();
        LoginPageObject.clickCreateAccount();

        RealRegistrationPageObject RealRegistrationPageObject = RealRegistrationPageObjectFactory.get(driver);
        RealRegistrationPageObject.enterData1stWebView();
        RealRegistrationPageObject.enterData2ndWebView();
        RealRegistrationPageObject.enterData3rdWebView();
        RealRegistrationPageObject.enterData4thWebView();
        RealRegistrationPageObject.enterData5thWebView();
        RealRegistrationPageObject.enterData6thWebView();
        RealRegistrationPageObject.enterData7thWebView();
        RealRegistrationPageObject.enterData8thWebView();
        RealRegistrationPageObject.enterData9thWebView();
        RealRegistrationPageObject.enterData10thWebView();
        RealRegistrationPageObject.enterData11thWebView();
        RealRegistrationPageObject.enterData12thWebView();
        RealRegistrationPageObject.enterData13thWebView();
        RealRegistrationPageObject.tapOnFinalRegisterSkip();

        MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
        MarketWatchPageObject.marketwatchScreenIsOpenForFirstLogin();
    }

    @Test
    public void realRegistrationAndTapDeposit() throws InterruptedException {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashReal();
        LoginPageObject.enterEmailRegister();
        LoginPageObject.enterPasswordRegister();
        LoginPageObject.clickCreateAccount();

        RealRegistrationPageObject RealRegistrationPageObject = RealRegistrationPageObjectFactory.get(driver);
        RealRegistrationPageObject.enterData1stWebView();
        RealRegistrationPageObject.enterData2ndWebView();
        RealRegistrationPageObject.enterData3rdWebView();
        RealRegistrationPageObject.enterData4thWebView();
        RealRegistrationPageObject.enterData5thWebView();
        RealRegistrationPageObject.enterData6thWebView();
        RealRegistrationPageObject.enterData7thWebView();
        RealRegistrationPageObject.enterData8thWebView();
        RealRegistrationPageObject.enterData9thWebView();
        RealRegistrationPageObject.enterData10thWebView();
        RealRegistrationPageObject.enterData11thWebView();
        RealRegistrationPageObject.enterData12thWebView();
        RealRegistrationPageObject.enterData13thWebView();
        RealRegistrationPageObject.tapOnFinalRegisterDepositNow();
    }

}
