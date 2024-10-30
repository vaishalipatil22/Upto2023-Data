package com.Utils;

import org.openqa.selenium.WebDriver;

import com.PageObject.First_PageObject;

public class TestContextSetUp {

	public WebDriver ldriver;
	public First_PageObject obj;
	public Testbase testbase;
	
	public TestContextSetUp()
	{
		testbase=new Testbase();
	}

}
