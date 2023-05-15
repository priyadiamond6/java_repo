package TESTNGPARAMETERIZATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DEMO {
	WebDriver driver;
	@Parameters({"URL"})
	@BeforeMethod
	public void Setup(String URL) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get(URL);
		
	}
	
	@Parameters({"NAME","PASSWORD","USERNAME"})
	@Test
	public void ORangeHRMLogin(String name1,String Pass1,String Username1) {
		WebElement User=driver.findElement(By.name("username"));
	User.sendKeys(name1);
	WebElement Pass=driver.findElement(By.name("password"));
	Pass.sendKeys(Pass1);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String Username=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
	
	if(Username.equals(Username1)) {
		System.out.println("Correct usernmae");
	}
	else {
		System.out.println("Incorrect username");
	}
	}
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
