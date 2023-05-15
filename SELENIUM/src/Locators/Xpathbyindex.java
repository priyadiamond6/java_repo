package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyindex {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//img[@class=\"_396cs4  _3exPp9\"])[4]")).click();

	}

	
}
