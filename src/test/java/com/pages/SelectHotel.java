package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotel extends BaseClass {

	
	public SelectHotel() {

	PageFactory.initElements(x, this);
	}
	//SelectHotel page locators
	
		@FindBy(id="radiobutton_0")
		private WebElement btnRadio;
		
		@FindBy(xpath="//td[@class='login_title']")
		private WebElement text;
		
		public WebElement getText() {
			return text;
		}

		public WebElement getBtnRadio() {
			return btnRadio;
		}

		public WebElement getBtnCon() {
			return btnCon;
		}

		@FindBy(id="continue")
		private WebElement btnCon;
}
