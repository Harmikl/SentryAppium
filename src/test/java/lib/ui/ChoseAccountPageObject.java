package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class ChoseAccountPageObject extends MainPageObject{
    public ChoseAccountPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    protected static String
            HEADER,
            CLOSE_ICON,
            TYPE_OF_ACCOUNT_DEMO,
            TYPE_OF_ACCOUNT_REAL,
            ACCOUNT_NUMBER,
            CHOOSE_ACCOUNT_VIEW;
    public void chooseAccountIsOpen()
    {
        this.waitForElementPresent(CHOOSE_ACCOUNT_VIEW,"Choose account view is not shown",10);
        this.waitForElementPresent(HEADER,"Header is not shown",10);
        this.waitForElementPresent(CLOSE_ICON,"Close icon is not shown",10);
        this.waitForElementPresent(ACCOUNT_NUMBER,"Account number is not shown",10);
    }

    public void closeChooseAccountView()
    {
        this.waitForElementAndClick(CLOSE_ICON,"Cannot find close icon",10);
    }

    public void clickDemoAccountType()
    {
        this.waitForElementAndClick(TYPE_OF_ACCOUNT_DEMO,"Cannot find demo account type",10);
    }

    public void clickRealAccountType()
    {
        this.waitForElementAndClick(TYPE_OF_ACCOUNT_REAL,"Cannot find real account type",10);
    }

}

