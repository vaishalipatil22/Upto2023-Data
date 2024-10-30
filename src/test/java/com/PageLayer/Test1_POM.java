package com.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class Test1_POM extends BaseClass {
	public static WebDriver driver;

	public Test1_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;

	@FindBy(name = "name")
	WebElement userName;

	@FindBy(xpath = "(//input[@type='email'])[2]")
	WebElement passWord;

	@FindBy(xpath = "//button[text()='Signup']")
	WebElement signUP;

	public void clickOnLogin() {
		login.click();
	}

	public void enterUserName() {
		userName.sendKeys("sampat.patil.pune@gmail.com");
	}

	public void enterPassWord() {
		passWord.sendKeys("Shreeswami@1234");
	}

	public void clickOnSignUp() {
		signUP.click();
	}

}
