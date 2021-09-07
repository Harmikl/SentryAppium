package lib.ui;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lib.Platform;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

import static lib.ui.ChoseAccountPageObject.accountId;

public abstract class MenuPageObject extends MainPageObject{
    public MenuPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    protected static String
    MENU,
    MENU_ACCOUNT_TYPE,
    MENU_ACCOUNT_ID,
    MENU_OPEN_REAL_ACCOUNT,
            MENU_MY_ACCOUNT,
    MENU_INBOX,
    MENU_TRADER_TOOLS,
    MENU_TRADER_TOOLS_ECONOMIC_CALENDAR,
    MENU_TRADER_TOOLS_AUTOCHARTIST,
    MENU_TUTORIALS,
    MENU_CONTACT_US,
    MENU_EDIT_FAVORITE,
    MENU_VIDEOS,
    MENU_STRATEGY_GUIDE,
    MENU_LOGOUT,
    MENU_DEPOSIT,
    MENU_WITHDRAWAL,
    MENU_UPLOAD_DOCUMENTS,
    MENU_CLOSE,
            APP_VERSION;


    static String accountNumber;

    public String getAccountNumberInMenu(){
        this.accountNumber = this.waitForElementAndGetAttribute(MENU_ACCOUNT_ID,"text","cannot get text from account id in menu",10)
                .replaceAll("Account ID ","");
        System.out.println(accountNumber);
        return accountNumber;
    }
    public void compareAccountNumberFromChooseAccountAndMenu(){
        getAccountNumberInMenu();
        Assert.assertEquals(accountNumber,accountId);
        System.out.println(accountId);
        System.out.println(accountNumber);
    }

    public void openMenu(){
        this.waitForElementAndClick(MENU,"Cannot find and click menu",5);
    }
    public void closeMenu(){
        this.waitForElementAndClick(MENU_CLOSE,"Cannot find and click menu",5);
    }
    public void logOut(){
        openMenu();
        swipeUpToFindElement(MENU_LOGOUT,"Cannot find logout button",5);
        clickLogOut();
    }
    @Override
    public void swipeUp(int timeOfSwipe) {
        if (driver instanceof AppiumDriver) {
            TouchAction action = new TouchAction((AppiumDriver) driver);
            Dimension size = driver.manage().window().getSize();
            int x = size.width / 4;
            int start_y = (int) (size.height * 0.8); //приводим к int потому что хз будет double или int
            int end_y = (int) (size.height * 0.2);
            action
                    .press(PointOption.point(x, start_y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(timeOfSwipe)))
                    .moveTo(PointOption.point(x, end_y))
                    .release()
                    .perform();// тут мы написали что нужно нажать, сместить, потом опять нажать и все это запустить
        } else {
            System.out.println("Method swipeUp do nothing for platform " + Platform.getInstance().getPlatformVar());
        }
    }

    @Override
    public void swipeUpToFindElement(String locator, String error_message, int max_swipes) {
        By by = this.getLocatorByString(locator);
        int already_swiped = 0;
        while (driver.findElements(by).size() == 0) {//эта функция находит все элементы

            if (already_swiped > max_swipes) {
                waitForElementPresent(locator, "Cannot not find element by swiping up" + error_message, 0);
                return;
            }
            swipeUp(200);
            ++already_swiped;
        }

    }

    public void clickMyAccount(){
        this.waitForElementAndClick(MENU_MY_ACCOUNT,"Cannot click my account",5);
    }
    public void clickInbox(){
        this.waitForElementAndClick(MENU_INBOX,"Cannot click my account",5);
    }
    public void clickTraderTools(){
        this.waitForElementAndClick(MENU_TRADER_TOOLS,"Cannot click my account",5);
    }
    public void clickTraderToolsEconomicCalendar(){
        this.waitForElementAndClick(MENU_TRADER_TOOLS_ECONOMIC_CALENDAR,"Cannot click my account",5);
    }
    public void clickTraderToolsAutocahrtist(){
        this.waitForElementAndClick(MENU_TRADER_TOOLS_AUTOCHARTIST,"Cannot click my account",5);
    }
    public void clickTutorial(){
        this.waitForElementAndClick(MENU_TUTORIALS,"Cannot click my account",5);
    }
    public void clickContactUs(){
        this.waitForElementAndClick(MENU_CONTACT_US,"Cannot click my account",5);
    }
    public void editFavorites(){
        this.waitForElementAndClick(MENU_EDIT_FAVORITE,"Cannot click my account",5);
    }
    public void clickVideos(){
        this.waitForElementAndClick(MENU_VIDEOS,"Cannot click my account",5);
    }
    public void clickStrategyGuide(){
        this.waitForElementAndClick(MENU_STRATEGY_GUIDE,"Cannot click my account",5);
    }
    public void clickLogOut(){
        this.waitForElementAndClick(MENU_LOGOUT,"Cannot click my account",5);
    }
    public void appVersionIsRight(String version){
        String actualVersion = this.waitForElementAndGetAttribute(APP_VERSION,"text","cannot get text from app version in menu",10)
                .replaceAll("V. ","");
        Assert.assertEquals(version,actualVersion);
    }
}

