Feature: Validation of LoginPage in Facebook Web Application

  Scenario: TC01_Validation of LoginPage with invalid username and invalid password
    Given User launch Facebook Web Application
    Then User verify Login page is displayed
    When User enters valid userName and invalid passWord
    When User clicks the Login button
    Then User verify error message is displayed

  Scenario: TC02_Validation of SingUp Text in Facebook Web Application
    Given User launch Facebook Web Application
    Then User verify Login page is displayed
    When User enters clicks Create New button
    Then User verify SignUp text is displayed
