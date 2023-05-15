package TESTNG_KEYWORDS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ENABLED {
	WebDriver driver;
	@BeforeMethod
	public void setup () {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
	@Test
	public void users() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	System.out.println("users");	
	}
	@Test(enabled=false)
	public void demo1 () {
	String Title = driver.getTitle();
	System.out.println("Title--"+Title);
	}
	
	@Test(enabled=false)
	public void Test() {
	boolean login = driver.findElement(By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")).isDisplayed();
	System.out.println("login--"+login);
}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
