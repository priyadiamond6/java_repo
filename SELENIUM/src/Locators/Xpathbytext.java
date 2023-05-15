package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytext {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(3000);
	   
	   // xpath by attribute
	   
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("RJGJELB@");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("*#$Q)&&");
		Thread.sleep(3000);
	  

	//xpath by text
		//tagname[text()="textvalue"]
	
	driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();	   
	
	

	}

}
