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
    NEXT_3;

    public RealRegistrationPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public void enterData1stWebView()
    {
        this.waitForElementAndSendKeys(FIRST_NAME,"Max","Cannot input data in first name field",40);
        this.waitForElementAndSendKeys(LAST_NAME,"Pax","Cannot input data in last name field",40);
        this.waitForElementAndClick(NEXT1,"cannot find next1 button",40);
    }

    public void enterData2ndWebView()
    {
        this.waitForElementAndClick(DATE_PICKER,"Cannot find and click date picker",10);
        this.waitForElementAndClick(SET_DATE_PICKER,"Cannot set date in date picker",10);
        this.waitForElementAndClick(NEXT2,"Cannot find and click nex2 button",10);
    }


    public void enterData3rdWebView()
    {

        this.waitForElementAndSendKeys(ADDRESS,"qq","Cannot enter value in address field",10);
        this.waitForElementAndSendKeys(CITY,"qq","Cannot enter value in city field",10);
    }

}

