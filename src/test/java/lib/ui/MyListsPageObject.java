package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class MyListsPageObject extends MainPageObject {
    protected static  String
    FOLDER_BY_NAME_TPL ,
    ARTICLE_BY_TITLE_TPL ,
    ARTICLE_IS_NOT_DELETED,
            REMOVE_FROM_SAVE_BUTTON;

    private static String getFolderXpathByName(String name_of_folder)
    {
        return FOLDER_BY_NAME_TPL.replace("{FOLDER_NAME}",name_of_folder);
    }
    private static String getSaveArticleXpathByTitle(String article_title)
    {
        return ARTICLE_BY_TITLE_TPL.replace("{TITLE}",article_title);
    }
    private static String getRemoveButtonByTitle(String article_title)
    {
        return REMOVE_FROM_SAVE_BUTTON.replace("{TITLE}",article_title);
    }

    public MyListsPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
    public void openFolderByName (String name_of_folder)
    {
        String folder_name_xpath = getFolderXpathByName(name_of_folder);
        this.waitForElementAndClick(
                folder_name_xpath,
                "Cannot find folder by name "+ name_of_folder,
                5
        );
    }

    public void waitForArticleToAppearByTitle(String artical_title)
    {
        String article_xpath = getSaveArticleXpathByTitle(artical_title);
        this.waitForElementPresent(article_xpath, "Cannot save article by title "+ artical_title,15 );
    }
    public void waitForArticleToDisappearByTitle(String artical_title)
    {
        String article_xpath = getSaveArticleXpathByTitle(artical_title);
        this.waitForElementNotPresent(article_xpath, "Saved article still present with title "+ artical_title,15 );
    }
    public void swipeByArticleToDelete (String article_title) throws InterruptedException {

        this.waitForArticleToAppearByTitle(article_title);

            String artical_xpath = getSaveArticleXpathByTitle(article_title);

            if (Platform.getInstance().isIOS()||Platform.getInstance().isAndroid()) {
        this.swipeElementToLeft(
                artical_xpath,
                "cannot find Java (programming language) in My lists");
        if (Platform.getInstance().isIOS()) {
            this.clickElementToTheRightUpperCorner(artical_xpath, "Cannot find saved article");
        } else {
            Thread.sleep(3000);
            String remove_locator= getRemoveButtonByTitle(article_title);
            this.waitForElementAndClick(
                    remove_locator,
                    "Cannot click button to remove article from saved",
                    10
            );
        }

        if (Platform.getInstance().isMw()){
            driver.navigate().refresh();
        }
        this.waitForArticleToDisappearByTitle(article_title);
    }
    }
    public void articleIsNotDeleted()
    {
            this.waitForElementPresent(ARTICLE_IS_NOT_DELETED, "Cannot find not deleted article",10);
    }

}
