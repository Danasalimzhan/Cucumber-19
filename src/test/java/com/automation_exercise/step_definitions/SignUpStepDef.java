package com.automation_exercise.step_definitions;

import com.automation_exercise.pages.LoginPage;
import com.automation_exercise.pages.MainPage;
import com.automation_exercise.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SignUpStepDef {
    WebDriver driver = AutoHook.driver;
    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);


    @Given("User is on main page user clicks on signup button")
    public void user_is_on_main_page_user_clicks_on_signup_button() {
        mainPage.clickOnSignUp();
    }

    @When("User is on signup page user enters name {string} and email {string} and clicks sign up")
    public void user_is_on_signup_page_user_enters_name_and_email_and_clicks_sign_up(String name, String email) {
        loginPage.enterNameEmail(name, email);
    }

    @Then("User is on sign up page user clicks on Mrs. checkbox and validates that name is {string}")
    public void user_is_on_sign_up_page_user_clicks_on_mrs_checkbox_and_validates_that_name_is(String name) {
        signUpPage.checkMrValidateName(name);
    }

    @Then("User verifies that email field is disabled and enters password {string}")
    public void user_verifies_that_email_field_is_disabled_and_enters_password(String password) {

    }

    @Then("User provides date of birth day as {string} month as {string} year as {string}")
    public void user_provides_date_of_birth_day_as_month_as_year_as(String day, String month, String year) {

    }

    @When("User enters firstname as {string} lastname as {string} company {string} and address as {string}")
    public void user_enters_firstname_as_lastname_as_company_and_address_as(String firstname, String lastname, String company, String address) {

    }

    @When("User selects country as {string} provides state as {string} and city as {string}")
    public void user_selects_country_as_provides_state_as_and_city_as(String country, String state, String city) {

    }

    @Then("User provides zipcode {string} and mobile number as {string} and clicks create account button")
    public void user_provides_zipcode_and_mobile_number_as_and_clicks_create_account_button(String zipCode, String mobileNumber) {

    }


}
