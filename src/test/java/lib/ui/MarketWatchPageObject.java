package lib.ui;

import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class MarketWatchPageObject extends MainPageObject {
    protected static String
    MENU,
    START_TUTORIAL,
    CLOSE_TUTORIAL,
    SKIP_TUTORIAL,
    ONBOARDING_TUTORIAL,
    TEXT_TUTORIAL_ON_FIRST_PAGE,
    BLUE_BUTTON,
    TYPE_OF_ACCOUNT_ON_BLUE_BUTTON,
    ACCOUNT_NUMBER_ON_BLUE_BUTTON,
    ACCOUNT_VALUE,
    ACCOUNT_VALUE_BALANCE,
    TENOR_VIEW,
    SOCKET_STATUS,
    TIME,
    EDIT_FAVORITES_ICON,
    FAVORITES_GROUP_NAME,
    ASK_COLUMN_TITLE,
    BID_COLUMN_TITLE,
    CCY_PAIR_NAME,
    CCY_PAIR_NAME2,
    CHART_ONLY;



    public MarketWatchPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public void marketwatchScreenIsOpen() {
    this.waitForElementPresent(BLUE_BUTTON,"cannot find blue button",30);
    }
    public void clickStartTutorial()
    {
        this.waitForElementAndClick(START_TUTORIAL,"Cannot find Start tutorial button",120);
    }
    public void clickSkipTutorial()  {
        this.waitForElementAndClick(SKIP_TUTORIAL,"Cannot find and click Skip tutorial button",60);
    }
    public void clickCloseTutorial()
    {
        this.waitForElementAndClick(CLOSE_TUTORIAL,"Cannot find Start tutorial button",120);
    }
    public void onboardingTutorialIsOpen()
    {
        this.waitForElementPresent(ONBOARDING_TUTORIAL,"Cannot find  tutorial ",120);
        this.waitForElementPresent(TEXT_TUTORIAL_ON_FIRST_PAGE,"Cannot find  first text ",120);
    }

    String accountIdOnBlueButton;
    public void compareAccountIdWithIdOnBlueButton(){
        ChoseAccountPageObject ChoseAccountPageObject =  new ChoseAccountPageObject(driver);
       this.accountIdOnBlueButton = this.waitForElementAndGetAttribute(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"text","Cannot get type of account on blue button",10);
        System.out.println(ChoseAccountPageObject.accountId);
        System.out.println(accountIdOnBlueButton);
        Assert.assertEquals(ChoseAccountPageObject.accountId,accountIdOnBlueButton);
    }

    public void clickMenu()
    {
        this.waitForElementAndClick(MENU,"Cannot click menu",10);
    }

    public void clickChartOnly()
    {
        this.waitForElementAndClick(CHART_ONLY,"Cannot find chart only",10);
    }
}
