package com.pratian.pas.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage{
	
	public Home(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"basic-navbar-nav\"]/ul/li[2]/span/a")
	public WebElement loginOrRegister;
	@FindBy(xpath="/html/body/div/div/div/div/div[1]/div/nav/div/ul/li[3]/a")
	public WebElement registerRestaurant;
	@FindBy(xpath="//button[contains(text(),'Log Out')]")
	public WebElement logout;
	@FindBy(xpath="html/body/div/div/div/div/div[1]/div/nav/div/ul/li[4]/span/a")
	public
	WebElement restaurantProfile;
	@FindBy(xpath="/html/body/div/div/div/div/div[1]/div/nav/div/ul/li[1]/span/a")
	public
	WebElement Restaurants;
	 @FindBy(id = "searchText")
	 public WebElement searchText;
	 @FindBy (xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div[2]/button")
	 public WebElement searchButton;
	  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[6]/div[1]/div/div[3]/div[2]/ul/li[3]/a")
	  public WebElement Contact;
	  @FindBy(xpath="/html/body/div/div/div/div/div[6]/div[1]/div/div[3]/div[2]/ul/li[2]/a")
	public WebElement aboutUs;
	public LoginOrRegister clickLoginOrRegister(WebDriver driver)
	{
		loginOrRegister.click();
		
		return new LoginOrRegister(driver);
	}
   
	public RegisterRestaurant clickRegisterRestaurant(WebDriver driver) {        
	     registerRestaurant.click();
	     return new RegisterRestaurant(driver);
	  }

	public Restaurants clickRestaurants(WebDriver driver) {
		 Restaurants.click();
		 return new Restaurants(driver);
	 }

	  public Restaurants clicksearchText(WebDriver driver)
	    {
	        searchText.click();
	        searchText.sendKeys("mtr");
	        
	        return new Restaurants(driver);
	    }
	    
	    public Restaurants clicksearchButton(WebDriver driver)
	    {
	        searchButton.click();
	    
	        return new Restaurants(driver);
	    
	    }
	 
	 public Home clickRestaurantProfile(WebDriver driver) {
		 restaurantProfile.click();
		 return new Home(driver);
	 } 
	 
	 public Home clickLogOutButton(WebDriver driver){
	        
	        logout.click();
	        return new Home(driver);
	        }

	 public ContactUs clickContact(WebDriver driver)
	    {
	        Contact.click();
	        return new ContactUs(driver);
	    }

	 public Home clickAboutUs(WebDriver driver)
	    {
	        aboutUs.click();
	        return new Home(driver);
	    } 
}
