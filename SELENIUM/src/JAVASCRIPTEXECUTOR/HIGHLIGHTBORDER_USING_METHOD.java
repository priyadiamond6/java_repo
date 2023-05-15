package JAVASCRIPTEXECUTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIGHLIGHTBORDER_USING_METHOD {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);

WebElement un = driver.findElement(By.id("email"));	
WebElement pd = driver.findElement(By.id("pass"));


drawborderun(un, driver);

drawborderpd(pd, driver);

	}
public static void drawborderun (WebElement element, WebDriver driver) {
	
JavascriptExecutor Js = (JavascriptExecutor) driver;
Js.executeScript("arguments[0].style.border = '10px Solid purple'", element);
Js.executeScript("arguments[0].style.background = 'Yellow'", element);	
}

public static void drawborderpd (WebElement ele, WebDriver driver) {

JavascriptExecutor Js = (JavascriptExecutor) driver;
Js.executeScript("arguments[0].style.border = '10px Solid red'", ele);
Js.executeScript("arguments[0].style.background = 'blue'", ele);
}


}
