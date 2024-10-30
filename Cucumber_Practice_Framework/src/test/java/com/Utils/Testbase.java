package com.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	WebDriver ldriver;

	public WebDriver WebDriverManager() {

		WebDriverManager.chromedriver().setup();
		ldriver = new ChromeDriver();
		ldriver.manage().window().maximize();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ldriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return ldriver;

	}

}
