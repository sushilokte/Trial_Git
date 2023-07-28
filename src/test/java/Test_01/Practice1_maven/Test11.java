package Test_01.Practice1_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		
	//	driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		
		//	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//	driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		//	driver.findElement(By.cssSelector("#login-button")).click();
			
			
		//	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".inventory_item_description")));
			 
			
		 	
		 	
		 	
		 	//check available product and add it to the cart
			
		//	List<WebElement> products=driver.findElements(By.cssSelector(".inventory_item_description"));
		// 	WebElement product=	products.stream().filter(s->s.findElement(By.cssSelector(".inventory_item_name"))
		// 			.getText().equalsIgnoreCase("Sauce Labs Backpack")).findFirst().orElse(null);
		 	
		 //	product.findElement(By.cssSelector(".btn_small")).click();
		 	
		 	
		 	// Go to cart
		 	
		// 	driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		 	
		//	 String ProducOnCart=	driver.findElement(By.cssSelector(".cart_item .inventory_item_name")).getText();
		//	 boolean b =ProducOnCart.equalsIgnoreCase("Sauce Labs Backpack");
		//	Assert.assertTrue(b);
			
		 
		// 	driver.findElement(By.cssSelector("#checkout")).click();
		 	
		 	//check-out page
		 	
//		  driver.findElement(By.cssSelector("#first-name")).sendKeys("test");
		//  driver.findElement(By.cssSelector("#last-name")).sendKeys("test");
		//  driver.findElement(By.cssSelector("#postal-code")).sendKeys("444005");
		// driver.findElement(By.cssSelector("#continue")).click();
				  
		 //Final page
		 
		// String Orderconfirmation=	driver.findElement(By.cssSelector(".cart_item .inventory_item_name")).getText();
			
		// boolean c = Orderconfirmation.equalsIgnoreCase("Sauce Labs Backpack");
		// Assert.assertTrue(c);
		
		
		
		
		
	}

	 
	
	
	
}
