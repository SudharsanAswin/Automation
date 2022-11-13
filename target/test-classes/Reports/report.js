$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Adactin.feature");
formatter.feature({
  "name": "Validation of Adactin Web Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC01_Validation of Booking Order No in Adaction Web Application",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Adactin Web Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_Adactin_Web_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Login Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Login_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid UserName and PassWord",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_UserName_and_PassWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Search Hotel Page id displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Search_Hotel_Page_id_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects valid Location , Hotel and Room Type",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_selects_valid_Location_Hotel_and_Room_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Select Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Select_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Radio button and clicks Continue button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_Radio_button_and_clicks_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Book a Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Book_a_Hotel_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid FirstName ,LastName ,Billing Address and Card Number",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_FirstName_LastName_Billing_Address_and_Card_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects valid Card Type ,Expiry Month ,Expiry Year and enters CVV",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_selects_valid_Card_Type_Expiry_Month_Expiry_Year_and_enters_CVV()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Book Now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_Book_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Booking order number is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Booking_order_number_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});