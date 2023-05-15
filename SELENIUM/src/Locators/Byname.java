package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byname {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("FDIUYWI");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("pass");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();

	}

}
