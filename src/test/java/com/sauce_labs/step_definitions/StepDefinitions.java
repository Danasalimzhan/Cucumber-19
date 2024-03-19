package com.sauce_labs.step_definitions;

import com.sauce_labs.pages.HomeMainPage;
import com.sauce_labs.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserUtils;
import utils.DriverHelper;

import java.util.List;

import static utils.DriverHelper.driver;

public class StepDefinitions {
    WebDriver driver = DriverHelper.getDriver();
    HomeMainPage homeMainPage = new HomeMainPage(driver);

    /*WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    //login functionality
    @Given("user is navigated to login page")
    public void user_is_navigated_to_login_page() {
        driver.get("https://www.saucedemo.com/");

    }
    @When("user is on login page user enters username and password")
    public void user_is_on_login_page_user_enters_username_and_password() {
        loginPage.setLoginBtn("standard_user", "secret_sauce");

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginBtn();

    }

     */
    //Scenario 1
    @Given("user is main page user validates title")
    public void user_is_main_page_user_validates_title() {
        String expectedTitle = "Swag Labs";
        String actualTitle = BrowserUtils.BrowserUtil.getTitle(driver);
        Assert.assertEquals("Failed to validate title in main page", expectedTitle, actualTitle);
    }

    @Then("user validates url")
    public void user_validates_url() {
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("Failed to validate URL", expectedURL, actualURL);

    }

    @Then("user validate main header")
    public void user_validate_main_header() {
        String expectedHeader = "Swag Labs";
        String actualHeader = homeMainPage.getHeader();
        Assert.assertEquals("Failed to validate main page header", expectedHeader, actualHeader);

    }


//Scenario 2


    @When("user is on main page user validates header on the left nav bar")
    public void user_is_on_main_page_user_validates_header_on_the_left_nav_bar() {
        String expectedHeader = "products";
        String actualHeader = homeMainPage.getHeaderOnLeftBar();
        Assert.assertEquals("Failed to validate title in main page", expectedHeader, actualHeader);
    }

    @Then("user validates all the list of options from the dropdown")
    public void user_validates_all_the_list_of_options_from_the_dropdown() {
        List<WebElement> option = homeMainPage.validateOptionSelect();
        for (int i = 0; i < option.size(); i++) {
            System.out.println(BrowserUtils.BrowserUtil.getText(option.get(i)));
            Assert.assertTrue(option.get(i).isDisplayed());

        }
    }

    @Then("user selects price low to high option")
    public void user_selects_price_low_to_high_option() {
        homeMainPage.selectLowToHigh();
    }

}
