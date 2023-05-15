package TESTNGDATAPROVIDER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATAPROVIDER2 {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		// driver.get("https://admin-demo.nopcommerce.com/login");

	}

	@Test(dataProvider = "Login")
	public void nopcommerceLoginTest(String Username, String Password, String Expected) {

		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement User = driver.findElement(By.id("Email"));
		User.clear();
		User.sendKeys(Username);

		WebElement Pass = driver.findElement(By.id("Password"));
		Pass.clear();
		Pass.sendKeys(Password);

		WebElement Button = driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
		Button.click();

		String Actual_Result = driver.getTitle();

		String Expected_Result = "Dashboard / nopCommerce administration";

		if (Expected.equals("Valid")) {

			if (Expected_Result.equals(Actual_Result)) {
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);

			}
		} else if (Expected.equals("Invalid")) {

			if (Expected_Result.equals(Actual_Result)) {
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);

			}
		}

	}

	@DataProvider(name = "Login")
	public String[][] Logindata() {

String Userdata[][] = { 
		              { "admin@yourstore.com", "admin", "Valid" },
				      { "admin@yourstore.com", "admin123", "Invalid" }, 
				      { "admin@yourstore123.com", "admin", "Invalid" },
				      { "admin12@yourstore.com", "admin123", "Invalid" } 
				      };

		return Userdata;
	}

	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
