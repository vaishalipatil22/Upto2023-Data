package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.PageObject.First_PageObject;
import com.Utils.TestContextSetUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Step {
	WebDriver ldriver;
	First_PageObject obj;
	TestContextSetUp testcontextsetup;
	
	public First_Step(TestContextSetUp testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
//		WebDriverManager.chromedriver().setup();
//		testcontextsetup.ldriver = new ChromeDriver();
//		testcontextsetup.ldriver.manage().window().maximize();
//		testcontextsetup.ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		obj = new First_PageObject(testcontextsetup.ldriver);
	}

	@When("to open url {string}")
	public void to_open_url(String url) {
//		testcontextsetup.ldriver.get(url);
	}

	@Then("user enter Valid Username {string} and Password {string}")
	public void user_enter_valid_username_and_password(String username, String password) {
		obj.userName(username);
		obj.passWord(password);
	}

	@Then("click on login btn")
	public void click_on_login_btn() {
		obj.clickonLogin();
	}

	@Then("verify the Title {string}")
	public void verify_the_title(String expected) throws Exception {
		Thread.sleep(2000);
		// System.out.println(expected);
		String actual = obj.getTitle();
		// System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		testcontextsetup.ldriver.close();
		testcontextsetup.ldriver.quit();
	}

}
