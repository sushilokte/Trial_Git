package Test_01.Practice1_maven;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestCommon.BaseTest;

public class ErrorTest  extends BaseTest {
	
	
	
	

	 @Test(dataProvider="data")
	 
	 public void error(HashMap<String,String> input) throws InterruptedException, IOException {
		  
			l.goTo();
			Dashboard d = l.login(input.get("Username"),input.get("Password"));
			 assertEquals("Epic sadface: Username and password do not match any user in this service", l.errmsg());
			 
	 }
	 
	 
	 
	 @DataProvider
	 public Object[][] data() {
		 
		 HashMap<String,String> h = new HashMap<String,String>();
		 h.put("Username", "standdsdfard_user");
		 h.put("Password", "secret_sauce");
		 
		 
		 HashMap<String,String> h1 = new HashMap<String,String>();
		 h1.put("Username", "probsdflem_user");
		 h1.put("Password", "secret_sauce");
		 
		 return new Object[] []  {{h},{h1}};
	 }
	 
		
		 

}
