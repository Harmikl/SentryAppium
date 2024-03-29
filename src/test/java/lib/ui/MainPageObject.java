package lib.ui;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.qameta.allure.Attachment;
import lib.Platform;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class MainPageObject {
    protected RemoteWebDriver driver; //инициализируем драйвер

    public MainPageObject(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElementPresent(String locator, String error_message, long timeoutInSeconds) {
        By by = this.getLocatorByString(locator);
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }
    public WebElement waitForElementPresent1(String locator, String error_message, long timeoutInMilliSeconds) {
        By by = this.getLocatorByString(locator);
        WebDriverWait wait = new WebDriverWait(driver, timeoutInMilliSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    public WebElement waitForElementPresent(String locator, String error_message) {
        return waitForElementPresent(locator, error_message, 10);
    }

    public WebElement waitForElementAndClick(String locator, String error_message, long timeoutInSeconds) {//написали метод который сначала дожидается какого-то
        //элемента которыый передается в xpath or id и затем происходит клик
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        element.click();
        return element;
    }

    public WebElement clickElement(String locator, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(locator, error_message,  timeoutInSeconds);//написали метод который сначала дожидается какого-то
        //элемента которыый передается в xpath or id и затем происходит клик
        element.click();
        WebElement element1 = waitForElementPresent(locator, error_message,  timeoutInSeconds);
        element1.click();
        System.out.println("I have clicked");
        return element;
    }
    public void clickElement1(String locator, String error_message, long timeoutInSeconds) throws InterruptedException {
        //Thread.sleep(3000);
        By by = getLocatorByString(locator);
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(by);
        System.out.println("I have click element");
        actions.click(elementLocator);
    }

    public WebElement waitForElementAndClick2(String locator, String error_message, long timeoutInSeconds) {//написали метод который сначала дожидается какого-то
        //элемента которыый передается в xpath or id и затем происходит клик
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        element.click();
        element.click();
        return element;
    }

    public WebElement waitForElementAndSendKeys(String locator, String value, String error_message, long timeoutInSeconds) {//написали метод который сначала дожидается какого-то
        //элемента которыый передается в xpath и затем вводит значение
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        element.sendKeys(value);
        return element;
    }

    public boolean waitForElementNotPresent(String locator, String error_message, long timeoutInSeconds) {//метод проверяет что элемента нету
        By by = this.getLocatorByString(locator);
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(by)
        );
    }

    public WebElement waitForElementAndClear(String locator, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        element.clear();
        return element;
    }

    public void clickByCoordinatesOnDatePicker() throws InterruptedException {
        Thread.sleep(2000);
        TouchAction action = new TouchAction((AppiumDriver) driver);
        Dimension size = driver.manage().window().getSize();
        int x=size.width / 2;
        int y=(int) (size.height * 0.3);
        action.press(PointOption.point(x,y)).release().perform();
        System.out.println("I have clicked on coordinates");
    }

    public void clickByCoordinatesOnCityInput() throws InterruptedException {
        Thread.sleep(2000);
        TouchAction action = new TouchAction((AppiumDriver) driver);
        Dimension size = driver.manage().window().getSize();
        int x=size.width / 2;
        int y=(int) (size.height * 0.498);
        action.press(PointOption.point(x,y)).release().perform();
        System.out.println("I have clicked on coordinates");
    }

    public void swipeUp(int timeOfSwipe) {
        if (driver instanceof AppiumDriver) {
            TouchAction action = new TouchAction((AppiumDriver) driver);
            Dimension size = driver.manage().window().getSize();
            int x = size.width / 2;
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

    public void swipeUpQuick() {
        swipeUp(200);
    }

    public void scrollWebPageUp() {
        if (Platform.getInstance().isMw()) {
            JavascriptExecutor JSExecutor = (JavascriptExecutor) driver;
            JSExecutor.executeScript("window.scrollBy(0,250)"); //скролит от нуля до 250 пикселей
        } else {
            System.out.println("Method scrollWebPage() do nothing for platform " + Platform.getInstance().getPlatformVar());
        }
    }

    public void scrollWebPageTillElementNotVisible(String locator, String error_message, int max_swipes) {
        int already_swiped = 0;

        WebElement element = this.waitForElementPresent(locator, error_message);
        while (!this.isElementLocatedOnTheScreen(locator)) {
            scrollWebPageUp();
            ++already_swiped;
            if (already_swiped > max_swipes) {
                Assert.assertTrue(error_message, element.isDisplayed());
            }
        }
    }

    public void swipeUpToFindElement(String locator, String error_message, int max_swipes) {
        By by = this.getLocatorByString(locator);
        int already_swiped = 0;
        while (driver.findElements(by).size() == 0) {//эта функция находит все элементы

            if (already_swiped > max_swipes) {
                waitForElementPresent(locator, "Cannot not find element by swiping up" + error_message, 0);
                return;
            }
            swipeUpQuick();
            ++already_swiped;
        }

    }

    public void swipeUpTillElementAppear(String locator, String error_message, int max_swipes) {
        int already_swiped = 0;
        while (!this.isElementLocatedOnTheScreen(locator)) {
            if (already_swiped > max_swipes) {
                Assert.assertTrue(error_message, this.isElementLocatedOnTheScreen(locator));
            }
            swipeUpQuick();
            ++already_swiped;
        }
    }

    public boolean isElementLocatedOnTheScreen(String locator) {
        int element_location_by_y = this.waitForElementPresent(locator, "Cannot find element by locator", 5).getLocation().getY(); //находим элемент и получаем его положение по оси Y
        if (Platform.getInstance().isMw()) {
            JavascriptExecutor JSEExecutor = (JavascriptExecutor) driver;
            Object js_result = JSEExecutor.executeScript("return window.pageYOffset");
            element_location_by_y -= Integer.parseInt(js_result.toString());
        }
        int screen_size_by_y = driver.manage().window().getSize().getHeight(); //получаем длину всего экрана
        return element_location_by_y < screen_size_by_y;
    }

    public void clickElementToTheRightUpperCorner(String locator, String error_message) {
        if (driver instanceof AppiumDriver) {
            WebElement element = this.waitForElementPresent(locator + "/..", error_message);
            int right_x = element.getLocation().getX();
            int upper_y = element.getLocation().getY();
            int lower_y = upper_y + element.getSize().getHeight();
            int middle_y = (upper_y + lower_y) / 2;
            int width = element.getSize().getWidth();

            int point_to_click_x = (right_x + width) - 3;
            int point_to_click_y = middle_y;

            TouchAction action = new TouchAction((AppiumDriver) driver);
            action.tap(PointOption.point(point_to_click_x, point_to_click_y)).perform();
        } else {
            System.out.println("Method clickElementToTheRightUpperCorner() do nothing for platform " + Platform.getInstance().getPlatformVar());
        }

    }

    public void swipeElementToLeft(String locator, String error_message) {
        if (driver instanceof AppiumDriver) {
            WebElement element = waitForElementPresent(locator, error_message, 10);
            int left_x = element.getLocation().getX(); //это запишет самую левую координату п оси x
            int right_x = left_x + element.getSize().getWidth();//это запишет самую правую координату п оси x
            int upper_y = element.getLocation().getY();
            int lower_y = upper_y + element.getSize().getHeight();
            int middle_y = (upper_y + lower_y) / 2;

            TouchAction action = new TouchAction((AppiumDriver) driver);
            action.press(PointOption.point(right_x, middle_y));
            action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)));
            if (Platform.getInstance().isAndroid()) {
                action.moveTo(PointOption.point(left_x, middle_y));
            } else {
                int offset_x = (-1 * element.getSize().getWidth());
                action.moveTo(PointOption.point(offset_x, 0));
            }
            action.release();
            action.perform();
        } else {
            System.out.println("Method swipeElementToLeft() do nothing for platform " + Platform.getInstance().getPlatformVar());

        }
    }

    public int getAmountOfElement(String locator) {
        By by = this.getLocatorByString(locator);
        List elements = driver.findElements(by);
        // List - функция которая создает некий список, element -  название переменной,
        // то есть мы возвращаем количество элементов, которые нашли при помощи  driver.findElements(by)
        return elements.size();
    }

    public boolean isElementPresent(String locator) {
        return getAmountOfElement(locator) > 0;
    }
    public void areElementsMoreThan(String locator,int more_than) {
        Assert.assertTrue("elements amount = "+getAmountOfElement(locator),getAmountOfElement(locator)>more_than);
    }
    public void areElementsLessThan(String locator,int less_than) {
        Assert.assertTrue("elements amount = "+getAmountOfElement(locator),getAmountOfElement(locator)>less_than);
    }

    public void tryClickElementWithFewAttempts(String locator, String error_message, int amount_of_attempts) {
        int current_attempts = 0;
        boolean need_more_attempts = true;
        while (need_more_attempts) {
            try {
                this.waitForElementAndClick(locator, error_message, 3);
                need_more_attempts = false;
            } catch (Exception e) {
                if (current_attempts > amount_of_attempts) {
                    this.waitForElementAndClick(locator, error_message, 3);
                }
            }
            ++current_attempts;
        }
    }

    public void tryClickElementSomeTimes(String locator, String error_message, int amount_of_attempts) throws InterruptedException {
        int current_attempts = 0;
        boolean need_more_attempts = true;
        while (need_more_attempts) {
            try {
                this.waitForElementAndClick(locator, error_message, 3);
                need_more_attempts = false;
            } catch (Exception e) {
                if (current_attempts > amount_of_attempts){
                this.waitForElementAndClick(locator, error_message, 3);
              }
            }
            System.out.println(current_attempts);
            ++current_attempts;
        }
    }

    public void tryClickElement(String locator, String error_message) {
            try {
                this.waitForElementAndClick(locator, error_message, 4);
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                this.waitForElementAndClick(locator, error_message, 4);
            }
        }

    public boolean retryingFindClick(String locator, String error_message) throws InterruptedException {
        Thread.sleep(2000);
        By by = getLocatorByString(locator);
        boolean result = false;
       int amount_of_attempts = 0;
        while(amount_of_attempts < 4) {
            try {
                driver.findElement(by).click();
                result = true;
                break;
            } catch(org.openqa.selenium.StaleElementReferenceException ex) {
            }
            amount_of_attempts++;
            System.out.println(amount_of_attempts);
        }
        return result;
    }

    public String waitForElementAndGetAttribute(String locator, String attribute, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        return element.getAttribute(attribute);
    }

    public WebElement assertGetAttribute(String locator, String attribute, String expected_attribute, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        String actual_attribute = element.getAttribute(attribute);
        Assert.assertEquals(
                error_message,
                expected_attribute,
                actual_attribute);
        return element;
    }

    public void assertElementPresent(String locator) {
        By by = this.getLocatorByString(locator);
        List elements = driver.findElements(by);
        int count_of_titles = elements.size();
        int count_of_titles_expected = 1;
        Assert.assertEquals(
                "There are no title found",
                count_of_titles_expected,
                count_of_titles
        );
    }

    public void assertElementNotPresent(String locator, String error_message) {
        By by = this.getLocatorByString(locator);
        List elements = driver.findElements(by);
        int count_of_titles = elements.size();
        int count_of_titles_expected = 0;
        Assert.assertEquals(
                "There are no title found",
                count_of_titles_expected,
                count_of_titles
        );
    }

    public WebElement waitTillElementBeClickable(String locator, String error_message) {
        By by = this.getLocatorByString(locator);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement clickClickableElement(String locator, String error_message, long timeoutInSeconds )
    {
        WebElement element = waitTillElementBeClickable(locator,error_message);
        element.click();
        return element;
    }

    public By getLocatorByString(String locator_with_type) {
        String[] exploded_locator = locator_with_type.split(Pattern.quote(":"), 2); // делим строку на 2 части по символу :
        String by_type = exploded_locator[0]; // сюда передается первая часть
        String locator = exploded_locator[1]; // сюда вторая

        if (by_type.equals("xpath")) {
            return By.xpath(locator);
        } else if (by_type.equals("id")) {
            return By.id(locator);
        } else if (by_type.equals("css")) {
            return By.cssSelector(locator);
        } else {
            throw new IllegalArgumentException("Cannot get type of locator. Locator " + locator_with_type);
        }
    }

    public String takeScreenshot(String name) {
        TakesScreenshot ts = (TakesScreenshot) this.driver;
        File sourse = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/" + name + "_screenshot.png";
        try {
            FileUtils.copyFile(sourse, new File(path));
            System.out.println("The screenshot was taken: " + path);
        } catch (Exception e) {
            System.out.println("Cannot take screenshot. Error: " + e.getMessage());
        }
        return path;
    }

    @Attachment
    public static byte[] screenshot(String path) {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            System.out.println("Cannot get bytes from screenshot. Error: " + e.getMessage());
        }
        return bytes;
    }

    public boolean currentOrientation(@SuppressWarnings("rawtypes") AppiumDriver driver) {
        driver = (AppiumDriver) this.driver;
        String screenOrientation = driver.getOrientation().name();
        ScreenOrientation orientation = ScreenOrientation.valueOf(screenOrientation);
        if (orientation == ScreenOrientation.PORTRAIT) {
            System.out.println("Current screen orientation is portrait");
            return true;

        } else {
            System.out.println("Current screen orientation is Landscape");

            return false;
        }

    }
    public void assertPortraitScreenOrientation(String PORTRAITorLANDSCAPE){
        AppiumDriver driver = (AppiumDriver) this.driver;
        String screenOrientation = driver.getOrientation().name();
        ScreenOrientation orientation = ScreenOrientation.valueOf(screenOrientation);
        System.out.println(screenOrientation);
       Assert.assertTrue(screenOrientation ==PORTRAITorLANDSCAPE);
    }

    public void assertLandscapeScreenOrientation(){
        AppiumDriver driver = (AppiumDriver) this.driver;
        String screenOrientation = driver.getOrientation().name();
        ScreenOrientation orientation = ScreenOrientation.valueOf(screenOrientation);
        Assert.assertEquals("orientation is wrong",orientation == ScreenOrientation.PORTRAIT,orientation);
    }
}



