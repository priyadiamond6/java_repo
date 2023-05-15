package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSE_OVER_ACTION_DOUBLECLICK {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//        Thread.sleep(3000);
//        WebElement a = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
//	    Actions Act = new Actions(driver);
//	    Act.doubleClick(a).build().perform();
//	    Thread.sleep(3000);
//	    
//	   
//	    String c = driver.switchTo().alert().getText();
//	    System.out.println(c);
//	    driver.switchTo().alert().accept();
//	    driver.quit();
	    
		// by me 
	driver.get("https://www.amazon.com/");
	WebElement d = driver.findElement(By.id("nav-cart-count"));
	Actions Act = new Actions(driver);
	Act.moveToElement(d);
	Act.doubleClick().build().perform();
	Thread.sleep(3000);
	
	WebElement  e = driver.findElement(By.xpath(" //h2[contains(text(),'Your Amazon Cart is empty')]"));
	System.out.println(e.getText());

	
	}

}
