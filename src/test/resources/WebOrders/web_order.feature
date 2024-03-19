Feature: Group order functionality test
  Background: authentification
    Given user is login page of web order
    When user enters username as 'guest1@microwoks.com' and password as 'Guest1!'
    Then user clicks on sign in button

    Scenario: office order happy path
      Given user is on main page user clicks on group order radio button
      Then user is selects 'office' from the dropdown
      And user validates office address as '2012 EMPIRE BLVD'
      Then user leaves note fo guests as 'take your shoes off'
      Then user enters info into invitee list as 'test@test.io'
      Then user clicks on create group order button
      And user validates on main header 'View Group Order' on the next page
      And user validates total paticipant as '1'

  Scenario: address order happy path
    Given user is on main page user clicks on group order radio button
    Then user is selects 'My House' from the dropdown
    And user validates office address as '3137 3137 Laguna Street'
    Then user leaves note fo guests as 'take your shoes off'
    Then user enters info into invitee list as 'test@test.io'
    Then user clicks on create group order button
    And user validates on main header 'View Group Order' on the next page
    And user validates total paticipant as '1'