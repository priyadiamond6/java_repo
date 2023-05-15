package SYNCHRONISATION;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EXPLICIT_WAIT {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
String BaseURL = "https://www.redbus.in/";
driver.get(BaseURL);

WebDriverWait Mywait1 = new WebDriverWait(driver,Duration.ofSeconds(15));
WebElement Element1 = Mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
Element1.sendKeys("Pune");
//Thread.sleep(3000);

WebDriverWait Mywait2 = new WebDriverWait(driver,Duration.ofSeconds(15));
// if path given wrong(ex.dest8 of element2) it will throw timeoutexception after 20 seconds
WebElement Element2 = Mywait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest8")));
Element2.sendKeys("Mumbai");
	
}

}
