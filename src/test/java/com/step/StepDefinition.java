package com.step;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.base.BaseClass;
import com.pages.BookHotel;
import com.pages.BookingConfirmation;
import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	LoginPage l;
	SearchHotel s;
	SelectHotel h;
	BookHotel b;
	BookingConfirmation c;

	@Given("User launch Adactin Web Page")
	public void user_launch_Adactin_Web_Page() {

	
	}

	@Then("User verify Login Page is displayed")
	public void user_verify_Login_Page_is_displayed() {
		System.out.println(getUrl());
		System.out.println(getUrl().contains("adactinhotelapp"));
	}

	@When("User enters valid UserName and PassWord")
	public void user_enters_valid_UserName_and_PassWord() throws InterruptedException {
		l = new LoginPage();
 		send(l.getTxtUser(), "Sudharsanaswin");
		send(l.getTxtPass(), "P2RVRY");
	}

	@When("User clicks Login Button")
	public void user_clicks_Login_Button() {
		l = new LoginPage();
		click(l.getBtnLogin());
	}

	@Then("User verify Search Hotel Page id displayed")
	public void user_verify_Search_Hotel_Page_id_displayed() throws InterruptedException {
		Assert.assertTrue(false);
		s = new SearchHotel();
		waitFor(2000);
		System.out.println(s.getSearchText().isDisplayed());
 	}

	@When("User selects valid Location , Hotel and Room Type")
	public void user_selects_valid_Location_Hotel_and_Room_Type() {
		s = new SearchHotel();
		dropDown(s.getHotelLoc(), "London");
		dropDown(s.getHotelName(), "Hotel Sunshine");
		dropDown(s.getHotelType(), "Deluxe");
	}

	@When("User clicks Search Button")
	public void user_clicks_Search_Button() {
		s = new SearchHotel();
		click(s.getBtnSubmit());
	}

	@Then("User verify Select Hotel Page is displayed")
	public void user_verify_Select_Hotel_Page_is_displayed() throws InterruptedException {
		h = new SelectHotel();
		waitFor(3000);
		System.out.println(h.getText().isDisplayed());
	}

	@When("User clicks Radio button and clicks Continue button")
	public void user_clicks_Radio_button_and_clicks_Continue_button() {
		h = new SelectHotel();
		click(h.getBtnRadio());
		click(h.getBtnCon());
	}

	@Then("User verify Book a Hotel page is displayed")
	public void user_verify_Book_a_Hotel_page_is_displayed() throws InterruptedException {
		b = new BookHotel();
		waitFor(3000);
		System.out.println(b.getText().isDisplayed());
	}

	@When("User enters valid FirstName ,LastName ,Billing Address and Card Number")
	public void user_enters_valid_FirstName_LastName_Billing_Address_and_Card_Number() {
		b = new BookHotel();
		send(b.getTxtFirstName(), "sudharsan");
		send(b.getTxtLastName(), "aswin");
		send(b.getTxtAdd(), "xxxxxxyyyyyyyy");
		send(b.getCardNum(), "2211334455668890");

	}

	@When("User selects valid Card Type ,Expiry Month ,Expiry Year and enters CVV")
	public void user_selects_valid_Card_Type_Expiry_Month_Expiry_Year_and_enters_CVV() {
		b = new BookHotel();
		dropDown(b.getCardType(), "Master Card");
		dropDown(b.getCardExp(), "September");
		dropDown(b.getExpYear(), "2022");
		send(b.getCardC(), "452");

	}

	@When("User clicks Book Now button")
	public void user_clicks_Book_Now_button() {
		b = new BookHotel();
		click(b.getBtnBook());
	}

	@Then("User verify Booking order number is displayed")
	public void user_verify_Booking_order_number_is_displayed() throws InterruptedException {
		c = new BookingConfirmation();
		waitFor(7000);
		JavascriptExecutor j=(JavascriptExecutor)x;
		j.executeScript("arguments[0].scrollIntoView('true')", c.getOrdNum());
 		System.out.println("Order id:" +text(c.getOrdNum(), "value"));
	}

}