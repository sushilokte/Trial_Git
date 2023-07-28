package Test_01.Practice1_maven;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestCommon.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorTest54   {
	
	@FindBy (css="#user-name")
	WebElement username;
	
	@FindBy (css="#password")
	WebElement password;
	
	@FindBy (css="#login-button")
	WebElement loginbutton;
	
	@FindBy (xpath="//h3")
	WebElement errormsg;
	

	 @Test(dataProvider="data")
	 
	 public void error(String uname,String pword ) throws InterruptedException, IOException {
		 
		 WebDriverManager.chromedriver().setup();
		 WebDriver  driver = new ChromeDriver();
			PageFactory.initElements(driver, this);

		 
		 // go to login page 
		 driver.get("https://www.saucedemo.com/");
		 
		 // Add login details
		 
		 
		 username.sendKeys(uname);
		 password.sendKeys(pword);
		 loginbutton.click();
		 
		 
	  assertEquals("Epic sadface: Username and password do not match any user in this service",errormsg.getText() );
			 
	 }
	 
	  
	 
	 @DataProvider
	 public String[][] data() {
		 
	 
		 
		// return new Object[] []  {{"standsdsdsaadard_user"},{"secret_sauce"}}; 
		 
		    String [][]  as= {{"standsdsdsaadard_user","secret_sauce"},{"problasdsadem_user","secret_sauce"}};
	//	 return new Object[] []  {{"standsdsdsaadard_user"},{"secret_sauce"}};
		   return as;
	 }
	 
 
}
