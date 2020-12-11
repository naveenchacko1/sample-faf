package com.pratian.pas.automation.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.pratian.pas.automation.FileHandling.PropertyManager;


public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", PropertyManager.getProperty("path.driver.chrome"));
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.close();
	}
	

}