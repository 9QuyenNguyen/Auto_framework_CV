package web_automationexercise.pages_UI;

public class DashBoard_UI {
    public static final String SIGNUP_LOGIN = "xpath=//a[@href='/login']";
    public static final String LOGGED_ACCOUNT = "xpath=//a[normalize-space(.)='Logged in as %s']";
    public static final String DELETE_ACCOUNT = "xpath=//a[@href='/delete_account']";
    public static final String DELETE_ACCOUNT_CONTINUE_BUTTON= "xpath=//a[@data-qa='continue-button']";;
    public static final String ACCOUNT_DELETEE_CONFIRM_TEXT = "xpath=//b[text()='Account Deleted!']";
}
