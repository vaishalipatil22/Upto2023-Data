package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_PageObject {

	WebDriver ldriver;

	public First_PageObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement user;

	@FindBy(xpath = "//input[@name='password']")
	WebElement pass;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement lgnbtn;

	@FindBy(xpath = "//div[@class='oxd-topbar-header-title']")
	WebElement tit;

	public void userName(CharSequence username) {
		user.clear();
		user.sendKeys(username);
	}

	public void passWord(CharSequence password) {
		pass.clear();
		pass.sendKeys(password);
	}

	public void clickonLogin() {
		lgnbtn.click();
	}

	public String getTitle() {
		String title = tit.getText();
		return title;
	}

}
