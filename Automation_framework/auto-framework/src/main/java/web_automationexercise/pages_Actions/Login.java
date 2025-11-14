package web_automationexercise.pages_Actions;

import org.openqa.selenium.WebDriver;
import web_automationexercise.commons.Base_Actions;
import web_automationexercise.pages_UI.DashBoard_UI;
import web_automationexercise.pages_UI.Login_UI;
import web_automationexercise.utils.UserInfoData;

public class Login extends Base_Actions {
    private WebDriver driver;
    private UserInfoData userInfo = new UserInfoData();
    public Login(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean verifyTextNewUserSignupVisible() {
        log.info("verify Text New User Signup Visible");
        return isElementDisplayed(driver, Login_UI.SIGNUP_TEXT);
    }

    public void enterNameAndEmail(WebDriver driver, UserInfoData userInfo) {
        log.info("enter Name: " + userInfo.getFirstName() + " And Email: " + userInfo.getEmail());
        sendkeyToElement(driver, Login_UI.NAME_TEXTBOX, userInfo.getFirstName());
        sendkeyToElement(driver, Login_UI.EMAIL_SIGNUP_TEXTBOX, userInfo.getEmail());
    }

    public SignUp clickSignButton() {
        log.info("click SignUp button");
        waitForElementClickable(driver, Login_UI.SIGNUP_BUTTON).click();
        return PageGenerateManager.getSignUp(driver);
    }
}
