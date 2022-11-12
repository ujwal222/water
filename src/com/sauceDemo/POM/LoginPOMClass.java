package com.sauceDemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginbutton;
	
	public void sendUsername(String a)
	{
		username.sendKeys(a);
	}
	
	public void sendPassword(String a)
	{
		password.sendKeys(a);
	}
	
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}
	 
	public LoginPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
