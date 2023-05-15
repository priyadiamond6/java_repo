package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://app.hubspot.com/login");
					//BY ID
driver.findElement(By.cssSelector("input#username")).sendKeys("@*^$#%#$");
//BY TAGNAME
driver.findElement(By.cssSelector("input#password")).sendKeys("HDFGHJWK");
//BY CLASSAME// use tagname. before classname value// we can use partial classname
//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("OFDEDFFG");
//BY CLASSNAME
//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password")).sendKeys("*%$^&**");

//driver.findElement(By.cssSelector("span.UICheckbox__PrivateCheckboxIndicator-g938e0-1.eXrqFy")).click();

	
}
}