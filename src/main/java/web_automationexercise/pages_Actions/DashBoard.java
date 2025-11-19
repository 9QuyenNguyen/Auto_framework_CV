package web_automationexercise.pages_Actions;

import org.openqa.selenium.WebDriver;
import web_automationexercise.commons.Base_Actions;
import web_automationexercise.pages_UI.DashBoard_UI;
import web_automationexercise.pages_UI.Login_UI;
import web_automationexercise.utils.ExtentManager;
import web_automationexercise.utils.UserInfoData;

public class DashBoard extends Base_Actions {
    WebDriver driver;
    public DashBoard(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public Login clickSignUpLogin() {
        log.info("wait and click Sign Up Login");
        waitForElementClickable(driver, DashBoard_UI.SIGNUP_LOGIN).click();
        return new Login(driver);
    }

    public boolean verifyLoggedAsUserNameIsDisplayed(UserInfoData userInfo) {
//        return isElementDisplayed(driver, DashBoard_UI.LOGGED_ACCOUNT);
        log.info("verify Logged As User Name Is Displayed");
        return isElementDisplayed(driver, DashBoard_UI.LOGGED_ACCOUNT, UserInfoData.getUserInfo().getFirstName());
    }

    public DashBoard clickDeleteButton() {
        log.info("wait and click Delete Button");
        waitForElementClickable(driver, DashBoard_UI.DELETE_ACCOUNT).click();
        return new DashBoard(driver);
    }

    public boolean verifyDeleteAccountButtonIsDisplayed() {
        log.info("verify Delete Account Button is displayed");
        return isElementDisplayed(driver, DashBoard_UI.ACCOUNT_DELETEE_CONFIRM_TEXT);
    }

    public void clickContinueButtonToDelete() {
        log.info("wait and click Continue Button to delete");
        waitForElementClickable(driver, DashBoard_UI.DELETE_ACCOUNT_CONTINUE_BUTTON).click();
    }

}
