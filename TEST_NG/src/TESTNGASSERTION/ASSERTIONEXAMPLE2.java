package TESTNGASSERTION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ASSERTIONEXAMPLE2 {
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
public void OrangeHRM () {
WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	
// Assertion True
 Assert.assertTrue(username.isDisplayed()); // true
 username.sendKeys("Admin");
 Assert.assertTrue(password.isDisplayed());   // true
 password.sendKeys("admin123");
 
 // Assertion False
// Assert.assertFalse(username.isDisplayed());
// username.sendKeys("Admin");
// Assert.assertFalse(username.isDisplayed());
// password.sendKeys("amin123");
	}
 @Test
 public void demo() {
WebElement UN = driver.findElement(By.xpath("//input[@name=\"username\"]"));
WebElement PW = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	 
Assert.assertTrue(true);
UN.sendKeys("Admin");
Assert.assertTrue(PW.isDisplayed());
PW.sendKeys("admin123");

driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
String Text = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
 Assert.assertEquals(Text, "Pritesh Mhatre");
 
 }

@AfterMethod
public void Teardown() throws InterruptedException {
driver.quit();
}
 
 
	
	
	}


