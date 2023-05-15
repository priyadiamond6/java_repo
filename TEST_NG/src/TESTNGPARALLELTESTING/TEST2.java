package TESTNGPARALLELTESTING;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TEST2 {
	WebDriver driver;

	@Test
	public void Link() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Abc");
		
		driver.findElement(By.id("pass")).sendKeys("Xyz");		

		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		driver.quit();

	}
	@Test
	public void Link1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Abc");
		
		driver.findElement(By.id("pass")).sendKeys("Xyz");		

		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		driver.quit();
	}

}
