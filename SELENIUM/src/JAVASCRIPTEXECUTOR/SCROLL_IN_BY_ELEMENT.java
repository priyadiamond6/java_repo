package JAVASCRIPTEXECUTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLL_IN_BY_ELEMENT {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/");
Thread.sleep(3000);	

JavascriptExecutor Js = (JavascriptExecutor) driver;
WebElement canvas = driver.findElement(By.xpath("//h2[contains(text(),'Canvas')]"));

Js.executeScript("arguments[0].scrollIntoView();", canvas);
		Thread.sleep(3000);
		driver.quit();

	}

}
