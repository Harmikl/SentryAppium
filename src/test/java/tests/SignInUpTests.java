package tests;

import lib.CoreTestCase;
import lib.ui.*;
import lib.ui.factories.*;
import org.junit.Test;

public class SignInUpTests extends CoreTestCase {
    @Test
    public void openDemoRealAndLoin() {
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
        LoginPageObject.clickSignUpLogin();
        LoginPageObject.realRegistrationScreenIsOpen();
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
        MarketWatchPageObject.clickSkipTutorial();
        MarketWatchPageObject.marketwatchScreenIsOpen();
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
        MarketWatchPageObject.clickSkipTutorial();
        MarketWatchPageObject.marketwatchScreenIsOpen();
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
        RealRegistrationPageObject.depositWebViewIsOpen();
        RealRegistrationPageObject.closeDepositWebView();

        MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
        MarketWatchPageObject.clickSkipTutorial();
        MarketWatchPageObject.marketwatchScreenIsOpen();
    }

    @Test
    public void forgotPassword() throws InterruptedException {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashLogin();
        LoginPageObject.clickForgotPassword();

        ForgotPasswordPageObject ForgotPasswordPageObject = ForgotPasswordPageObjectFactory.get(driver);
        ForgotPasswordPageObject.forgotPasswordViewIsOpen();

        ForgotPasswordPageObject.closeForgotPasswordView();
        LoginPageObject.loginScreenIsOpenWithEmptyFields();

        LoginPageObject.clickForgotPassword();
        ForgotPasswordPageObject.forgotPasswordViewIsOpen();

        ForgotPasswordPageObject.clickCancelButton();
        LoginPageObject.loginScreenIsOpenWithEmptyFields();

        LoginPageObject.clickForgotPassword();
        ForgotPasswordPageObject.forgotPasswordViewIsOpen();

        tapBackButton();
        LoginPageObject.loginScreenIsOpenWithEmptyFields();

        LoginPageObject.clickForgotPassword();
        ForgotPasswordPageObject.enterEmailInEmailInput();
        ForgotPasswordPageObject.clickSubmitButton();
        ForgotPasswordPageObject.emailIsSent();
        ForgotPasswordPageObject.clickReturnToLogin();

        LoginPageObject.loginScreenIsOpenWithEmptyFields();
    }
    @Test
    public void loginWithRealDemoAccount() throws InterruptedException {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashLogin();
        LoginPageObject.enterMyEmailAndPassword();
        LoginPageObject.clickLogin();

        ChoseAccountPageObject ChoseAccountPageObject = ChoseAccountPageObjectFactory.get(driver);
        ChoseAccountPageObject.chooseAccountIsOpen();
        ChoseAccountPageObject.clickDemoAccountType();

        MarketWatchPageObject MarketWatchPageObject = MarketwatchPageObjectFactory.get(driver);
        MarketWatchPageObject.clickStartTutorial();
        MarketWatchPageObject.onboardingTutorialIsOpen();
    }
    @Test
    public void invalidCredentialsErrors() throws InterruptedException {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashLogin();
        LoginPageObject.enterIncorrectRealEmail();
        LoginPageObject.clickLogin();
        LoginPageObject.IncorrectLoginErrorForRealAccIsShown();
        tapBackButton();
        LoginPageObject.enterIncorrectDemoEmail();
        LoginPageObject.clickLogin();
        LoginPageObject.IncorrectLoginErrorForDemoAccIsShown();
        tapBackButton();
        tapBackButton();
    }
    @Test
    public void registrationIncomplete() throws InterruptedException {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.clickSplashLogin();
        LoginPageObject.enterIncompleteRegistrationEmail();
        LoginPageObject.clickLogin();

        RealRegistrationPageObject RealRegistrationPageObject = RealRegistrationPageObjectFactory.get(driver);
        RealRegistrationPageObject.realRegistrationWebviewIsOpen();
    }
}
