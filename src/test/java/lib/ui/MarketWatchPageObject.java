package lib.ui;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lib.Platform;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

import static lib.ui.ChoseAccountPageObject.accountId;

abstract public class MarketWatchPageObject extends MainPageObject {
    protected static String
    MENU,
    START_TUTORIAL,
    CLOSE_TUTORIAL,
    SKIP_TUTORIAL,
    ONBOARDING_TUTORIAL,
            TEXT_TUTORIAL_1,
            TEXT_TUTORIAL_2,
            TEXT_TUTORIAL_3,
            TEXT_TUTORIAL_FOR_TRADE_SCREEN_1,
            TEXT_TUTORIAL_FOR_TRADE_SCREEN_2,
    GUIDE_CONTAINER,
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
    this.waitForElementPresent(ACCOUNT_VALUE,"cannot find account value button",30);
    this.waitForElementPresent(ACCOUNT_VALUE_BALANCE,"cannot find account balance",30);
    this.waitForElementPresent(TENOR_VIEW,"cannot find tenor view slider",30);
    this.waitForElementPresent(SOCKET_STATUS,"cannot find socket status",30);
    this.waitForElementPresent(TIME,"cannot find socket status",30);
    }
    public void clickStartTutorial()
    {
        this.waitForElementAndClick(START_TUTORIAL,"Cannot find Start tutorial button",120);
    }
    public void clickSkipTutorial()  {
        this.waitForElementAndClick(SKIP_TUTORIAL,"Cannot find and click Skip tutorial button",60);
    }
    public void clickCloseTutorial()   {
        this.waitForElementAndClick(CLOSE_TUTORIAL,"Cannot find Start tutorial button",120);
    }
    public void onboardingTutorialIsOpen() {
        this.waitForElementPresent(ONBOARDING_TUTORIAL,"Cannot find  tutorial ",120);
        this.waitForElementPresent(TEXT_TUTORIAL_1,"Cannot find  first text ",120);
    }

    public void secondViewPageOnboardingIsOPen(){
        this.waitForElementPresent(ONBOARDING_TUTORIAL,"Cannot find  tutorial ",5);
        this.waitForElementPresent(TEXT_TUTORIAL_2,"Cannot find  first text ",5);
    }
    public void thirdViewPageOnboardingIsOPen(){
        this.waitForElementPresent(ONBOARDING_TUTORIAL,"Cannot find  tutorial ",5);
        this.waitForElementPresent(TEXT_TUTORIAL_3,"Cannot find  first text ",5);
    }
    public void onboardingTutorialForTradeScreenIsOpen1(){
        this.waitForElementPresent(ONBOARDING_TUTORIAL,"Cannot find  tutorial ",5);
        this.waitForElementPresent(TEXT_TUTORIAL_FOR_TRADE_SCREEN_1,"Cannot find  first text ",5);
    }
    public void onboardingTutorialForTradeScreenIsOpen2(){
        this.waitForElementPresent(ONBOARDING_TUTORIAL,"Cannot find  tutorial ",5);
        this.waitForElementPresent(TEXT_TUTORIAL_FOR_TRADE_SCREEN_2,"Cannot find  first text ",5);
    }
    public void guideContainerIsNotOpen(){
        this.waitForElementNotPresent(GUIDE_CONTAINER,"Tutorial container is still on screen",120);
    }
    public void swipe(int timeOfSwipe) {
        if (driver instanceof AppiumDriver) {
            TouchAction action = new TouchAction((AppiumDriver) driver);
            Dimension size = driver.manage().window().getSize();
            int start_x = (int) (size.width * 0.9);
            int end_x = (int) (size.width * 0.08);
            int y = (int) (size.height * 0.8); //приводим к int потому что хз будет double или int

            action
                    .press(PointOption.point(start_x, y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(timeOfSwipe)))
                    .moveTo(PointOption.point(end_x,y))
                    .release()
                    .perform();// тут мы написали что нужно нажать, сместить, потом опять нажать и все это запустить
        } else {
            System.out.println("Method swipeUp do nothing for platform " + Platform.getInstance().getPlatformVar());
        }
    }

    public void swipeLeft(){
        this.swipe(200);
    }

   static String accountIdOnBlueButton;

    public String getAccountNumberOnBlueButton(){
        this.accountIdOnBlueButton = this.waitForElementAndGetAttribute(ACCOUNT_NUMBER_ON_BLUE_BUTTON,"text",
                "Cannot get type of account on blue button",10000);
        ChoseAccountPageObject ChoseAccountPageObject =  new ChoseAccountPageObject(driver);
        return  accountIdOnBlueButton;
    }
    public void compareAccountIdWithIdOnBlueButton(){
        getAccountNumberOnBlueButton();
        Assert.assertEquals(accountIdOnBlueButton,accountId);
    }

    public void clickMenu() {
        this.waitForElementAndClick(MENU,"Cannot click menu",10);
    }

    public void clickChartOnly() {
        this.waitForElementAndClick(CHART_ONLY,"Cannot find chart only",10);
    }

    public void clickAsk() throws InterruptedException {
        this.waitTillElementBeClickable(BLUE_BUTTON,"blue button is not clickable");
        TouchAction action = new TouchAction((AppiumDriver)driver);
        Dimension size = driver.manage().window().getSize();
        int x =(int)(size.width*0.44);
        int y = (int)(size.height * 0.23);
        action.press(PointOption.point(x,y)).release().perform();
    }

    public void clickBid() throws InterruptedException {
        Thread.sleep(4000);
        TouchAction action = new TouchAction((AppiumDriver)driver);
        Dimension size = driver.manage().window().getSize();
        int x =(int)(size.width*0.29);
        int y = (int)(size.height * 0.23);
        action.press(PointOption.point(x,y)).release().perform();
    }

}
