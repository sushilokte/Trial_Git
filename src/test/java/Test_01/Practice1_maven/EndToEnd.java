package Test_01.Practice1_maven;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestCommon.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEnd extends BaseTest {

	@Test(dataProvider="getData")

	public void maintest(String uname,String pword ) throws IOException, InterruptedException {

	 
		By findy = By.cssSelector(".inventory_item_description");
        l.goTo();
		Dashboard d = l.login(uname,pword);
		l.waitForElement(findy);

		d.getAllproduct();
		CartPage ch = d.AddToCart();

		d.GoToCart();
		String ProducOnCart = ch.GetProductOncart();

		boolean b = ProducOnCart.equalsIgnoreCase("Sauce Labs Backpack");
		Assert.assertTrue(b);
		CheckOutPage c1 = ch.goToCheckout();

		FinalPage f = c1.checkcout("test", "test", "40005");

		boolean c = f.finalepage().equalsIgnoreCase("Sauce Labs Backpack");
		Assert.assertTrue(c);

	}
	
	
	@DataProvider
public  String[][] getData() {
		
		 return new String[] []  {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
		
	}
	
	

}
