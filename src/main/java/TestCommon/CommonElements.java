package TestCommon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CommonElements {
	
	WebDriver driver;
	public CommonElements(WebDriver driver){
		this.driver=driver;
 		PageFactory.initElements(driver, this);
		
	}
	
  public void waitForElement(By findby) {
	  
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(findby));
  }

  @FindBy (css=".shopping_cart_link")
  WebElement cart;
  
  
  public void GoToCart() {
	   cart.click();
	   
	   System.out.println("newly added code changes");
	   System.out.println("newly added code changes");
	    
  }
  
  
  @Test
	
	public void change() {
		System.out.println("architech changes");
	}
  
  @Test
  public void develop() {
		System.out.println("develop branch");
	}
  
  
}
