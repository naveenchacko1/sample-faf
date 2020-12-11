package com.pratian.pas.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs extends BasePage{
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

	 

	    public ContactUs(WebDriver driver) {
	        super(driver);
	        PageFactory.initElements(driver, this);
	        // TODO Auto-generated constructor stub
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
	        // TODO Auto-generated method stub
	        return ContactUsTitle.getText();
	    }

	 

	    public void clickSubmitButton(WebDriver driver) {
	        // TODO Auto-generated method stub
	        SubmitButton.click();
	    }
	    
	    public void clickOKButton(WebDriver driver) {
	        OK.click();
	    }
}
