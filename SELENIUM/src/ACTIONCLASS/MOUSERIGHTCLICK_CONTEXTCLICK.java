package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSERIGHTCLICK_CONTEXTCLICK {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions Act = new Actions(driver);
	    WebElement Button =	driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Act.contextClick(Button).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//driver.quit();
		
	
	}

}
