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
    CHART_ONLY,
    VIEW_PAGER_1_HIGH,
    VIEW_PAGER_1_LOW,
    VIEW_PAGER_1_CLOSE,
    VIEW_PAGER_1_INDICATOR,
    VIEW_PAGER_1_ITEM,
    VIEW_PAGER_2_CURRENT,
    VIEW_PAGER_2_WEEK_AGO,
    VIEW_PAGER_2_MONTH_AGO,
    VIEW_PAGER_2_CHART_VIEW,
    VIEW_PAGER_2_INDICATOR,
    VIEW_PAGER_3_10P,
    VIEW_PAGER_3_10P_EURUSD,
    VIEW_PAGER_3_25P,
    VIEW_PAGER_3_25P_EURUSD,
    VIEW_PAGER_3_DN,
    VIEW_PAGER_3_DN_EURUSD,
    VIEW_PAGER_3_25C,
    VIEW_PAGER_3_25C_EURUSD,
    VIEW_PAGER_3_10C,
    VIEW_PAGER_3_10C_EURUSD,
    VIEW_PAGER_3_INDICATOR,
    VIEW_PAGER_3_ITEM,
            VIEW_PAGER_4_INTERVAL,
    VIEW_PAGER_4_PATTERN_NAME,
    VIEW_PAGER_4_QUALITY,
    VIEW_PAGER_4_FULL_VIEW,
    VIEW_PAGER_4_SIGNALS,
    VIEW_PAGER_4_INDICATOR,
    VIEW_PAGER_5_LOTS_SIZE,
    VIEW_PAGER_5_ONE_PIP,
    VIEW_PAGER_5_SPOT_L,
    VIEW_PAGER_5_OPTION_L,
    VIEW_PAGER_5_ITEM,
    VIEW_PAGER_5_INDICATOR;





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
    viewPage1IsOpen();
    }
    public void clickStartTutorial()
    {
        this.waitForElementAndClick(START_TUTORIAL,"Cannot find Start tutorial button",120);
    }
    public void clickSkipTutorial()  {
        this.waitForElementAndClick(SKIP_TUTORIAL,"Cannot find and click Skip tutorial button",60);
    }
    public void clickCloseTutorial() throws InterruptedException {
        this.waitForElementAndClick(CLOSE_TUTORIAL,"Cannot find Start tutorial button",120);
        this.waitTillElementBeClickable(BLUE_BUTTON,"Cannot locate blue button");
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

    public void swipeLeftViewPageMarketwatch(){
            TouchAction action = new TouchAction((AppiumDriver) driver);
    Dimension size = driver.manage().window().getSize();
    int start_x = (int) (size.width * 0.95);
    int end_x = (int) (size.width * 0.55);
    int y = (int) (size.height * 0.5); //приводим к int потому что хз будет double или int

            action
                    .press(PointOption.point(start_x, y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                    .moveTo(PointOption.point(end_x,y))
                    .release()
                    .perform();// тут мы написали что нужно нажать, сместить, потом опять нажать и все это запустить
    }

    public void swipeRightViewPageMarketwatch(){
        TouchAction action = new TouchAction((AppiumDriver) driver);
        Dimension size = driver.manage().window().getSize();
        int start_x = (int) (size.width * 0.55);
        int end_x = (int) (size.width * 0.95);
        int y = (int) (size.height * 0.5); //приводим к int потому что хз будет double или int

        action
                .press(PointOption.point(start_x, y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                .moveTo(PointOption.point(end_x,y))
                .release()
                .perform();// тут мы написали что нужно нажать, сместить, потом опять нажать и все это запустить
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
        this.clickClickableElement(CHART_ONLY,"Cannot find chart only",15);
    }

    public void clickAsk()  {
        this.waitTillElementBeClickable(BLUE_BUTTON,"blue button is unclickable");
        TouchAction action = new TouchAction((AppiumDriver)driver);
        Dimension size = driver.manage().window().getSize();
        int x =(int)(size.width*0.44);
        int y = (int)(size.height * 0.23);
        action.press(PointOption.point(x,y)).release().perform();
    }

    public void clickBid() throws InterruptedException {
        Thread.sleep(2000);
        this.waitTillElementBeClickable(BLUE_BUTTON,"blue button is unclickable");
        TouchAction action = new TouchAction((AppiumDriver)driver);
        Dimension size = driver.manage().window().getSize();
        int x =(int)(size.width*0.29);
        int y = (int)(size.height * 0.23);
        action.press(PointOption.point(x,y)).release().perform();
    }
    public void viewPage1IsOpen(){
        this.waitForElementPresent(VIEW_PAGER_1_HIGH,"Cannot find  high ",5);
        this.waitForElementPresent(VIEW_PAGER_1_LOW,"Cannot find  low ",5);
        this.waitForElementPresent(VIEW_PAGER_1_CLOSE,"Cannot find  close ",5);
        this.assertGetAttribute(VIEW_PAGER_1_INDICATOR,"selected","true",
                "view pager 1 is not in selected state",10);
        this.areElementsMoreThan(VIEW_PAGER_1_ITEM,20);

    }public void viewPage2IsOpen(){
        this.waitForElementPresent(VIEW_PAGER_2_CURRENT,"Cannot find  current ",5);
        this.waitForElementPresent(VIEW_PAGER_2_WEEK_AGO,"Cannot find  week ago ",5);
        this.waitForElementPresent(VIEW_PAGER_2_MONTH_AGO,"Cannot find  month ago ",5);
        this.assertGetAttribute(VIEW_PAGER_2_INDICATOR,"selected","true",
                "view pager 2 is not in selected state",10);
    }

    public void viewPage3IsOpen(){
        this.waitForElementPresent(VIEW_PAGER_3_10P,"Cannot find  10p ",5);
        this.waitForElementPresent(VIEW_PAGER_3_25P,"Cannot find  week 25p ",5);
        this.waitForElementPresent(VIEW_PAGER_3_DN,"Cannot find  month dn ",5);
        this.waitForElementPresent(VIEW_PAGER_3_25C,"Cannot find  month 25c ",5);
        this.waitForElementPresent(VIEW_PAGER_3_10C,"Cannot find  month 10c ",5);
        this.assertGetAttribute(VIEW_PAGER_3_INDICATOR,"selected","true",
                "view pager 3 is not in selected state",10);
        this.areElementsMoreThan(VIEW_PAGER_3_ITEM,34);
    }

    public void viewPage4IsOpen(){
        this.waitForElementPresent(VIEW_PAGER_4_INTERVAL,"Cannot find  interval ",5);
        this.waitForElementPresent(VIEW_PAGER_4_PATTERN_NAME,"Cannot find  pattern name ",5);
        this.waitForElementPresent(VIEW_PAGER_4_QUALITY,"Cannot find quality ",5);
        this.waitForElementPresent(VIEW_PAGER_4_FULL_VIEW,"Cannot find full view ",5);
        this.waitForElementPresent(VIEW_PAGER_4_SIGNALS,"Cannot find trade signals ",5);
        this.assertGetAttribute(VIEW_PAGER_4_INDICATOR,"selected","true",
                "view pager 4 is not in selected state",10);
    }
    public void viewPage5IsOpen(){
        this.waitForElementPresent(VIEW_PAGER_5_LOTS_SIZE,"Cannot find lots size ",5);
        this.waitForElementPresent(VIEW_PAGER_5_ONE_PIP,"Cannot find one pip",5);
        this.waitForElementPresent(VIEW_PAGER_5_SPOT_L,"Cannot find spot L ",5);
        this.waitForElementPresent(VIEW_PAGER_5_OPTION_L,"Cannot find option L ",5);
        this.assertGetAttribute(VIEW_PAGER_5_INDICATOR,"selected","true",
                "view pager 5 is not in selected state",10);
        this.areElementsMoreThan(VIEW_PAGER_5_ITEM,27);
    }

    public void click10PEURUSD (){
        this.clickClickableElement(VIEW_PAGER_3_10P_EURUSD,"Cannot click 10P eur/usd",15);
    }
}
