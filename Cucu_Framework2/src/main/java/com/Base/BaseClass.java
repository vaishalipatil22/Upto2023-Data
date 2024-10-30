package com.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	public WebDriver setUp() {
		String browser = "chrome";

		switch (browser) {

		case ("chrome"):
			System.out.println("you select the CHROME browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case ("firefox"):
			System.out.println("you select the FIREFOX browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case ("internetExplorer"):
			System.out.println("you select the INTERNET EXPLORER browser");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("You have not selected the correct browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public String getURL(String url) {
		driver.get(url);
		return url;
	}
}