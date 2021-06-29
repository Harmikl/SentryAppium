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
        NEXT1="xpath://android.view.View[2]/android.view.View/android.view.View/android.view.View[5]/android.widget.Button";
        DATE_PICKER="id:native-datepicker";
        NEXT2="xpath://android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.widget.Button";
        ADDRESS="id:input-263";
        CITY="id:input-225";
        STREET_NAME="id:input-230";
        STREET_NUMBER="id:input-235";
        APARTMENT="id:input-240";
        ZIP_CODE="id:input-245";
        NEXT_3="xpath://android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[10]/android.widget.Button";

    }
}
