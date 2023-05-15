package ecommercebaseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ecommerceutilities.testutils;

public class baseclass {
	
public static WebDriver driver;
@BeforeMethod	
public void Setup() {
System.setProperty("WebDriver.chrome.driver", "E:\\INSTALLER\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(testutils.implicitwait, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(testutils.pageload, TimeUnit.SECONDS);
driver.get("https://demo.nopcommerce.com/login");
}

@AfterMethod
public void TearDown() {
	driver.quit();
}
}

