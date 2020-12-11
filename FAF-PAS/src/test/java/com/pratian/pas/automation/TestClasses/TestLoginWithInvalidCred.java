package com.pratian.pas.automation.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.Home;
import com.pratian.pas.automation.PageObjects.LoginOrRegister;

public class TestLoginWithInvalidCred extends BaseTest{
	@Test(dataProvider="InvalidLogin")
	public void checkLoginWithInValidCredentials(String usrname,String passwrd) throws IOException
	{
		/*Check whether or not user is navigated to Login Page after click on "Login or Register"
		Link
		 */
		driver.get(PropertyManager.getProperty("url.app"));
		driver.manage().window().maximize();
		Home home = new Home(driver);
		LoginOrRegister login = home.clickLoginOrRegister(driver);
		login.provideUsername(usrname);
		login.providePassword(passwrd);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		login.loginButton.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		System.out.println(login.getLoginFormTitle());
//		Assert.assertEquals(login.isLoginFormDisplayed(),true);		
	}
	
	@DataProvider(name="InvalidLogin")
	public Object[][] getLoginWithInvalidCredentials()
	{
		return new Object[][]
		{
			{"abc@gmail.com","Password@123"}
		};
}
}