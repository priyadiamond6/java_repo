package POPUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIIDEN_SENDKEYS_POPUP {

	public static void main(String[] args) throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@autocomplete=\"off\"and@class=\"_2IX_2- VJZDxU\"]")).sendKeys("QUYGH");
	driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("(*#$%^&*");
	driver.findElement(By.id("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();


	

	}

}
