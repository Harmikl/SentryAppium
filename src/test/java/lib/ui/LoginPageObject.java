package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

import static lib.ui.StaticUtils.*;

abstract public class LoginPageObject extends MainPageObject{
    protected static String
    SPLASH_DEMO_ACCOUNT,
    SPLASH_REAL_ACCOUNT,
    SPLASH_LOGIN,
    CLOSE_BUTTON,
    DEMO_TAB,
    REAL_TAB,
    DESCRIPTION,
    NEW_ACCOUNT_HEADER,
    EMAIL_INPUT,
    PASSWORD_INPUT,
    SHOW_PASSWORD_ICON,
    CREATE_ACCOUNT,
    WELCOME_TITLE,
    EMAIL_LOGIN,
    PASSWORD_LOGIN,
    SHOW_PASSWORD_LOGIN,
    REMEMBER_USERNAME,
    REMEMBER_USERNAME_TOGGLE,
    LOGIN,
    FORGOT_PASSWORD,
    SIGN_UP,
    ERROR_INVALID_EMAIL_FORMAT,
    ERROR_INVALID_PASSWORD,
    INCORRECT_LOGIN_ERROR_FOR_REAL_ACC,
    INCORRECT_LOGIN_ERROR_FOR_DEMO_ACC,
    LOADING_DIALOG;

    public LoginPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
    public void clickSplashDemo()
    {
       this.waitForElementAndClick(SPLASH_DEMO_ACCOUNT, "Cannot find and click splash demo button",10);
    }
    public void clickSplashReal()
    {
          this.waitForElementAndClick(SPLASH_REAL_ACCOUNT, "Cannot find and click splash real button",10);
    }
    public void clickSplashLogin()
    {
          this.waitForElementAndClick(SPLASH_LOGIN, "Cannot find and click splash login button",10);
    }

    public void closeRegisterView()
    {
        this.waitForElementAndClick(CLOSE_BUTTON,"Cannot find and click close button",5);
    }

    public void clickRealTab()
    {
        this.waitForElementAndClick(REAL_TAB,"Cannot find and click real tab button",15);
    }

    public void clickDemoTab()
    {
        this.waitForElementAndClick(DEMO_TAB,"Cannot find and click demo tab button",15);
    }


    public void demoTabIsSelected() {
        this.assertGetAttribute(DEMO_TAB, "selected", "true", "Demo tab is not selected", 10);
    }

    public void realTabIsSelected() {
        this.assertGetAttribute(REAL_TAB, "selected", "true", "Real tab is not selected", 10);
    }

    public void descriptionIsShown()
    {
        this.assertGetAttribute(DESCRIPTION, "text", "You are opening an account with the appropriate regulated entity of Ava Trade according to your country of residence.",
                "Description is not shown", 10);
    }

    public void emailAndPasswordHintsAreShown()
    {
        this.assertGetAttribute(EMAIL_INPUT,"text","Email","Cannot find email hint in email input",10);
        this.assertGetAttribute(PASSWORD_INPUT,"text","Password","Cannot find password hint in password input",10);
    }

    public void loginEmailAndPasswordHintsAreShown()
    {
        this.assertGetAttribute(EMAIL_LOGIN,"text","Username or Email","Cannot find email hint in email input",10);
        this.assertGetAttribute(PASSWORD_LOGIN,"text","Password","Cannot find password hint in password input",10);
    }


    public void enterEmailRegister()
    {
        this.waitForElementAndSendKeys(EMAIL_INPUT, GENERATED_EMAIL,"Cannot enter email in input field",10);
    }

    public void enterPasswordRegister()
    {
        this.waitForElementAndSendKeys(PASSWORD_INPUT,PASSWORD,"Cannot enter password in input field",10);
    }

    public void enterMyEmailAndPassword()
    {
        this.waitForElementAndSendKeys(EMAIL_LOGIN,MY_EMAIL,"Cannot enter email in email input",10);
        this.waitForElementAndSendKeys(PASSWORD_LOGIN,MY_PASSWORD,"Cannot enter password in password input",10);
    }

    public void clickLogin() throws InterruptedException {
        this.waitForElementAndClick(LOGIN,"Cannot click login button",10);
        Thread.sleep(3000);
    }

    public void clickCreateAccount()
    {
        this.waitForElementAndClick(CREATE_ACCOUNT,"Cannot find create account button",10);
    }

    public void errorInvalidEmailIsShown()
    {
        this.assertGetAttribute(ERROR_INVALID_EMAIL_FORMAT,"text","Invalid email address format","Cannot find error invalid email",10);
    }

    public void errorInvalidPasswordIsShown()
    {
        this.assertGetAttribute(ERROR_INVALID_PASSWORD,"text",
                "Please create password not shorter than 6 symbols, containing at least 1 number and 1 upper case letter. Special symbols are allowed.",
                "Cannot find error invalid password",
                10);
    }

