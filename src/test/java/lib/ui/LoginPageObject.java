package lib.ui;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

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
    CREATE_ACCOUNT;

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


    public WebElement DemoTabIsSelected(String locator,String expected_selected, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent( locator, error_message, timeoutInSeconds);
        String actual_selected=element.getAttribute("selected");
        Assert.assertEquals(
                error_message,
                expected_selected,
                actual_selected);
        return element;
    }

    public void openDemoRegistration()
    {
         this.clickSplashDemo();
         this.DemoTabIsSelected(DEMO_TAB,"true","Demo tab is not selected",10);
         this.clickRealTab();
         this.clickDemoTab();
         this.closeRegisterView();
         this.clickSplashReal();
    }
}
