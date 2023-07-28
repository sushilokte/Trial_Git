package Test_01.Practice1_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
WebDriver driver;


	
	public CheckOutPage(WebDriver driver){
		 
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
 }
	
	
	@FindBy (css="#first-name")
	WebElement fname;
	
	@FindBy (css="#last-name")
	WebElement lname;
	
	@FindBy (css="#postal-code")
	WebElement pcode;
	
	@FindBy (css="#continue")
	WebElement continueb;
	
	
	public FinalPage checkcout(String fname1,String lname1, String code){
		fname.sendKeys(fname1);
		lname.sendKeys(lname1);
		pcode.sendKeys(code);
		continueb.click();
		
		 FinalPage f = new FinalPage(driver);
		 return f;
	}
	
	
 	
//	  driver.findElement(By.cssSelector("#first-name")).sendKeys("test");
//	  driver.findElement(By.cssSelector("#last-name")).sendKeys("test");
//	  driver.findElement(By.cssSelector("#postal-code")).sendKeys("444005");
	// driver.findElement(By.cssSelector("#continue")).click();	
	

}
