package com.pratian.pas.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrRegister extends BasePage {


	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/h2")
	public WebElement loginFormTitle;
	
	@FindBy(xpath="//*[@id=\"userLoginEmail\"]")
	public WebElement userName;
	
	@FindBy(xpath="//*[@id=\"userLoginPassword\"]")
	public WebElement password;	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/form/button/b")
	public WebElement loginButton;	
	
//    @FindBy(xpath="/html/body/div/div/div/div/div[1]/div/nav/div/ul/li[3]/span/a")
//	public
//	WebElement orderRequest;
	
	public LoginOrRegister(WebDriver driver) {
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
		this.password.sendKeys(password);
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
	

}
