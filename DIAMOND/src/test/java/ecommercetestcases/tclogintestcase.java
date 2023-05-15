package ecommercetestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ecommercebaseclass.baseclass;
import ecommercepageclass.tcloginpage;

public class tclogintestcase extends baseclass { // coz using driver here
	
@Test
public void logintestcase() {

tcloginpage TLP = new tcloginpage(); // object of tcloginpage coz all variables are present in it.

TLP.SetUsername("B@gmail.com");
TLP.SetPassword("dell@123");
TLP.ClickButton();

if (driver.getTitle().endsWith("nopCommerce demo store")) {
	Assert.assertTrue(true);
	}
else {
	Assert.assertTrue(false);
}

}



	

}

