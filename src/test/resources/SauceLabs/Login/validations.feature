@smoke
Feature: Login functionality

  Background: Login steps
    Given user is navigated to login page
    When user is on login page user enters username and password
    And user clicks on login button

  Scenario: Positive scenario for url title snd header
    Given user is main page user validates title
    Then user validates url
    And user validate main header

  @smoke
  Scenario: Positive scenario validating header on the left and dropdown
    When user is on main page user validates header on the left nav bar
    Then user validates all the list of options from the dropdown
    And user selects price low to high option

