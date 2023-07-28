package Test_01.Practice1_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCommon.CommonElements;

public class loginPage extends CommonElements {
	WebDriver driver;
	
	public loginPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
 public void goTo() {
	 driver.get("https://www.saucedemo.com/");
 }
	
	@FindBy (css="#user-name")
	WebElement username;
	
	@FindBy (css="#password")
	WebElement password;
	
	@FindBy (css="#login-button")
	WebElement loginbutton;
	
	@FindBy (xpath="//h3")
	WebElement errormsg;
	
	
	 public Dashboard login(String name, String password1) {
		 
		 username.sendKeys(name);
		 password.sendKeys(password1);
		 loginbutton.click();
		 
		 Dashboard d = new Dashboard (driver);
				 return d;
		 
	 }
	 
	 
	 public String errmsg() throws InterruptedException {
		 Thread.sleep(3000);
		String n= errormsg.getText();
		return n;
	 }
	

}
