package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSE_OVER_ACTION_CLICK {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
//		WebElement a = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		
//		Actions Act = new Actions(driver);
//		Act.moveToElement(a).build().perform(); // can use only perform() also
//		Thread.sleep(3000);
//		driver.quit();
		
		WebElement b = driver.findElement(By.xpath("//span[@class=\"nav-cart-icon nav-sprite\"]"));
		
//		Actions Act = new Actions(driver);
//		Act.moveToElement(b).build().perform();
		
		 Actions Act = new Actions(driver);
	    Act.doubleClick(b).build().perform();
	    Thread.sleep(3000);
	    
	    String c = driver.switchTo().alert().getText();
	    System.out.println(b);
	    driver.switchTo().alert().accept();
	    driver.quit();
	    

	}

}
