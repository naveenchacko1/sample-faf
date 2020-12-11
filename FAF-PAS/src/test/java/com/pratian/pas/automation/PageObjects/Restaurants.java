package com.pratian.pas.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Restaurants extends BasePage{
	@FindBy(xpath="/html/body/div/div/div/div/div[1]/div/div/div[1]/div/div[1]/input")
	public
    WebElement RestaurantName;
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/div/div/div[3]/div/ul/li/span/span")
	public
	WebElement alphabeticalSort;
	@FindBy(xpath="/html/body/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/button")
	public
	WebElement search;
	public Restaurants(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}


	public void setRestaurantName(String Restaurantname) {	
		RestaurantName.sendKeys(Restaurantname);
	   }
	
	public void clickSortBy(WebDriver driver) {	
		alphabeticalSort.click();
	   }
	public void clickSearch(WebDriver driver) {	
		search.click();
	   }
}
