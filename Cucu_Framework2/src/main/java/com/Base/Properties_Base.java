package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Properties_Base {

	public WebDriver driver;
	public static Properties prop;

	// public static void main(String[] args) throws Exception {
	public static void readConfig() throws Exception {

		prop = new Properties();
		File file = new File(
				"C:\\Users\\Shree-Swami\\eclipse-workspace\\Cucu_Framework2\\src\\main\\java\\com\\Config\\Config.properties");
		FileInputStream fis = new FileInputStream(file);

		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Before
	public WebDriver setUp() throws Exception {

		Properties_Base.readConfig();// we call method

		System.out.println(prop.getProperty("browser"));

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (prop.getProperty("browser").equalsIgnoreCase("InternetExplorer")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

	}

	public void getUrl() throws Exception {
		Properties_Base.readConfig();
		driver.get(prop.getProperty("Url"));
	}

}
