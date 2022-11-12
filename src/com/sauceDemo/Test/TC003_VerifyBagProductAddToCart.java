package com.sauceDemo.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POM.HomePOMClass;
import com.sauceDemo.POM.LoginPOMClass;

public class TC003_VerifyBagProductAddToCart
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
		  
		  hp.bagProduct();
		  System.out.println("Bag product is selected");
		  
		  //validation
		  System.out.println("Apply validation");
		  String expectedProductCount="1";
		  String actualProductCount=hp.getTextofAddToCartButton();
		  
		  if(actualProductCount.equals(expectedProductCount))
		  {
			  System.out.println("Bag Product test case is passed");
		  }
		  else
		  {
			  System.out.println("Bag Product test case is failed");  
		  }
		  
		  driver.close();
		  System.out.println("browser is closed");
	}
}
