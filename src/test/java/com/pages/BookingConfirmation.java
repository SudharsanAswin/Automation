package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmation extends BaseClass {

	public BookingConfirmation() {
 
		PageFactory.initElements(x, this);
	}
	// Booking confirmation locator

		@FindBy(id = "order_no")
		private WebElement ordNum;

		public WebElement getOrdNum() {
			return ordNum;
		}
}
