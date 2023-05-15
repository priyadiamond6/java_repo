package Com.Ecommerce.Testcases;

import org.testng.AssertJUnit;
import java.io.IOException;
import Com.Ecommerce.BaseClass.Ecommerce_Baseclass;
import Com.Ecommerce.PageClass.TC_ECOMMERCE_LOGINPAGE;
public class TC_LoginTestcase extends Ecommerce_Baseclass{
public void LoginTestCase() throws InterruptedException, IOException {
		
		logger.info("Open URL");
		TC_ECOMMERCE_LOGINPAGE TEL  = new TC_ECOMMERCE_LOGINPAGE();
		Thread.sleep(3000);

		TEL.Setemail(email);
		System.out.println("Hello");
		logger.info("Enter user mailL");
		Thread.sleep(3000);

		TEL.Setpassword(password);
		logger.info("Enter User password");

		Thread.sleep(3000);
		TEL.Click();
		logger.info("Clicked on longin button");
		Thread.sleep(3000);

		if(driver.getTitle().equals("Facebook")) {
			
			AssertJUnit.assertTrue(true);
			logger.info("Login Success");

		}
		else {
			System.out.println("screenshot");
			getScreenshotAs("LoginTestCase");
			AssertJUnit.assertTrue(false);
			logger.info("login failed");

		}
		
	}
}
