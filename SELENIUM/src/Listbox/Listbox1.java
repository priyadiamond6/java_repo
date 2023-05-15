package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox1 {

public static void main(String[] args) throws InterruptedException {
System.setProperty ("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//a[@role=\"button\" and @class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Priyanka");

driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");

driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("123456789");

driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("@#$%");

driver.findElement(By.xpath("//select[@id=\"day\"]")).click();

driver.findElement(By.xpath("//option[contains(text(),'7')]")).click();

driver.findElement(By.xpath("//select[@id=\"month\"]")).click();

driver.findElement(By.xpath("//option[contains(text(),'Jul')]")).click();

driver.findElement(By.xpath("//select[@id=\"year\"]")).click();

driver.findElement(By.xpath("//option[@value='2022']")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();
	
	
	
	
	}

}
