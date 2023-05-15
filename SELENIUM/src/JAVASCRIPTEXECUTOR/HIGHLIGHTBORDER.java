package JAVASCRIPTEXECUTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIGHLIGHTBORDER {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://en-gb.facebook.com/");
Thread.sleep(3000);

WebElement fblogo = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));

WebElement un = driver.findElement(By.id("email"));

JavascriptExecutor Js =(JavascriptExecutor) driver;

Js.executeScript("arguments[0].style.border='10px solid Purple'", fblogo);

Thread.sleep(3000);

Js.executeScript("arguments[0].style.border='10px Solid Orange'", un);


 
 //driver.quit();


}

}
