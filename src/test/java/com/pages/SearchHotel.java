package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotel extends BaseClass {

	public SearchHotel() {
		PageFactory.initElements(x, this);
	}
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement searchText;
	
	public WebElement getSearchText() {
		return searchText;
	}
	@FindBy(id="location")
	private WebElement hotelLoc;
	
	@FindBy(id="hotels")
	private WebElement hotelName;
	
	@FindBy(id="room_type")
	private WebElement hotelType;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getHotelLoc() {
		return hotelLoc;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getHotelType() {
		return hotelType;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
}
