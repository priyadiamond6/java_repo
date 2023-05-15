package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {

	public static void main(String[] args) {
	
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://webmail.au.syrahost.com/");
		
		driver.findElement(By.xpath("/html/body/div/form/div/div/input")).sendKeys("OPGFERWREFD");
		
		driver.findElement(By.xpath("/html/body/div/form/div/div[2]/input")).sendKeys("&*^&%^");
		
		driver.findElement(By.xpath("/html/body/div/form/div/div[3]/input")).click();

	}

}

