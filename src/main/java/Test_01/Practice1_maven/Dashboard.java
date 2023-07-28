package Test_01.Practice1_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCommon.CommonElements;

public class Dashboard extends CommonElements {
	WebDriver driver;
	
	public Dashboard(WebDriver driver){
		super(driver);
		 
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
 }
	
	@FindBy (css=".inventory_item_description")
	List<WebElement> products;
	
	 
       public  WebElement  getAllproduct() {
		
		List<WebElement> mprodcut= products;
		WebElement product=	products.stream().filter(s->s.findElement(By.cssSelector(".inventory_item_name"))
	 			.getText().equalsIgnoreCase("Sauce Labs Backpack")).findFirst().orElse(null);
		 
		return product;
	}
       
   By button=    By.cssSelector(".btn_small");
   
   
       public CartPage AddToCart() throws InterruptedException {
    	   getAllproduct().findElement(button).click();
    	   
    	   Thread.sleep(3000);
    	   
    	   CartPage ch= new CartPage(driver);
    	   return ch;
       }
	
	
	
	//List<WebElement> products=driver.findElements(By.cssSelector(".inventory_item_description"));
 	//WebElement product=	products1.stream().filter(s->s.findElement(By.cssSelector(".inventory_item_name"))
 	//		.getText().equalsIgnoreCase("Sauce Labs Backpack")).findFirst().orElse(null);
 	
 	//product.findElement(By.cssSelector(".btn_small")).click();
	
}