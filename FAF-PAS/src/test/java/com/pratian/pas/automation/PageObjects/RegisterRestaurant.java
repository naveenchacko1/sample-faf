package com.pratian.pas.automation.PageObjects;

import java.util.Dictionary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterRestaurant extends BasePage{
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[1]/div[1]/input")
  WebElement restaurantName;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[1]/div[2]/input")
  WebElement email;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[2]/div[1]/input")
  WebElement password;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[2]/div[2]/input")
  WebElement confirmPassword;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[3]/div[1]/input")
  WebElement address;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[3]/div[2]/input")
  WebElement city;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[4]/div[1]/input")
  WebElement country;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[4]/div[2]/input")
  WebElement pincode;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[5]/div[1]/select")
  WebElement gender;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[5]/div[2]/input")
  WebElement age;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[5]/div[3]/div/input")
  WebElement profileImage;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[6]/input")
  WebElement phoneNo;  
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[9]/label/b")
  WebElement RestaurantTimings;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[10]/div[1]/div[1]/div/label")
  WebElement checkBox;
  @FindBy(xpath="//label[contains(text(),'Monday')]")
  public WebElement monday;
  @FindBy(xpath="//label[contains(text(),'Tuesday')]")
  public WebElement tuesday;
  @FindBy(xpath="//label[contains(text(),'Breakfast')]")
  public WebElement breakfast;
  @FindBy(xpath="//label[contains(text(),'Juice')]")
  public WebElement juice;
  @FindBy(xpath="//label[contains(text(),'Accept Terms and Condition')]")
  public WebElement acceptterms;
  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/button/b")
	public
	WebElement createAnAccount;
  
 // Dictionary validationMessages;
  
  public RegisterRestaurant(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		//this.validationMessages = msgs;
	}
  
   public void setRestaurantName(String name) {	
	  restaurantName.sendKeys(name);
   }
   
   public void setEmail(String Email) {	
	   email.sendKeys(Email);
	}
   
   public void setPassword(String passwrd) {	
	   password.sendKeys(passwrd);
	}
   
   public void setConfirmPassword(String confirmpasswrd) {	
	   confirmPassword.sendKeys(confirmpasswrd);
	}
   
   public void setAddress(String addr) {	
	   address.sendKeys(addr);
	}
   
   public void setCity(String City) {	
	   city.sendKeys(City);
	}
   
   public void setCountry(String Country) {	
	   country.sendKeys(Country);
	}
   
   public void setPincode(String pinCode) {	
	   pincode.sendKeys(pinCode);
	}
   
   public void clickGender(WebDriver driver) {	
	   gender.click();
	}
   
   public void setAge(String Age) {	
	   age.sendKeys(Age);
	}
   public void clickBreakFast(WebDriver driver) {
	   breakfast.click();
	   }
	   public void clickJuice(WebDriver driver) {
	   juice.click();
	   }
//   public void setProfileImage(String ProfileImage) {	
//	   profileImage.sendKeys(ProfileImage);
//	}
//   
   public void setPhoneNo(String PhoneNo) {	
	   phoneNo.sendKeys(PhoneNo);
	}
   
   public void clickAccTermsConditionBox(){
	   acceptterms.click();
	   }
   
  public void clickCreateAnAccount(WebDriver driver) {	
	  createAnAccount.click();
   }

 
//public boolean isRestaurantTimingsValidationIsVisible() {
//	return true;
//}
  
}
