Feature: sign up functionality

  Scenario: Happy path for signing up a user
    Given User is on main page user clicks on signup button
    When User is on signup page user enters name 'Jiji' and email 'test073@gmail.com' and clicks sign up
    Then User is on sign up page user clicks on Mrs. checkbox and validates that name is 'Jiji'
    And User verifies that email field is disabled and enters password 'Qwer123456'
    Then User provides date of birth day as '19' month as '12' year as '2000'
    When User enters firstname as 'Jiji' lastname as 'Hadid' company 'Prada' and address as '1 Clark st'
    And User selects country as 'USA' provides state as 'IL' and city as 'Chicago'
    Then User provides zipcode '60610' and mobile number as '123456789' and clicks create account button

