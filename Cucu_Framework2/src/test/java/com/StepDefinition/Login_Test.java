package com.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Base.Properties_Base;
import com.PageObject.Login_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Test {

	public WebDriver driver;
	Login_Page lp = new Login_Page(driver);
	// BaseClass base = new BaseClass();
	Properties_Base base = new Properties_Base();

	@Given("User Launch Browser")
	public void user_launch_browser() throws Exception {
		// driver=base.setUp();
		driver = base.setUp();

	}

	@When("Navigate to  url")
	public void navigate_to_url() throws Exception {
		base.getUrl();

	}

	@Then("Verify that Homepage is visible successful validate title as {string}")
	public void verify_that_homepage_is_visible_successful_validate_title_as(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("Click on Signup \\/ Login button")
	public void click_on_signup_login_button() throws Exception {
		lp = new Login_Page(driver);
		Thread.sleep(3000);
		lp.clickonSignUp();

	}

	@When("Verify {string} is visible")
	public void verify_is_visible(String title) {
		lp.verifyTitle();
		System.out.println("   Login To Your Account is Displayed   ");
	}

	@Then("Enter correct email {string} address and {string} password")
	public void enter_correct_email_address_and_password(String username, String password) {
		lp.validCredential(username, password);
		System.out.println("Username is   : " + username + "    and password is  :" + password);

	}

	@Then("Click login button")
	public void click_login_button() {
		lp.clickonLogin();

	}

	@Then("Validate the Logged in as text")
	public void validate_the_logged_in_as_text() {
		lp.validateText();

		driver.quit();

	}

}
