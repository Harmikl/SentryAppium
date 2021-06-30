package lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

abstract public class RealRegistrationPageObject extends MainPageObject {
    protected static String
    FIRST_NAME,
    LAST_NAME,
    NEXT1,
    DATE_PICKER,
    SET_DATE_PICKER,
    NEXT2,
    ADDRESS,
    CITY,
    STREET_NAME,
    STREET_NUMBER,
    APARTMENT,
    ZIP_CODE,
    NEXT_3,
    NUMBER1_PHONE_NUMBER,
    NEXT_4,
    NEXT_5,
    NEXT_6,
    ACCOUNTANCY_7,
    EMPLOYMENT_8,
    LESS_THAN_9,
    LESS_THAN_10,
    LESS_THAN_11,
    EMPLOYED_12,
    TOGGLE_13,
    NEXT_13,
    DEPOSIT_NOW_FINAL_REGISTER,
    SKIP_FINAL_REGISTER;

    public RealRegistrationPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public void enterData1stWebView() throws InterruptedException {
        this.waitForElementAndSendKeys(FIRST_NAME,"Max","Cannot input data in first name field",40);
        this.waitForElementAndSendKeys(LAST_NAME,"Pax","Cannot input data in last name field",40);
        Thread.sleep(1000);
        this.waitForElementAndClick(NEXT1,"cannot find next1 button",40);
    }

    public void enterData2ndWebView() throws InterruptedException {
        Thread.sleep(1000);
        this.clickByCoordinatesOnDatePicker();
        this.waitForElementAndClick(SET_DATE_PICKER,"Cannot set date in date picker",10);
        this.waitForElementAndClick(NEXT2,"Cannot find and click nex2 button",10);
    }


    public void enterData3rdWebView() throws InterruptedException {Thread.sleep(5000);
        this.waitTillElementBeClickable(ADDRESS,"Address button is unclickable");
        this.waitForElementAndSendKeys(ADDRESS,"Max","Cannot enter value in address field",10);
        Thread.sleep(1000);
        this.waitTillElementBeClickable(CITY,"Address button is unclickable");
        this.waitForElementAndSendKeys(CITY,"Max","Cannot enter value in city field",10);
        this.waitForElementAndSendKeys(STREET_NAME,"Max","Cannot enter value in street field",10);
        this.waitForElementAndSendKeys(STREET_NUMBER,"Max","Cannot enter value in street number field",10);
        this.waitForElementAndSendKeys(APARTMENT,"Max","Cannot enter value in apartment field",10);
        this.waitForElementAndSendKeys(ZIP_CODE,"000","Cannot enter value in city field",10);
        this.swipeUpTillElementAppear(NEXT_3,"Cannot find next 3 button",3);
        this.waitForElementAndClick(NEXT_3,"Cannot click next 3 button",5);

    }

    public void enterData4thWebView()
    {
        int number_of_tapping_numbers=0;
        while (number_of_tapping_numbers<7){
            this.waitForElementAndClick(NUMBER1_PHONE_NUMBER,"Cannot find and click number 1",5);
            ++number_of_tapping_numbers;
        }
        this.waitForElementAndClick(NEXT_4,"Cannot click next 4 button",5);
    }
    public void enterData5thWebView()
    {
        this.waitForElementAndClick(NEXT_5,"Cannot click next 5 button",5);
    }
    public void enterData6thWebView()
    {
        this.waitForElementAndClick(NEXT_6,"Cannot click next 6 button",5);
    }
    public void enterData7thWebView()
    {
        this.waitForElementAndClick(ACCOUNTANCY_7,"Cannot click accountancy 7 button",5);
    }
    public void enterData8thWebView() throws InterruptedException {
        Thread.sleep(2000);
        this.waitTillElementBeClickable(EMPLOYMENT_8,"Employment 8 is not clickable");
        this.waitForElementAndClick(EMPLOYMENT_8,"Cannot click accountancy 8 button",5);
    }
    public void enterData9thWebView() throws InterruptedException {
        Thread.sleep(1000);
        this.waitForElementAndClick(LESS_THAN_9,"Cannot click less than 9 button",5);
    }
    public void enterData10thWebView() throws InterruptedException {
        Thread.sleep(1000);
        this.waitForElementAndClick(LESS_THAN_10,"Cannot click less than 10 button",5);
    }
    public void enterData11thWebView() throws InterruptedException {
        Thread.sleep(1000);
        this.waitForElementAndClick(LESS_THAN_11,"Cannot click less than 11 button",5);
    }
    public void enterData12thWebView() throws InterruptedException {Thread.sleep(1000);
    this.waitTillElementBeClickable(EMPLOYED_12,"Employed 12 is unclickable");
        this.waitForElementAndClick(EMPLOYED_12,"Cannot click less employed 12 button",5);
    }
    public void enterData13thWebView() throws InterruptedException {
        Thread.sleep(1000);
        this.waitTillElementBeClickable(TOGGLE_13,"Toggle 13 is unclickable");
        this.waitForElementAndClick(TOGGLE_13,"Cannot click toggle 13 button",5);
        this.waitForElementAndClick(NEXT_13,"Cannot click next 13 button",5);
    }
    public void tapOnFinalRegisterDepositNow()
    {
        this.waitForElementAndClick(DEPOSIT_NOW_FINAL_REGISTER,"Cannot find deposit now button",10);
    }
    public void tapOnFinalRegisterSkip() throws InterruptedException {
        Thread.sleep(1000);
        this.waitForElementAndClick(SKIP_FINAL_REGISTER,"Cannot find deposit now button",10);
    }
}

