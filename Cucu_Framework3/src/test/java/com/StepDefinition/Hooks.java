package com.StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	public WebDriver driver;

	public Hooks(WebDriver rdriver) {
		this.driver = rdriver;
	}

	//@After
	public void tearDown() throws Exception {
		// Properties_Base base = new Properties_Base();
		System.out.println(" =================   ___________________    ===================");
		driver.quit();
		// base.setUp().quit();

	}
	
//	@AfterStep
//	public void Addscreenshot(Scenario scenario) throws IOException {
//		
//		if(scenario.isFailed())
//		{
//			 File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			 byte[] filecontent=FileUtils.readFileToByteArray(srcFile);
//			//scenario.attach(data,media Type,name);
//			 scenario.attach(filecontent,"image/png","image");
//		}
//	}
}

