package JAVASCRIPTEXECUTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLICK_ACTION {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);	

driver.findElement(By.id("email")).sendKeys("PIYU_Patil");
driver.findElement(By.id("pass")).sendKeys("56789");
		
WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		
JavascriptExecutor Js = (JavascriptExecutor) driver;
Js.executeScript("arguments[0].click();", login);

Thread.sleep(6000);
//driver.quit();
	}

}
