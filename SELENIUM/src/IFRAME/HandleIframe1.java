package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe1 {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

Thread.sleep(3000);

///To Switch Main page to Iframe Page
driver.switchTo().frame("iframeResult");

driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

driver.switchTo().defaultContent();

driver.findElement(By.id("tryhome")).click();

Thread.sleep(3000);
driver.quit();

	

	}

}
