Feature: Validation of Adactin Web Application

    @sanity
    Scenario: TC01_Validation of Booking Order No in Adaction Web Application
    Given User launch Adactin Web Page
    Then User verify Login Page is displayed
    When User enters valid UserName and PassWord
    And User clicks Login Button
    Then User verify Search Hotel Page id displayed
    When User selects valid Location , Hotel and Room Type
    And User clicks Search Button
    Then User verify Select Hotel Page is displayed
    When User clicks Radio button and clicks Continue button
    Then User verify Book a Hotel page is displayed
    When User enters valid FirstName ,LastName ,Billing Address and Card Number
    When User selects valid Card Type ,Expiry Month ,Expiry Year and enters CVV
    And User clicks Book Now button
    Then User verify Booking order number is displayed
    
    @smoke
    Scenario: TC02_Validation of Booking Order No in Adaction Web Application
    Given User launch Adactin Web Page
    Then User verify Login Page is displayed
    When User enters valid UserName and PassWord
    And User clicks Login Button
    Then User verify Search Hotel Page id displayed
    When User selects valid Location , Hotel and Room Type
    And User clicks Search Button
    Then User verify Select Hotel Page is displayed
    When User clicks Radio button and clicks Continue button
    Then User verify Book a Hotel page is displayed
    When User enters valid FirstName ,LastName ,Billing Address and Card Number
    When User selects valid Card Type ,Expiry Month ,Expiry Year and enters CVV
    And User clicks Book Now button
    Then User verify Booking order number is displayed
    
   

