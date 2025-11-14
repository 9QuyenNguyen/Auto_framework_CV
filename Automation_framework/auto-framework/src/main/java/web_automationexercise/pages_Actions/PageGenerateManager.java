package web_automationexercise.pages_Actions;

import org.openqa.selenium.WebDriver;

public class PageGenerateManager {
    public static Login getLogin(WebDriver driver) {
        return new Login(driver);
    }

    public static DashBoard getDashBoard(WebDriver driver) {
        return new DashBoard(driver);
    }

    public static SignUp getSignUp(WebDriver driver) {
        return new SignUp(driver);
    }
}
