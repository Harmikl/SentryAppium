package lib.ui.android;

import lib.ui.RealRegistrationPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidRealRegistrationPageObject extends RealRegistrationPageObject {
    public AndroidRealRegistrationPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
    static
    {
        FIRST_NAME="xpath://android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText";
        LAST_NAME="xpath://android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.widget.EditText";
        NEXT1="xpath://*[contains(@text,'Next')]";//"xpath://android.view.View[2]/android.view.View/android.view.View/android.view.View[5]/android.widget.Button";
        DATE_PICKER="xpath://android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]";
        SET_DATE_PICKER="id:android:id/button1";
        NEXT2="xpath://*[contains(@text,'Next')]";//"xpath://android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.widget.Button";
        ADDRESS="xpath://android.view.View[4]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText";
        CITY="xpath://android.view.View/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View/android.widget.EditText";
        STREET_NAME="xpath://android.view.View/android.view.View[6]/android.view.View[1]/android.view.View/android.widget.EditText";
        STREET_NUMBER="xpath://android.view.View/android.view.View[7]/android.view.View[1]/android.view.View/android.widget.EditText";
        APARTMENT="xpath://android.view.View/android.view.View[8]/android.view.View[1]/android.view.View/android.widget.EditText";
        ZIP_CODE="xpath://android.view.View/android.view.View[9]/android.view.View[1]/android.view.View/android.widget.EditText";
        NEXT_3="xpath://*[contains(@text,'Next')]";//"xpath://android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[10]/android.widget.Button";
        NUMBER1_PHONE_NUMBER="xpath://android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]";
        NEXT_4="xpath://*[contains(@text,'Next')]";//"xpath://android.view.View/android.view.View[3]/android.widget.Button";
        SENTRY_OPTIONS="xpath://*[contains(@text,'SentryOptions')]";
        NEXT_5="xpath://*[contains(@text,'Next')]";//"xpath://android.view.View/android.view.View[2]/android.widget.Button";
        NEXT_6="xpath://*[contains(@text,'Next')]";//"xpath://android.view.View/android.view.View[4]/android.widget.Button";
        ACCOUNTANCY_7="xpath://android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]";
        EMPLOYMENT_8="xpath://android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]";
        LESS_THAN_9="xpath://android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]";
        LESS_THAN_10="xpath://android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]";
        LESS_THAN_11="xpath://android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]";
        EMPLOYED_12="xpath://android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]";
        TOGGLE_13="xpath://android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.CheckBox";
        NEXT_13="xpath://*[contains(@text,'Next')]";//"xpath://android.view.View[2]/android.view.View/android.view.View/android.view.View[5]/android.widget.Button";
        DEPOSIT_NOW_FINAL_REGISTER="xpath://*[contains(@text,'Deposit now')]";
        SKIP_FINAL_REGISTER="xpath://*[contains(@text,'Skip')]";
        REAL_REGISTRATION_WEBVIEW="xpath://android.view.View/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]";
        DEPOSIT_WEBVIEW_HEADER="id:com.sentryd.trade:id/header_text";
        CLOSE_DEPOSIT_WEBVIEW="id:com.sentryd.trade:id/close_view";
        PLEASE_CHOOSE_DEPOSIT_METHOD="xpath://*[contains(@text,'Please choose deposit method')]";
        PLEASE_SELECT_SPECIFIC_ACCOUNT_OF_DEPOSIT="xpath://*[contains(@text,'Please select the specific account and the amount for deposit')]";
    }
}
