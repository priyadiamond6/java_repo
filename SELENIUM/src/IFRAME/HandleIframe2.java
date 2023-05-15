package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe2 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(3000);
	// To Switch from main page to frame page
	driver.switchTo().frame("singleframe");
	
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
	Thread.sleep(3000);
	
	// to switch from frame page to main page
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]")).click();
	Thread.sleep(10000);
	//driver.quit();

	}

}
