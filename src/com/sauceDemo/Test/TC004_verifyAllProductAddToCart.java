package com.sauceDemo.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POM.HomePOMClass;
import com.sauceDemo.POM.LoginPOMClass;

public class TC004_verifyAllProductAddToCart 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver2.exe");
	  WebDriver driver = new ChromeDriver ();
	  System.out.println("Browser is open");

	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  System.out.println("Browser is maximised");
	  
	  driver.get("https://www.saucedemo.com/");
	  System.out.println("URL is open");
	  
	  LoginPOMClass login = new LoginPOMClass(driver);
	  login.sendUsername("standard_user");
	  System.out.println("username is entered");
	  
	  login.sendPassword("secret_sauce");
	  System.out.println("password is enetred");
	 
	  login.clickOnLoginButton();
	  System.out.println("clicked on login button");
	  
	  System.out.println("Went on home page");
	  HomePOMClass hp =new HomePOMClass(driver);
	  
	  hp.clickAllProduct();
	  System.out.println("Select all product");
	  
	  //validation
	  String expected="6";
	  String actual=hp.getTextofAddToCartButton();
	  
	  if(actual.equals(expected))
	  {
		  System.out.println("All Product test case is passed");
	  }
	  else
	  {
		  System.out.println("All Product test case is failed");  
	  }
	  
	  driver.close();
	  System.out.println("browser is closed");
	  
 }
}
