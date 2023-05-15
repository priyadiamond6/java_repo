package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox7_Assignment {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\INSTALLER\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
//	Dimension D = new Dimension(300, 1100);
//	driver.manage().window().setSize(D);
	
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("UTDT");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();

	
driver.findElement(By.xpath("//select[@id=\"Skills\"]")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//option[@value=\"APIs\"]")).click();

Thread.sleep(3000);

driver.quit();






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}