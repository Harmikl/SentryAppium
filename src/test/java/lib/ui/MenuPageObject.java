package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class MenuPageObject extends MainPageObject{
    public MenuPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    protected static String
    MENU,
    MENU_ACCOUNT_TYPE,
    MENU_ACCOUNT_ID,
    MENU_OPEN_REAL_ACCOUNT,
    MUNU_MY_ACCOUNT,
    MENU_INBOX,
    MENU_TRADER_TOOLS,
    MENU_TRADER_TOOLS_ECONOMIC_CALENDAR,
    MENU_TRADER_TOOLS_AUTOCHARTIST,
    MENU_TUTORIALS,
    MENU_CONTACT_US,
    MENU_EDIT_FAVORITE,
    MENU_VIDEOS,
    MENU_STRATEGY_GUIDE,
    MENU_LOGOUT,
    MENU_DEPOSIT,
    MENU_WITHDRAWAL,
    MENU_UPLOAD_DOCUMENTS,
    MENU_CLOSE,
            APP_VERSION;

    public String[] getAccountNumberInMenu(){
        String accountNumberInMenu = this.waitForElementAndGetAttribute(MENU_ACCOUNT_ID,"text","cannot get text from account id in menu",10);
        return accountNumberInMenu.split(" ");
        System.out.println(accountNumberInMenu.split(" ");
    }
}

