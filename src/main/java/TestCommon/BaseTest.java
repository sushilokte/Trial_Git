package TestCommon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Test_01.Practice1_maven.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	WebDriver driver;
 	public loginPage l;
	public WebDriver initializetest() throws IOException {
		
		Properties pro = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Practice1_maven\\src\\main\\java\\Test_01\\Practice1_maven\\Base.Properties");
		
		//System.getProperty("user.dir")
		
		pro.load(fis);
		String name=pro.getProperty("browser");
		
		 if(name.equalsIgnoreCase("chrome")) {
			 
				WebDriverManager.chromedriver().setup();
				  driver = new ChromeDriver();
				 // driver.manage().window().maximize();
	  }
		
		
		return driver;
		
	}
	
 	@BeforeTest
	public loginPage lunch() throws IOException {
		
		initializetest();
		 l = new loginPage(driver);
		 
		 System.out.println("second change");
		return l;
	}
	
 
	

}
