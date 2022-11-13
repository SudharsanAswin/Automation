package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotel extends BaseClass {

	public BookHotel() {
		PageFactory.initElements(x, this);
	}
	// BookHotel page locators

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtAdd;
	@FindBy(id = "cc_num")
	private WebElement cardNum;
	@FindBy(id = "cc_type")
	private WebElement cardType;
	@FindBy(id = "cc_exp_month")
	private WebElement cardExp;
	@FindBy(id = "cc_exp_year")
	private WebElement expYear;
	@FindBy(id = "cc_cvv")
	private WebElement cardC;
	@FindBy(id = "book_now")
	private WebElement btnBook;
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement text;

	public WebElement getText() {
		return text;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAdd() {
		return txtAdd;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExp() {
		return cardExp;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCardC() {
		return cardC;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

}
