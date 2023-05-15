package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("wertyu");
		
	driver.findElement(By.id("pass")).sendKeys("@#$%^");
		
	driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
