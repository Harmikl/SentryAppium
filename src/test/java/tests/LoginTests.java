package tests;

import lib.CoreTestCase;
import lib.ui.LoginPageObject;
import lib.ui.factories.LoginPageObjectFactory;
import org.junit.Test;

public class LoginTests extends CoreTestCase {
    @Test
    public void openDemoRegister()
    {
        LoginPageObject LoginPageObject= LoginPageObjectFactory.get(driver);
        LoginPageObject.openDemoRegistration();
    }

}
