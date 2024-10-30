package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Login_Page extends BaseClass {
	public WebDriver driver;

	public Login_Page(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement signUp;
	@FindBy(xpath = "//h2[text()='Login to your account']")
	WebElement verify;
	@FindBy(name = "email")
	WebElement user;
	@FindBy(name = "password")
	WebElement pass;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement login;
	@FindBy(xpath = "//b")
	WebElement text;

	public void clickonSignUp() {
		signUp.click();
	}

	public boolean verifyTitle() {
		return verify.isDisplayed();
	}

	public void validCredential(String username, String password) {
		user.sendKeys(username);
		pass.sendKeys(password);
	}

	public void clickonLogin() {
		login.click();
	}

	public boolean validateText() {
		return text.isDisplayed();
	}

}
