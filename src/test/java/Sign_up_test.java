import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import web_automationexercise.commons.BaseTest;
import web_automationexercise.pages_Actions.DashBoard;
import web_automationexercise.pages_Actions.Login;
import web_automationexercise.pages_Actions.PageGenerateManager;
import web_automationexercise.pages_Actions.SignUp;
import web_automationexercise.utils.ExtentManager;
import web_automationexercise.utils.UserInfoData;


public class Sign_up_test extends BaseTest {
    private WebDriver driver;
    private String browserName;
    private DashBoard dashBoard;
    private DashBoard dashBoardConfirmDelete;
    private Login loginPage;
    private SignUp signUpPage;
    UserInfoData userInfo;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        this.browserName = browserName;
        driver = getBrowserDriver(browserName);
        dashBoard = PageGenerateManager.getDashBoard(driver);
        userInfo = UserInfoData.getUserInfo();
    }

    @Test
    public void Sign_up_test() {
        ExtentManager.getTest().info("Step 1: click SignUp/Login to login");
        loginPage = dashBoard.clickSignUpLogin();

        ExtentManager.getTest().info("Step 2: verify text New User Signup is visible");
        loginPage.verifyTextNewUserSignupVisible();

        ExtentManager.getTest().info("Step 3: enter name and email");
        loginPage.enterNameAndEmail(driver, userInfo);

        ExtentManager.getTest().info("Step 4: click Signup button");
        signUpPage = loginPage.clickSignButton();

        ExtentManager.getTest().info("Step 5: click Signup button");
        signUpPage.verifyNameIsDisplayed(userInfo);

        ExtentManager.getTest().info("Step 6: verify email is displayed");
        signUpPage.verifyEmailIsDisplayed(userInfo);

        ExtentManager.getTest().info("Step 7: click to title Mrs");
        signUpPage.clickToTitleMrs();

        ExtentManager.getTest().info("Step 8: enter Password");
        signUpPage.enterPassword(userInfo);

        ExtentManager.getTest().info("Step 9: enter Date Of Birth");
        signUpPage.selectDateOfBirth(userInfo);

        ExtentManager.getTest().info("Step 10: enter FirstName");
        signUpPage.enterFirstName(userInfo);

        ExtentManager.getTest().info("Step 11: enter LastName");
        signUpPage.enterLastName(userInfo);

        ExtentManager.getTest().info("Step 12: enter Address");
        signUpPage.enterAddress(userInfo);

        ExtentManager.getTest().info("Step 13: enter Country");
        signUpPage.enterCountry(userInfo);

        ExtentManager.getTest().info("Step 14: enter State");
        signUpPage.enterState(userInfo);

        ExtentManager.getTest().info("Step 15: enter City");
        signUpPage.enterCity(userInfo);

        ExtentManager.getTest().info("Step 16: enter Zip Code");
        signUpPage.enterZipCode(userInfo);

        ExtentManager.getTest().info("Step 17: enter Mobile Number");
        signUpPage.enterMobileNumber(userInfo);

        ExtentManager.getTest().info("Step 18: click Create Account button");
        signUpPage.clickCreateAccountbutton();

        ExtentManager.getTest().info("Step 19: verify Account Created is displayed");
        signUpPage.verifyAccountCreatedIsDisplayed();

        ExtentManager.getTest().info("Step 20: click Continue button");
        dashBoard = signUpPage.clickContinueButton();

        ExtentManager.getTest().info("Step 21: verify Logged As User Name is displayed");
        dashBoard.verifyLoggedAsUserNameIsDisplayed(userInfo);

        ExtentManager.getTest().info("Step 22: click Delete button");
        dashBoardConfirmDelete = dashBoard.clickDeleteButton();

        ExtentManager.getTest().info("Step 23: verify Confirm Delete is displayed");
        dashBoardConfirmDelete.verifyDeleteAccountButtonIsDisplayed();

        ExtentManager.getTest().info("Step 24: click Continue button to delete");
        dashBoardConfirmDelete.clickContinueButtonToDelete();
    }

    @AfterClass
    public void afterClass() {
        closeBrowser();
    }

}
