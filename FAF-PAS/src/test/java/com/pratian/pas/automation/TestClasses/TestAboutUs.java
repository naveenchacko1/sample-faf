package com.pratian.pas.automation.TestClasses;

import java.io.IOException;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.Home;

@Test
public class TestAboutUs extends BaseTest{
	 public void checkcontactus() throws IOException {
	        // TODO Auto-generated constructor stub
	        driver.get(PropertyManager.getProperty("url.app"));
	        driver.manage().window().maximize();
	        
	        Home h = new Home(driver);
	        h.aboutUs.click();
	        }
}
