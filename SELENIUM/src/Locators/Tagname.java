package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("input")).sendKeys("HRHEWHE");
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("input")).sendKeys("&&*^&$#@@#$"); // element not intertraceable
	
		
	}
}
