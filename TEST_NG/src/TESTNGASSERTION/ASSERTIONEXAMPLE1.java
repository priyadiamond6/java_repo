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



public class ASSERTIONEXAMPLE1 {
	
	WebDriver driver;
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
	@BeforeMethod
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void OrangeHRM() throws InterruptedException {
		WebElement Username=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		WebElement Password=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		
		//Assertion true
		 
		Assert.assertTrue(Username.isDisplayed());   // True
		Username.sendKeys("Admin");
	
		
		Assert.assertTrue(Password.isDisplayed());  // True
		Password.sendKeys("admin123");
	}
	
	

}
