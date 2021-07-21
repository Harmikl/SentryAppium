package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Random;

import static lib.ui.LoginPageObject.PASSWORD_INPUT;

public class StaticUtils extends MainPageObject{
    public StaticUtils(RemoteWebDriver driver) {
        super(driver);
    }

    public static String
            GENERATED_EMAIL = getGeneratedEmail()+"@gmail.com",
            EXISTING_EMAIL = "qwe2@qwe.qwe",
            INCOMPLETE_REGISTER_EMAIL = "qwe1@qwe.qwe",
            INCORRECT_REAL_EMAIL = "qwe2@qwee.qwe",
            INCORRECT_DEMO_EMAIL = "500103660",
            MY_EMAIL = "qwe2@qwe.qwe",
            MY_PASSWORD = "55555tTt",
            PASSWORD = "Qwe12345";


    public static String getGeneratedEmail() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
