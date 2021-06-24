package lib.ui;

import io.qameta.allure.Step;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthorizationPageObject extends MainPageObject{
    private static final String
    LOGIN_BUTTON="xpath://body/div[4]/div[2]/a[text()='Log in']",
    LOGIN_INPUT="css:input[name=wpName]",
    PASSWORD_INPUT="css:input[name=wpPassword]",
    SUBMIT_BUTTON="css:button#wpLoginAttempt";

    public AuthorizationPageObject (RemoteWebDriver driver){
        super(driver);
    }

    @Step("Get and click Auth button")
    public void clickAuthButton()
    {
        this.waitTillElementBeClickable(LOGIN_BUTTON,"Cannot find auth button");
        this.waitForElementAndClick(LOGIN_BUTTON,"Cannot find and click auth button",5);
    }

    @Step("Enter '{login}' and password ")
    public void enterLoginData(String login, String password)
    {
        this.waitForElementAndSendKeys(LOGIN_INPUT,login,"Cannot find and put a login to the login input",5);
        this.waitForElementAndSendKeys(PASSWORD_INPUT,password,"Cannot find and put a password to the password input",5);
    }

    @Step("Wait and click submit button")
    public void submitForm()
    {
        this.waitForElementAndClick(SUBMIT_BUTTON, "cannot find and click submit auth button",5);
    }
}
