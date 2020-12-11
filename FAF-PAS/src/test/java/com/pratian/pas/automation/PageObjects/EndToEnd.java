package com.pratian.pas.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndToEnd extends BasePage{
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/h2")
	public WebElement loginFormTitle;
	
	@FindBy(xpath="//*[@id=\"userLoginEmail\"]")
	public WebElement userName;
	
	@FindBy(xpath="//*[@id=\"userLoginPassword\"]")
	public WebElement password2;	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/form/button/b")
	public WebElement loginButton;	
	
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[1]/div[1]/input")
	  WebElement restaurantName;
	
	  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[1]/div[2]/input")
	  WebElement email;
	  
	  @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/form/div[2]/div[1]/input")
	  WebElement password1;
	  
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
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/h2")
	    public WebElement ContactUsTitle;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/form/div[1]/input")
	    public WebElement FullName;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/form/div[2]/input")
	    public WebElement Email;    
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/form/div[3]/input")
	    public WebElement PhoneNumber;    
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/form/div[4]/textarea")
	    public WebElement Comment;    
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/form/div[5]/button")
	    public WebElement SubmitButton;    
	    
	    @FindBy(xpath="//button[contains(text(),'OK')]")
	    public WebElement OK;

	    @FindBy(xpath="/html/body/div/div/div/div/div[6]/div[1]/div/div[3]/div[2]/ul/li[2]/a")
		public WebElement aboutUs;
//    @FindBy(xpath="/html/body/div/div/div/div/div[1]/div/nav/div/ul/li[3]/span/a")
//	public
//	WebElement orderRequest;
	public EndToEnd(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public boolean isLoginFormDisplayed()
	{
		return loginFormTitle.isDisplayed();
	}	
	public String getLoginFormTitle()
	{
		return loginFormTitle.getText();
	}
	public void provideUsername(String userName)
	{
		this.userName.sendKeys(userName);
	}
	public void providePassword(String password)
	{
		this.password2.sendKeys(password);
	}
//	
//	public OrderRequest clickLoginButton(WebDriver driver)
//	{
//		loginButton.click();
//		 return new OrderRequest(driver);
//	}
//	

	 public Home clickLoginButton(WebDriver driver)    {
	        loginButton.click();
	       
	        return new Home(driver);
	 }
	 
	 public void setRestaurantName(String name) {	
		  restaurantName.sendKeys(name);
	   }
	   
	   public void setEmail(String Email) {	
		   email.sendKeys(Email);
		}
	   
	   public void setPassword(String passwrd) {	
		   password1.sendKeys(passwrd);
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
//		   profileImage.sendKeys(ProfileImage);
//		}
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
	  
	  public boolean isContactUsDisplayed()
	    {
	        return ContactUsTitle.isDisplayed();
	    }    
	    public void providefullname(String FullName)
	    {
	        this.FullName.sendKeys(FullName);
	    }
	    public void provideemail(String Email)
	    {
	        this.Email.sendKeys(Email);
	    }
	    public void providePhoneNumber(String PhoneNumber)
	    {
	        this.PhoneNumber.sendKeys(PhoneNumber);
	    }
	    public void providecomment(String Comment)
	    {
	        this.Comment.sendKeys(Comment);
	    }

	 

	    public String getContactUsTitle() {
	        return ContactUsTitle.getText();
	    }

	 

	    public void clickSubmitButton(WebDriver driver) {
	        // TODO Auto-generated method stub
	        SubmitButton.click();
	    }
	    
	    public void clickOKButton(WebDriver driver) {
	        OK.click();
	    }
	    
	    public void clickAboutUs(WebDriver driver)
	    {
	        aboutUs.click();
	    } 
}
