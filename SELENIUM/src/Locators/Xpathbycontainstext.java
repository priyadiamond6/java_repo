package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontainstext {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(3000);
	   // xpath by containsattribute
	   driver.findElement(By.xpath("//input[contains(@class,\"inputtext _55r1 _6luy\")]")).sendKeys("RJGJELB@");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@aria-label,\"Password\")]")).sendKeys("*#$Q)&&");
		Thread.sleep(3000);
		
		//xpath bycontains by text
		
	driver.findElement(By.xpath("//button[contains(text(),\"Log \")]")).click();
		
		Thread.sleep(3000);
		
		
		
	}

}
