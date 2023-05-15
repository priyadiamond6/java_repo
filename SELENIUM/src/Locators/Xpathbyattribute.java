package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("priyankatornekar@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("lakshmi6");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@height=\"876\"]")).click();
		
		
		
		 
		
	}

}
