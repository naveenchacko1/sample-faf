package com.pratian.pas.automation.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.Home;
import com.pratian.pas.automation.PageObjects.RegisterRestaurant;
import com.pratian.pas.automation.PageObjects.Restaurants;

public class TestRestaurants extends BaseTest{
	   @Test
	   public void SearchRestaurant() throws IOException {
		        //navigate to the food delivery url
		 		driver.get(PropertyManager.getProperty("url.app"));
		 		driver.manage().window().maximize();
		 		
		 		 driver.get(PropertyManager.getProperty("url.app"));
		         Home hme = new Home(driver);

		         hme.clicksearchText(driver);
		         hme.clicksearchButton(driver);

		         Restaurants res = hme.clickRestaurants(driver);
		         res.alphabeticalSort.click();
		 		
		 		
		 		

	   }
		
//		@DataProvider(name="Search")
//		public Object[][] getSearchResult()
//		{
//			return new Object[][]
//			{
//				{"Dominos"}
//			};
//		
//		}
}
