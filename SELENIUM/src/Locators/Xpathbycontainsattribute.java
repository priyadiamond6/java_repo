package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontainsattribute {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(3000);
	   
	   //xpath by contains attribute
	   
driver.findElement(By.xpath("//input[contains(@placeholder,\"Email address or phone\")]")).sendKeys("YDDHKHGK@");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[contains(@class,\"inputtext _55r1 _6luy _\")]")).sendKeys("^$%)^%$^");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[contains(@class,\"_42ft _4jy0 _6lth _4jy6 _4jy1 selec\")]")).click();

}
	
}
