package com.TestLayer;

import org.openqa.selenium.WebDriver;

import com.BaseLayer.BaseClass;
import com.PageLayer.Test1_POM;

public class Test1 extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) {

		//BaseClass base = new BaseClass();
		BaseClass.driverinit();
		BaseClass.getDriver();

		Test1_POM pom = new Test1_POM(driver);
		pom.clickOnLogin();
		pom.enterUserName();
		pom.enterPassWord();
		pom.clickOnSignUp();

		// ldriver.close();

	}
}
