package lib.ui.factories;

import lib.Platform;
import lib.ui.ArticlePageObject;
import lib.ui.LoginPageObject;
import lib.ui.android.AndroidArticlePageObject;
import lib.ui.android.AndroidLoginPageObject;
import lib.ui.ios.IOSArticlePageObject;
import lib.ui.ios.IOSLoginPageObject;
import lib.ui.mobile_web.MWLoginPageObject;
import lib.ui.mobile_web.MwArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageObjectFactory {
    public static LoginPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidLoginPageObject(driver);
        }else if (Platform.getInstance().isIOS()){
            return new IOSLoginPageObject(driver);
        }else {
            return new MWLoginPageObject(driver);
        }
    }
}
