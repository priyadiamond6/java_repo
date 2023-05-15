package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

public static void main(String[] args) throws InterruptedException {
	
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

Thread.sleep(3000);

driver.findElement(By.id("email")).sendKeys("RJHGKG");

Thread.sleep(3000);

driver.findElement(By.id("pass")).sendKeys("*&^%^&#");

Thread.sleep(3000);

// Xpath by contains
driver.findElement(By.xpath("//button[contains(@id,\"u_0_5_\")]")).click();// dynamic id for log in so using xpath by contains
// here xpath by contains so instead of u_0_5_wQ only u_0_5_ used. // nosuchaelementexception
}
	

}
