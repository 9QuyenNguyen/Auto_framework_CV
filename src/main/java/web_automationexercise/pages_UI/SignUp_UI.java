package web_automationexercise.pages_UI;

public class SignUp_UI {
    public static final String MR_RADIO_BUTTON = "xpath=//input[@value='Mr']";
    public static final String MRS_RADIO_BUTTON = "xpath=//input[@value='Mrs']";
    public static final String NAME_TEXTBOX = "xpath=//input[@data-qa='name']";
    public static final String NAME_IN_TEXTBOX = "xpath=//input[@type='text' and @id='name' and @value='%s']";
    public static final String EMAIL_TEXTBOX = "xpath=//input[@data-qa='email']";
    public static final String EMAIL_IN_TEXTBOX = "xpath=//input[@type='text' and @id='email' and @value='%s']";
    public static final String PASSWORD_TEXTBOX = "xpath=//input[@data-qa='password']";
    public static final String DATE_OF_BIRTH_DROPDOWN = "xpath=//select[@id='days']";
    public static final String MONTH_OF_BIRTH_DROPDOWN = "xpath=//select[@id='months']";
    public static final String YEAR_OF_BIRTH_DROPDOWN = "xpath=//select[@id='years']";
    public static final String FIRST_NAME_TEXTBOX = "xpath=//input[@name='first_name']";
    public static final String LAST_NAME_TEXTBOX = "xpath=//input[@name='last_name']";
    public static final String ADDRESS_TEXTBOX = "xpath=//input[@name='address1']";
    public static final String COUNTRY_DROPDOWN = "xpath=//select[@id='country']";
    public static final String STATE_TEXTBOX = "xpath=//input[@name='state']";
    public static final String CITY_TEXTBOX = "xpath=//input[@name='city']";
    public static final String ZIPCODE_TEXTBOX = "xpath=//input[@name='zipcode']";
    public static final String MOBILE_TEXTBOX = "xpath=//input[@name='mobile_number']";
    public static final String CREATE_ACCOUNT_BUTTON = "xpath=//button[@data-qa='create-account']";
    public static final String ACCOUNT_CREATED_TEXT = "xpath=//b[text()='Account Created!']";
    public static final String CONTINUE_BUTTON = "xpath=//a[@data-qa='continue-button']";
}
