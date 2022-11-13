package com.base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver x;

	public WebDriver launch() {
		WebDriverManager.chromedriver().setup();
		x = new ChromeDriver();
		x.manage().window().maximize();
		return x;
	}

	public void loadUrl(String url) {
		x.get(url);
	}

	public void send(WebElement e, String value) {
		e.sendKeys(value);
	}

	public void click(WebElement e) {
		e.click();
	}

	public void dropDown(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}

	public String text(WebElement e, String value) {
		String text = e.getAttribute(value);
		return text;
	}

	public void quit() {
		x.quit();
	}

	public void waitFor(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public String getUrl() {
		String url = x.getCurrentUrl();
		return url;
	}
}
