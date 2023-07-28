package Test_01.Practice1_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {

WebDriver driver;
	
	public FinalPage(WebDriver driver){
		 
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
 }
	
	@FindBy (css=".cart_item .inventory_item_name")
	WebElement finalp;
	
	public String finalepage() {
		String Orderconfirmation=	finalp.getText();
		return   Orderconfirmation;
	}
	
//	 String Orderconfirmation=	driver.findElement(By.cssSelector(".cart_item .inventory_item_name")).getText();
}
