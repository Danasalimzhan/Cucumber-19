Feature: WebOrder functionality input fields
  Scenario: AC check all input fields on web order page happy path
    Given user is on main page of login and validate title as 'Web Orders Login'
    Then user enters their username as 'Tester' and password as 'test'
    And user clicks on login btn

    When user is on main page user clicks on order tab
    Then user is on order page selects 'ScreenSaver' and enters quantity as '200'
    And user enters price as '500' discounts as '50' and total as '100'

    Then user enters their name as 'Dana S' and street address as 'Clark st'
    When user enters city as 'LA' and state as 'California' and zipcode as '60601'
    Then user selects visa and provides cc as '12345567' and expiration date as '12/27'
    And user finally clicks on process button