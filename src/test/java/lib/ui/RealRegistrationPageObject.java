package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class RealRegistrationPageObject extends MainPageObject {
    protected static String
    FIRST_NAME,
    LAST_NAME,
    NEXT1;

    public RealRegistrationPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public void enterFirstAndLastName1()
    {
        this.waitForElementAndSendKeys(FIRST_NAME,"Max","Cannot input data in first name field",40);
        this.waitForElementAndSendKeys(LAST_NAME,"Pax","Cannot input data in last name field",40);
        this.waitForElementAndClick(NEXT1,"cannot find next1 button",40);

    }

}