    public void emilExistErrorIsShown()
    {
        this.assertGetAttribute(ERROR_INVALID_EMAIL_FORMAT,"text",
                "Email has registered, please log in or use a different email address.",
                "Cannot find email exist error",
                10);
    }

    public void enterExistingEmail()
    {
        this.waitForElementAndSendKeys(EMAIL_INPUT,EXISTING_EMAIL,"Cannot enter exist email",10);
    }

    public void clickSignUpLogin()
    {
        this.waitForElementAndClick(SIGN_UP,"Cannot find and click Sign up button on login",10);
    }
    public void clickForgotPassword()
    {
        this.waitForElementAndClick(FORGOT_PASSWORD,"Cannot find and click forgot password on login screen",10);
    }
    public void enterIncorrectRealEmail()
    {
        this.waitForElementAndSendKeys(EMAIL_LOGIN,INCORRECT_REAL_EMAIL,"Cannot enter email in email input",10);
        this.waitForElementAndSendKeys(PASSWORD_LOGIN,MY_PASSWORD,"Cannot enter password in password input",10);
    }
    public void enterIncorrectDemoEmail()
    {
        this.waitForElementAndSendKeys(EMAIL_LOGIN,INCORRECT_DEMO_EMAIL,"Cannot enter email in email input",10);
        this.waitForElementAndSendKeys(PASSWORD_LOGIN,PASSWORD,"Cannot enter password in password input",10);
    }

    public void enterIncompleteRegistrationEmail()
    {
        this.waitForElementAndSendKeys(EMAIL_LOGIN,INCOMPLETE_REGISTER_EMAIL,"Cannot enter email in email input",10);
        this.waitForElementAndSendKeys(PASSWORD_LOGIN,PASSWORD,"Cannot enter password in password input",10);
    }

    public void IncorrectLoginErrorForRealAccIsShown()
    {
        this.waitForElementPresent(INCORRECT_LOGIN_ERROR_FOR_REAL_ACC,"Cannot find error for incorrect real email",15);
    }
    public void IncorrectLoginErrorForDemoAccIsShown()
    {
        this.waitForElementPresent(INCORRECT_LOGIN_ERROR_FOR_DEMO_ACC,"Cannot find error for incorrect real email",15);
    }
    public void LoadingDialogIsOpen()
    {
        this.waitForElementPresent(LOADING_DIALOG, "dialog is not shown",10);
    }

    public void demoRegistrationScreenIsOpen() {
        this.demoTabIsSelected();
        this.emailAndPasswordHintsAreShown();
        this.waitForElementPresent(EMAIL_INPUT,"cannot find email input",10);
        this.waitForElementPresent(PASSWORD_INPUT,"cannot find password input",10);
        this.waitForElementPresent(SHOW_PASSWORD_ICON,"Cannot find showv password icon",10);
        this.waitForElementPresent(CLOSE_BUTTON,"cannot find close button",10);
        this.waitForElementPresent(NEW_ACCOUNT_HEADER,"cannot find new account header",10);
        this.waitForElementPresent(CREATE_ACCOUNT,"cannot find create account button",10);
        this.descriptionIsShown();
    }

    public void realRegistrationScreenIsOpen()
    {
        this.realTabIsSelected();
        this.emailAndPasswordHintsAreShown();
        this.waitForElementPresent(EMAIL_INPUT,"cannot find email input",10);
        this.waitForElementPresent(PASSWORD_INPUT,"cannot find password input",10);
        this.waitForElementPresent(SHOW_PASSWORD_ICON,"Cannot find showv password icon",10);
        this.waitForElementPresent(CLOSE_BUTTON,"cannot find close button",10);
        this.waitForElementPresent(NEW_ACCOUNT_HEADER,"cannot find new account header",10);
        this.waitForElementPresent(CREATE_ACCOUNT,"cannot find create account button",10);
        this.descriptionIsShown();
    }

    public void loginScreenIsOpenWithEmptyFields()
    {
        this.waitForElementPresent(WELCOME_TITLE,"Cannot find welcome title",10);
        this.waitForElementPresent(EMAIL_LOGIN,"Cannot find login input",10);
        this.waitForElementPresent(PASSWORD_LOGIN,"Cannot find password input",10);
        this.waitForElementPresent(SHOW_PASSWORD_LOGIN,"Cannot find show password",10);
        this.loginEmailAndPasswordHintsAreShown();
        this.waitForElementPresent(REMEMBER_USERNAME,"Cannot find remember username text",10);
        this.waitForElementPresent(REMEMBER_USERNAME_TOGGLE,"Cannot find remember username toggle",10);
        this.assertGetAttribute(REMEMBER_USERNAME,"text","Remember username","Cannot find remember username",10);
        this.waitForElementPresent(LOGIN,"Cannot find login button",10);
        this.waitForElementPresent(FORGOT_PASSWORD,"Cannot find forgot password button",10);
        this.waitForElementPresent(SIGN_UP,"Cannot find sign up button",10);
    }
}
