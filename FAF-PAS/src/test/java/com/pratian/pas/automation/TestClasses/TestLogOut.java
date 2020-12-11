package com.pratian.pas.automation.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.Home;
import com.pratian.pas.automation.PageObjects.LoginOrRegister;

public class TestLogOut extends BaseTest{
	@Test (dataProvider="login")
    public void checkLogoutLink(String username,String password) throws IOException{
        
        /*check whether user able to logout by clicking on logout link*/
        
        driver.get(PropertyManager.getProperty("url.app"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Home home = new Home(driver);
        LoginOrRegister login = home.clickLoginOrRegister(driver);
        login.provideUsername(username);
        login.providePassword(password);
        Home home1 = login.clickLoginButton(driver);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        home.clickLogOutButton(driver);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        //Assert.assertEquals(home.isLoginOrRegisterVisble(), true);
    }
    
    @DataProvider(name="login")            
    public Object[][] testData() {            
                      
          return new Object[][] {                
                
            {"surya@gmail.com","Password@123"}     
                
        };
    }
}
