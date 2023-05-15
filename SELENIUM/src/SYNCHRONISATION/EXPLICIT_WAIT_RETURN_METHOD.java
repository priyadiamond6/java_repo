package SYNCHRONISATION;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EXPLICIT_WAIT_RETURN_METHOD {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	String BaseURL = "https://www.facebook.com/";
	driver.get(BaseURL);
	
	By Input1 = By.id("email");
	WaitforElement(driver, Input1, 20).sendKeys("Kartik");
	By Input2 = By.id("pass22"); // wrong id so will wait for 20 seconds// will show timeoutexceptin & 
	                             // Nosuchelementexception
	WaitforElement(driver, Input2, 15).sendKeys("Patil");
	
	}
public static WebElement WaitforElement (WebDriver driver, By Locator, int Timeout) {
	
	WebDriverWait MyWait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
	MyWait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	return driver.findElement(Locator);
}
}