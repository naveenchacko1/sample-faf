package com.pratian.pas.automation.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.ContactUs;
import com.pratian.pas.automation.PageObjects.Home;

public class TestContactUs extends BaseTest{
	@Test(dataProvider="UserQuery")
    public void checkcontactus(String fullName, String email, String phonenumber, String comment) throws IOException {
        // TODO Auto-generated constructor stub
        driver.get(PropertyManager.getProperty("url.app"));
        driver.manage().window().maximize();
        
        Home h = new Home(driver);
        ContactUs Con = h.clickContact(driver);
        System.out.println(Con.getContactUsTitle());
        Assert.assertEquals(Con.ContactUsTitle.isDisplayed(),true);    
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

 

        ContactUs txt = new ContactUs(driver);
        txt.FullName.click();
        txt.providefullname(fullName);
        txt.provideemail(email);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        txt.providePhoneNumber(phonenumber);
        txt.providecomment(comment);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        txt.clickSubmitButton(driver);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
        txt.clickOKButton(driver);
        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
 
        }
    @DataProvider(name="UserQuery")
    public Object[][] getValidCredentials()
    {
        return new Object[][]
        {
            {"Jhon","Jhon@gmail.com" , "9876543021","Testing Contact Us feature Here."},
            
        };
    }
}
