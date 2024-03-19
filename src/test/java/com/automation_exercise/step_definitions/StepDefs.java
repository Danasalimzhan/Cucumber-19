package com.automation_exercise.step_definitions;

import com.automation_exercise.pages.ContactUsPage;
import com.automation_exercise.pages.MainPage;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

import static dev.failsafe.internal.util.Assert.*;

public class StepDefs {
    WebDriver driver = DriverHelper.getDriver();
    MainPage mainPage = new MainPage(driver);
    ContactUsPage contactUsPage = new ContactUsPage(driver);

    @Given("User is on main page user clicks on contact us link")
    public void user_is_on_main_page_user_clicks_on_contact_us_link() {
        driver.get("https://www.automationexercise.com/");
        mainPage.clickOnContactUs();
    }

    @When("User is on contact us page user validates url and title of the page")
    public void user_is_on_contact_us_page_user_validates_url_and_title_of_the_page() {
        String expectedURL = "https://www.automationexercise.com/contact_us";
        Assert.assertEquals(expectedURL, driver.getCurrentUrl());
        String actualUrl = contactUsPage.getTextContactUs();
        System.out.println(actualUrl);

        String expectedTitle = "Automation Exercise - Contact Us";
        Assert.assertEquals(expectedTitle, BrowserUtils.BrowserUtil.getTitleWithJS(driver));
        String actualTitle = contactUsPage.getTextContactUs();
    }

    @Then("User enters name and email")
    public void user_enters_name_and_email() {
        contactUsPage.enterNameEmail("Thomas Shelby", "shelby@limited.com");
    }

    @Then("User enters subject of the message and message itself")
    public void user_enters_subject_of_the_message_and_message_itself() {
        contactUsPage.enterSubjectAndMessage("Complaint about your website", "please, sir/madam fix your website thank you");

    }

    @Then("User attaches file and clicks on submit button")
    public void user_attaches_file_and_clicks_on_submit_button() {
        contactUsPage.attachedFileAndSubmit("/Users/codefish/Desctop/B19 HTML/TomAndJerry.jpeg");

    }

    @When("User is on contact us page user verifies Contact us text")
    public void user_is_on_contact_us_page_user_verifies_contact_us_text() {
        String expectedText = "Contact Us";
        Assert.assertEquals(expectedText, contactUsPage.getTextContactUs());
        String actualText = contactUsPage.getTextContactUs();
        System.out.println(actualText);

    }
    @Then("User validates Get In Touch text")
    public void user_validates_get_in_touch_text() {
        String expectedText = "Get In Touch";
       Assert.assertEquals(expectedText, contactUsPage.getTextGetInTouch());
        String actualText = contactUsPage.getTextGetInTouch();
        System.out.println(actualText);
    }
    @Then("user validates Feedback For Us text")
    public void user_validates_feedback_for_us_text() {
        String expectedText = "Feedback For Us";
       Assert.assertEquals(expectedText, contactUsPage.getTextFeedback());
        String actualText = contactUsPage.getTextFeedback();
        System.out.println(actualText);
    }
}
