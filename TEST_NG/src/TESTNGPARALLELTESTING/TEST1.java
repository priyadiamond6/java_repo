package TESTNGPARALLELTESTING;
// Parallel testing for multiple test cases
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TEST1 {
	WebDriver driver;
	@Test
	public void Demo1() {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.quit();

	}
	@Test
	public void Demo2() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Abc");
		
		driver.findElement(By.id("pass")).sendKeys("Xyz");
		driver.findElement(By.name("login")).click();
		
		driver.quit();

	}

}
