package TESTNG_KEYWORDS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PRIORITY {
	WebDriver driver;
	@BeforeMethod
	public void setup () {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
	@Test(priority=2)
	public void Users() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	System.out.println("Users");	
	}
	@Test(priority=3)
	public void demo1 () {
	String Title = driver.getTitle();
	System.out.println("Title--"+Title);
	}
	
	@Test(priority=1)
	public void Test() {
	boolean login = driver.findElement(By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")).isDisplayed();
	System.out.println("login--"+login);
	
}
	@Test
	public void Logo1() {
		System.out.println("Logo1");
	}

	@Test(priority = 5)
	public void Logo2() {
		System.out.println("Logo2");
	}

	@Test(priority = 4)
	public void Logo3() {
		System.out.println("Logo3");
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		
	}
}
