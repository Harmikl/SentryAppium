package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.interactions.Actions;

public class CoreTestCase  {//
    protected RemoteWebDriver driver;
    protected Platform  Platform;

@Before
@Step("Run driver and session")
    public void setUp() throws Exception {
        driver = Platform.getInstance().getDriver();
        this.createAllurePropertyFile();
        this.rotateScreenPortrait();
    }
@After
@Step("Remove driver and session")
    public void tearDown() {
        driver.quit();
    }
    @Step("Rotate screen to portrait mode")
    public void rotateScreenPortrait()
    {
        if (driver instanceof AppiumDriver){
            AppiumDriver driver = (AppiumDriver) this.driver;
            driver.rotate(ScreenOrientation.PORTRAIT);
        }else {
            System.out.println("Method rotateScreenPortrait() does nothing for platform "+Platform.getInstance().getPlatformVar());
        }
    }
    @Step("Rotate screen to landscape mode")
    public void rotateScreenLandscape()
    {
        if (driver instanceof AppiumDriver){
            AppiumDriver driver = (AppiumDriver) this.driver;
        driver.rotate(ScreenOrientation.LANDSCAPE);
        }else {
            System.out.println("Method rotateScreenPortrait() does nothing for platform "+Platform.getInstance().getPlatformVar());
        }
    }
    @Step("Send app to background (this method does nothing for mobile web)")
    protected void backgroundApp(int seconds)
    {
        if (driver instanceof AppiumDriver){
            AppiumDriver driver = (AppiumDriver) this.driver;
        driver.runAppInBackground(Duration.ofSeconds(seconds)); //отправляем аппку в бэк, через кол секунд в скобках аппка достанестя из бэка
        }else {
            System.out.println("Method rotateScreenPortrait() does nothing for platform "+Platform.getInstance().getPlatformVar());
        }
    }

    @Step("Tap back software button")
    protected void tapBackButton()
    {
        driver.navigate().back();
    }


    private void createAllurePropertyFile()
    {
        String path = System.getProperty("allure.results.directory");//получаем путь до allure
        try {
            Properties props = new Properties();
            FileOutputStream fos = new FileOutputStream(path+"/environment.properties");// пишем в файл environment.properties
            props.setProperty("Environment",Platform.getInstance().getPlatformVar());//получаем значение переменной окружения
            props.store(fos,"See https://github.com/allure-framework/allure-app/wiki/Environment");
            fos.close();
        }catch (Exception e){
            System.err.println("IO problem when writing allure properties file");
            e.printStackTrace();
        }
    }
    public void wifiSwitch() throws InterruptedException {
        TouchActions action = new TouchActions(driver);
        NetworkConnection mobileDriver = (NetworkConnection) driver;
        if (mobileDriver.getNetworkConnection() != NetworkConnection.ConnectionType.ALL) {
            // enabling Airplane mode
            mobileDriver.setNetworkConnection(NetworkConnection.ConnectionType.ALL);
        }else { mobileDriver.setNetworkConnection(NetworkConnection.ConnectionType.NONE);

        }
    }

    public void wifiOn() throws InterruptedException {

    }

    public void toggleWifi() throws InterruptedException {
        ((AndroidDriver) driver).toggleWifi();
        Thread.sleep(5000);
    }

    public void deviceIsInPortraitOrientation(){
        AppiumDriver driver = (AppiumDriver) this.driver;
        String screenOrientation = driver.getOrientation().name();
        ScreenOrientation orientation = ScreenOrientation.valueOf(screenOrientation);
        Assert.assertEquals("orientation is wrong",orientation == ScreenOrientation.PORTRAIT,true);
    }
    public void deviceIsInLandscapeOrientation(){
        AppiumDriver driver = (AppiumDriver) this.driver;
        String screenOrientation = driver.getOrientation().name();
        ScreenOrientation orientation = ScreenOrientation.valueOf(screenOrientation);
        Assert.assertEquals("orientation is wrong",orientation == ScreenOrientation.LANDSCAPE,true);
    }

}
