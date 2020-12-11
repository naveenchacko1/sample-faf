package com.pratian.pas.automation.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.Home;
import com.pratian.pas.automation.PageObjects.LoginOrRegister;

public class TestLoginWithValidCred extends BaseTest {
	
	@Test(dataProvider="Login")
	public void checkLoginWithValidCredentials(String usrname,String passwrd) throws IOException
	{
		/*Check whether or not user is navigated to Login Page after click on "Login or Register"
		Link
		 */
		driver.get(PropertyManager.getProperty("url.app"));
		driver.manage().window().maximize();
		
		Home h3 = new Home(driver);
		LoginOrRegister login = h3.clickLoginOrRegister(driver);
		login.provideUsername(usrname);
		login.providePassword(passwrd);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		login.loginButton.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		System.out.println(login.getLoginFormTitle());
//		Assert.assertEquals(login.isLoginFormDisplayed(),true);		
	}
	
	@DataProvider(name="Login")
	public Object[][] getLoginWithvalidCredentials()
	{
		return new Object[][]
		{
			{"surya@gmail.com","Password@123"}
		};
	
	}
	//@Test()
//	public void loginwithValidCredentials(String userName,String password)
//	{
//		LoginOrRegister login = new LoginOrRegister(driver);
//		//`
//	}

}
