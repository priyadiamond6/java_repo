package TESTNG_KEYWORDS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class INCLUDE_EXCLUDE_TEST_CASES {
WebDriver driver;
@Test
public void Setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@Test
public void Users() {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	System.out.println("Users");
}

@Test
public void Homepage() {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	System.out.println("Users1");
}

}

