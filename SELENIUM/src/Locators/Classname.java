package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

	public static void main(String[] args) {
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.intl=in");
		
		driver.findElement(By.className("phone-no")).sendKeys("JERADS");
		
		driver.findElement(By.className("button-container")).click();		
		

}
}