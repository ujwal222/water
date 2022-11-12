package com.sauceDemo.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POM.HomePOMClass;
import com.sauceDemo.POM.LoginPOMClass;

public class TC002_VerifyLogoutFunctionality
{
   public static void main(String[] args) throws InterruptedException
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
		  
		  HomePOMClass home= new HomePOMClass(driver);
		  home.clickOnMenuButton();
		  System.out.println("Clicked on menu button");
		  
		  home.clickOnLogoutButton();
		  System.out.println("clicked on logout button");
		  
		  //validation
		  
		  String expected = "Swag Labs";
		  String actual=driver.getTitle();
		  
		  if(actual.equalsIgnoreCase(expected))
		  {
			  System.out.println("Test is passed");
		  }
		  else
		  {
			  System.out.println("Test is failed");
		  }
		  
		  
		  driver.quit();
		  System.out.println("Browser is closed");
		  
		  
	   
   }
}
