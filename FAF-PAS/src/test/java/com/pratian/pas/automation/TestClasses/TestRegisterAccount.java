package com.pratian.pas.automation.TestClasses;

import java.io.IOException;
import java.util.Dictionary;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.Home;
import com.pratian.pas.automation.PageObjects.RegisterRestaurant;




public class TestRegisterAccount extends BaseTest{
	@Test(priority=1,dataProvider="WithoutDays")
	public void Days(String name,String email,String passwrd,String confirmpasswrd,String addr,String City,String Country,String pinCode,String Age,String PhoneNo) throws IOException{
		
		//navigate to the food delivery url
		driver.get(PropertyManager.getProperty("url.app"));
		driver.manage().window().maximize();
		
		//Object of home
		Home h3 = new Home(driver);
        h3.registerRestaurant.click();
        driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
        
        //Object of register restaurant
	    RegisterRestaurant r1 = h3.clickRegisterRestaurant(driver);
	    r1.setRestaurantName(name);            //set the Restaurant name for register restaurant page
	    r1.setEmail(email);                    //set the Email for register restaurant page
	    r1.setPassword(passwrd);               //set the password for register restaurant page
	    r1.setConfirmPassword(confirmpasswrd); //set the confirm password for register restaurant page
	    r1.setAddress(addr);                   //set the address for register restaurant page
	    r1.setCity(City);                      //set the city for register restaurant page
	    r1.setCountry(Country);                //set the country for register restaurant page
	    r1.setPincode(pinCode);                //set the pincode for register restaurant page
	    r1.driver.findElement(By.cssSelector("#userGender > option:nth-child(2)")).click(); //select gender from dropdown
	    r1.setAge(Age);                               //set the age for register restaurant page
	    r1.setPhoneNo(PhoneNo);                       //set the phoneNo for register restaurant page
	  //services
	    r1.breakfast.click();
	    //choose types
	    r1.juice.click();
	    //restaurant timings
//	    r1.monday.click();
//	    r1.tuesday.click();
	   //terms and condtition
	    r1.acceptterms.click();
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    r1.createAnAccount.click();
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    h3.logout.click();
	}

	@DataProvider(name="WithoutDays")
	public Object[][] getWithoutDays()
	{
		return new Object[][]
		{
			{"mtr","giri@gmail.com","Password@123","Password@123","D-6/3,Jindal nagar","Angul","India","560010","22","7987827996"}
		};
	
	}

	@Test(priority=2,dataProvider="WithoutService")
	public void Service(String name,String email,String passwrd,String confirmpasswrd,String addr,String City,String Country,String pinCode,String Age,String PhoneNo) throws IOException{
		
		
		//Object of home
		Home h3 = new Home(driver);
        h3.registerRestaurant.click();
        driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
        
        //Object of register restaurant
	    RegisterRestaurant r1 = h3.clickRegisterRestaurant(driver);
	    r1.setRestaurantName(name);            //set the Restaurant name for register restaurant page
	    r1.setEmail(email);                    //set the Email for register restaurant page
	    r1.setPassword(passwrd);               //set the password for register restaurant page
	    r1.setConfirmPassword(confirmpasswrd); //set the confirm password for register restaurant page
	    r1.setAddress(addr);                   //set the address for register restaurant page
	    r1.setCity(City);                      //set the city for register restaurant page
	    r1.setCountry(Country);                //set the country for register restaurant page
	    r1.setPincode(pinCode);                //set the pincode for register restaurant page
	    r1.driver.findElement(By.cssSelector("#userGender > option:nth-child(2)")).click(); //select gender from dropdown
	    r1.setAge(Age);                               //set the age for register restaurant page
	    r1.setPhoneNo(PhoneNo);                       //set the phoneNo for register restaurant page
	  //services
	  //  r1.breakfast.click();
	    //choose types
	    r1.juice.click();
	    //restaurant timings
 	    r1.monday.click();
//	    r1.tuesday.click();
	   //terms and condtition
	    r1.acceptterms.click();
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    r1.createAnAccount.click();
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	@DataProvider(name="WithoutService")
	public Object[][] getWithoutService()
	{
		return new Object[][]
		{
			{"90's Cafe","poornimaKS@gmail.com","Password@123","Password@123","D-923,Azad nagar","Banglore","India","560018","22","9192939495"}
		};
	
	}
}
