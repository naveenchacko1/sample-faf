package com.pratian.pas.automation.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.pas.automation.FileHandling.PropertyManager;
import com.pratian.pas.automation.PageObjects.ContactUs;
import com.pratian.pas.automation.PageObjects.Home;
import com.pratian.pas.automation.PageObjects.LoginOrRegister;
import com.pratian.pas.automation.PageObjects.RegisterRestaurant;

public class TestEnd_To_End extends BaseTest{
	@Test(priority=2,dataProvider="LoginValid")
	public void checkLoginWithValidCredentials(String usrname,String passwrd) throws IOException, InterruptedException
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
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		login.loginButton.click();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
	}
	
	@DataProvider(name="LoginValid")
	public Object[][] getLoginWithvalidCredentials()
	{
		return new Object[][]
		{
			{"anku@gmail.com","Password@123"}
		};
	
	}
	
	@Test(priority=3,dataProvider="InvalidLogin")
	public void checkLoginWithInValidCredentials(String usrname,String passwrd) throws IOException, InterruptedException
	{
		/*Check whether or not user is navigated to Login Page after click on "Login or Register"
		Link
		 */
		driver.get(PropertyManager.getProperty("url.app"));
		driver.manage().window().maximize();
		Home home = new Home(driver);
		LoginOrRegister login = home.clickLoginOrRegister(driver);
		login.provideUsername(usrname);
		driver.manage().timeouts().implicitlyWait(12000, TimeUnit.SECONDS);
		login.providePassword(passwrd);
		driver.manage().timeouts().implicitlyWait(12000, TimeUnit.SECONDS);
		login.loginButton.click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(5000);

	}
	
	@DataProvider(name="InvalidLogin")
	public Object[][] getLoginWithInvalidCredentials()
	{
		return new Object[][]
		{
			{"xyz@gmail.com","Password23"}
		};
}
	
	@Test(priority=1,dataProvider="Register")
	public void sampleTest(String name,String email,String passwrd,String confirmpasswrd,String addr,String City,String Country,String pinCode,String Age,String PhoneNo) throws IOException, InterruptedException{
		
		//navigate to the food delivery url
		driver.get(PropertyManager.getProperty("url.app"));
		driver.manage().window().maximize();
		
		//Object of home
		Home h3 = new Home(driver);
        h3.registerRestaurant.click();
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
        
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
	    r1.monday.click();
	    r1.tuesday.click();
	   //terms and condition
	    r1.acceptterms.click();
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	    r1.createAnAccount.click();
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	    Thread.sleep(5000);
	}

	@DataProvider(name="Register")
	public Object[][] getValidCredentials()
	{
		return new Object[][]
		{
			{"ICH","Anjali@gmail.com","Password@123","Password@123","D-6/3,Jindal nagar","Angul","India","560010","22","7987827996"}
		};
	
	}

	@Test(priority=4,dataProvider="ContactUs")
    public void checkcontactus(String fullName, String email, String phonenumber, String comment) throws IOException, InterruptedException {
        // TODO Auto-generated constructor stub
        driver.get(PropertyManager.getProperty("url.app"));
        driver.manage().window().maximize();
        
        Home h = new Home(driver);
        ContactUs Con = h.clickContact(driver);
        System.out.println(Con.getContactUsTitle());
        Assert.assertEquals(Con.ContactUsTitle.isDisplayed(),true);    
        driver.manage().timeouts().pageLoadTimeout(8000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

 

        ContactUs txt = new ContactUs(driver);
        txt.FullName.click();
        txt.providefullname(fullName);
        txt.provideemail(email);
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
        txt.providePhoneNumber(phonenumber);
        txt.providecomment(comment);
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
        txt.clickSubmitButton(driver);
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
        Thread.sleep(5000);
        txt.clickOKButton(driver);
        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
        Thread.sleep(5000);
        }
    @DataProvider(name="ContactUs")
    public Object[][] getContactDetails()
    {
        return new Object[][]
        {
            {"Jhon","Jhon@gmail.com" , "9876543021","Testing Contact Us feature Here."},
            
        };
    }
    
   
    @Test (priority=5,dataProvider="logOut")
    public void checkLogoutLink(String username,String password) throws IOException, InterruptedException{
        
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
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
        Thread.sleep(5000);
        home.clickLogOutButton(driver);
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
        Thread.sleep(5000);
      
    }
    
    @DataProvider(name="logOut")            
    public Object[][] testData() {            
                      
          return new Object[][] {                
                
            {"anku@gmail.com","Password@123"}     
                
        };
    }
    
    @Test(priority=6)
    public void checkAboutus() throws IOException {
    			//navigate to the food delivery url
    			driver.get(PropertyManager.getProperty("url.app"));
    			driver.manage().window().maximize();
    			
    	        Home h = new Home(driver);
    	        h.aboutUs.click();
    	}
    
    
}
