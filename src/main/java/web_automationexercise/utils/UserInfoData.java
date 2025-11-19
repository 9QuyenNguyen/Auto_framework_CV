package web_automationexercise.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import web_automationexercise.commons.GlobalConstants;

import java.io.File;

public class UserInfoData {

    public static UserInfoData getUserInfo() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(new File(GlobalConstants.DATA_TEST_PATH + "User_data.json"), UserInfoData.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("dobDay")
    private String dobDay;

    @JsonProperty("dobMonth")
    private String dobMonth;

    @JsonProperty("dobYear")
    private String dobYear;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("company")
    private String company;

    @JsonProperty("address1")
    private String address1;

    @JsonProperty("country")
    private String country;

    @JsonProperty("state")
    private String state;

    @JsonProperty("city")
    private String city;

    @JsonProperty("zipcode")
    private String zipcode;

    @JsonProperty("mobile")
    private String mobile;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDoBDay() {
        return dobDay;
    }

    public String getDoBMonth() {
        return dobMonth;
    }

    public String getDoBYear() {
        return dobYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCountry() {
        return country;
    }

    public String getstate() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getMobile() {
        return mobile;
    }
}
