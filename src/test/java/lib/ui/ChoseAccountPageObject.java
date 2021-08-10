package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public  class ChoseAccountPageObject extends MainPageObject{
    public ChoseAccountPageObject(RemoteWebDriver driver) {
        super(driver);
    }
    protected static String
            HEADER,
            CLOSE_ICON,
            TYPE_OF_ACCOUNT_DEMO,
            TYPE_OF_ACCOUNT_REAL,
            ACCOUNT_NUMBER_XPATH,
            CHOOSE_ACCOUNT_VIEW,
            ACCOUNT_NUMBER;

    public void chooseAccountIsOpen() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementPresent(CHOOSE_ACCOUNT_VIEW,"Choose account view is not shown",10);
        this.waitForElementPresent(HEADER,"Header is not shown",10);
        this.waitForElementPresent(CLOSE_ICON,"Close icon is not shown",10);
    }

    public void closeChooseAccountView()
    {
        this.waitForElementAndClick(CLOSE_ICON,"Cannot find close icon",10);
    }

    public void clickDemoAccountType() throws InterruptedException {
        this.waitForElementAndClick(TYPE_OF_ACCOUNT_DEMO,"Cannot find demo account type",10);
        Thread.sleep(12000);
    }

    public void clickRealAccountType() {
        this.waitForElementAndClick(TYPE_OF_ACCOUNT_REAL,"Cannot find real account type",10);
    }

    static String accountId;
    public String clickAndGetAccountTypeAndAccountNumber(String accountType){
        String accountNumberXpath = ACCOUNT_NUMBER_XPATH.replace("{ACCOUNTTYPE}",accountType);
        this.accountId = this.waitForElementAndGetAttribute(accountNumberXpath,"text","cannot get attribute in "+accountNumberXpath,10);
        this.waitForElementAndClick(accountNumberXpath,"Cannot click account type",10);
        return accountId;
    }





}

