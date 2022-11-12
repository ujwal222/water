package com.sauceDemo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]") private WebElement  menuButton;
	@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement  logoutButton;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]") private WebElement  bagProduct;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") private WebElement  cart;
	@FindBy(xpath="//button[text()='Add to cart']") private List<WebElement>  allProduct;
	
	public void clickOnMenuButton()
	{
		menuButton.click();
	}
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
	
	public void bagProduct()
	{
		bagProduct.click();
	}
	
	public String getTextofAddToCartButton()
	{
		String actualCount=cart.getText();
		return actualCount;
	}
	
	public void clickAllProduct()
	{
		for(int i=0; i<allProduct.size(); i++)
		{
			allProduct.get(i).click();
		}
	}
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
