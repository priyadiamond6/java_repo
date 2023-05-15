package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox9_Assignment {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    WebDriver  driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("UTDT");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();
		
		driver.findElement(By.xpath("//select[@placeholder=\"Year\"]")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'1923')]")).click();
		
		driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'June')]")).click();
		
		driver.findElement(By.xpath("//select[@placeholder=\"Day\"]")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'8')]")).click();
			}

}
