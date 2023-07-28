package Test_01.Practice1_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

WebDriver driver;
	
	public CartPage(WebDriver driver){
		 
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
 }
	
	
	@FindBy (css=".cart_item .inventory_item_name")
	WebElement productCart;
	
	public String GetProductOncart() {
		 String ProducOnCart=productCart.getText();
		 return ProducOnCart;
	}
	
	
	@FindBy (css="#checkout")
	WebElement checkout;
	
	public CheckOutPage goToCheckout() {
		checkout.click();
		
		CheckOutPage c1 = new CheckOutPage(driver);
		return c1;
	}
	
	
//	 String ProducOnCart=	driver.findElement(By.cssSelector(".cart_item .inventory_item_name")).getText();
//	 boolean b =ProducOnCart.equalsIgnoreCase("Sauce Labs Backpack");
	
	//driver.findElement(By.cssSelector("#checkout")).click();
}
