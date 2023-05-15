package TESTNG_KEYWORDS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GROUPS {

	WebDriver driver;
	@BeforeMethod
	public void setup () {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@Test(groups="OrangeHRMtitle")
public void OrangeHRMTitle() {
String Title = driver.getTitle();
System.out.println(Title);
}

@Test(groups="logo")
public void OrangeHRMlogo() {
boolean logo = driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?1666596668857\"]")).isDisplayed();
System.out.println(logo);
}

@Test(groups="logo")
public void OrangeHRMloginlogo() {
boolean loginlogo =driver.findElement(By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")).isDisplayed();
System.out.println(loginlogo);
}

@Test(groups="dashboard",enabled=false)
public void Dashboard() {
driver.findElement(By.name("//input[@name=\"username\"]")).sendKeys("Admin");
driver.findElement(By.name("//input[@name=\"password\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}

@Test(groups="dashboard",enabled=false)
public void Dashboardtimeatwork() {
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	driver.findElement(By.name("//input[@name=\"password\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
boolean timeatwork = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p\"]")).isDisplayed();	
System.out.println("timeatwork "+timeatwork);
}

@Test(groups="Test")
public void Test1() {
System.out.println("Test Class");
}
@AfterMethod
public void Teardown() {
	driver.quit();
}
}