package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage() {
		
		PageFactory.initElements(x, this);
	}
	
	// Login page locators

	@FindBy(id = "username")
	private WebElement txtUser;

	@FindBy(id = "password")
	private WebElement txtPass;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
