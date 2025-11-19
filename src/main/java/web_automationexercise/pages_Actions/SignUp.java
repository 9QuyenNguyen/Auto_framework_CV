package web_automationexercise.pages_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web_automationexercise.commons.Base_Actions;
import web_automationexercise.pages_UI.SignUp_UI;
import web_automationexercise.utils.UserInfoData;

public class SignUp extends Base_Actions {
    WebDriver driver;
    public SignUp(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToTitleMrs() {
        log.info("wait and click to title Mrs");
        checkToElement(driver, SignUp_UI.MRS_RADIO_BUTTON);
    }

    public boolean verifyNameIsDisplayed(UserInfoData userInfo) {
        log.info("verify name is displayed");
        return isElementDisplayed(driver, SignUp_UI.NAME_IN_TEXTBOX, userInfo.getFirstName());
    }

    public boolean verifyEmailIsDisplayed(UserInfoData userInfo) {
        log.info("verify email is displayed");
        return isElementDisplayed(driver, SignUp_UI.EMAIL_IN_TEXTBOX, userInfo.getEmail());
    }

    public void enterPassword(UserInfoData userInfo) {
        log.info("enter password");
        sendkeyToElement(driver, SignUp_UI.PASSWORD_TEXTBOX, userInfo.getPassword());
    }

    public void selectDateOfBirth(UserInfoData userInfo) {
        log.info("select date of birth");
        selectItemInDefaultDropdown(driver, SignUp_UI.DATE_OF_BIRTH_DROPDOWN, userInfo.getDoBDay());
        selectItemInDefaultDropdown(driver, SignUp_UI.MONTH_OF_BIRTH_DROPDOWN, userInfo.getDoBMonth());
        selectItemInDefaultDropdown(driver, SignUp_UI.YEAR_OF_BIRTH_DROPDOWN, userInfo.getDoBYear());
    }

    public void enterFirstName(UserInfoData userInfo) {
        log.info("enter first name");
        sendkeyToElement(driver, SignUp_UI.FIRST_NAME_TEXTBOX, userInfo.getFirstName());
    }

    public void enterLastName(UserInfoData userInfo) {
        log.info("enter last name");
        sendkeyToElement(driver, SignUp_UI.LAST_NAME_TEXTBOX, userInfo.getLastName());
    }

    public void enterAddress(UserInfoData userInfo) {
        log.info("enter address");
        sendkeyToElement(driver, SignUp_UI.ADDRESS_TEXTBOX, userInfo.getAddress1());
    }

    public void enterCountry(UserInfoData userInfo) {
        log.info("enter country");
        selectItemInDefaultDropdown(driver, SignUp_UI.COUNTRY_DROPDOWN, userInfo.getCountry());
    }

    public void enterState(UserInfoData userInfo) {
        log.info("enter state");
        sendkeyToElement(driver, SignUp_UI.STATE_TEXTBOX, userInfo.getstate());
    }

    public void enterCity(UserInfoData userInfo) {
        log.info("enter city");
        sendkeyToElement(driver, SignUp_UI.CITY_TEXTBOX, userInfo.getCity());
    }

    public void enterZipCode(UserInfoData userInfo) {
        log.info("enter zip code");
        sendkeyToElement(driver, SignUp_UI.ZIPCODE_TEXTBOX, userInfo.getZipcode());
    }

    public void enterMobileNumber(UserInfoData userInfo) {
        log.info("enter mobile number");
        sendkeyToElement(driver, SignUp_UI.MOBILE_TEXTBOX, userInfo.getMobile());
    }

    public void clickCreateAccountbutton() {
        log.info("click create account button");
        waitForElementClickable(driver, SignUp_UI.CREATE_ACCOUNT_BUTTON).click();
    }

    public boolean verifyAccountCreatedIsDisplayed() {
        log.info("verify account created is displayed");
        return isElementDisplayed(driver, SignUp_UI.ACCOUNT_CREATED_TEXT);
    }

    public DashBoard clickContinueButton() {
        log.info("click Continue button");
        waitForElementClickable(driver, SignUp_UI.CONTINUE_BUTTON).click();
        return PageGenerateManager.getDashBoard(driver);
    }

}
