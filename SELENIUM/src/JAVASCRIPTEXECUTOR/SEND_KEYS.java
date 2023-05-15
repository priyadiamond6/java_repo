package JAVASCRIPTEXECUTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEND_KEYS {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
// first way 

WebElement login = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));

JavascriptExecutor Js = (JavascriptExecutor) driver;
Js.executeScript("document.getElementById('email').value='PIYU_PATIL';");
Js.executeScript("document.getElementById('pass').value='87656';");
Thread.sleep(3000);

Js.executeScript("arguments[0].click()", login);
Thread.sleep(3000);
//driver.quit();
		
}

}
