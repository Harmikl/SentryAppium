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
    }
}
