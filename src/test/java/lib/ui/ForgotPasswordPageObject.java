package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class ForgotPasswordPageObject extends MainPageObject {
    public ForgotPasswordPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    protected static String
    CLOSE_VIEW_BUTTON,
    WELCOME_TEXT,
    FORGOT_YOUR_PASSWORD_TEXT,
    DESCRIPTION_TEXT,
    EMAIL_FORGOT_PASSWORD_INPUT,
    SUBMIT_FORGOT_PASSWORD_BUTTON,
    CANCEL_FORGOT_PASSWORD_BUTTON,
    EMAIL_SENT,
    EMAIL_SENT_DESCRIPTION,
    RETURN_TO_LOGIN;

    public void forgotPasswordViewIsOpen()
    {
        this.waitForElementPresent(CLOSE_VIEW_BUTTON, "Cannot find close icon",10);
        this.waitForElementPresent(EMAIL_FORGOT_PASSWORD_INPUT, "Cannot find email input",10);
        this.waitForElementPresent(SUBMIT_FORGOT_PASSWORD_BUTTON, "Cannot find submit button",10);
        this.waitForElementPresent(CANCEL_FORGOT_PASSWORD_BUTTON, "Cannot find cancel button",10);
        this.assertGetAttribute(WELCOME_TEXT,"text","Welcome","Cannot find Welcome text",10);
        this.assertGetAttribute(FORGOT_YOUR_PASSWORD_TEXT,"text","Forgot your password?","Cannot find forgot your password text",10);
        this.assertGetAttribute(DESCRIPTION_TEXT,"text","Enter your e-mail address below and we will send you an e-mail with a link to reset your password.","Cannot description text",10);
    }
    public void closeForgotPasswordView()
    {
        this.waitForElementAndClick(CLOSE_VIEW_BUTTON,"Cannot click close icon",10);
    }

    public void clickCancelButton()
    {
        this.waitForElementAndClick(CANCEL_FORGOT_PASSWORD_BUTTON,"Cannot click cancel button",10);
    }
    public void enterEmailInEmailInput()
    {
        this.waitForElementAndSendKeys(EMAIL_FORGOT_PASSWORD_INPUT,"Harmikl57@gmail.com","Cannot enter email in input field",10);
    }
    public void clickSubmitButton()
    {
        this.waitForElementAndClick(SUBMIT_FORGOT_PASSWORD_BUTTON,"Cannot click submit button", 10);
    }
    public void emailIsSent() throws InterruptedException {
        Thread.sleep(1000);
        this.assertGetAttribute(EMAIL_SENT,"text","Email Sent","Cannot find 'Email sent'",10);
        this.assertGetAttribute(EMAIL_SENT_DESCRIPTION,"text","Thank you. We have sent you an email with instructions for resetting your password.","Cannot find Email sent description",10);
    }
    public void clickReturnToLogin()
    {
        this.waitForElementAndClick(RETURN_TO_LOGIN,"Cannot click return to login",10);
    }
}

