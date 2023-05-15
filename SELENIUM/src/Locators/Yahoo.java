package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

public static void main(String[] args) throws InterruptedException {
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
					
WebDriver driver = new ChromeDriver();
					
driver.manage().window().maximize();

driver.get("https://login.yahoo.com/?.intl=in");

//xpath by attribute
//driver.findElement(By.id("login-username")).sendKeys("OREFDCV");
//Thread.sleep(3000);
//driver.findElement(By.id("login-signin")).click();

//xpath by name
//driver.findElement(By.name("username")).sendKeys("OJKTRERDF");
//driver.findElement(By.name("signin")).click();

//xpathbyclassname
//driver.findElement(By.className("phone-no")).sendKeys("(*(#@$%");
//driver.findElement(By.className("pure-button")).click();

//CSS selector by ID & Tagname
//driver.findElement(By.cssSelector("#login-username")).sendKeys("LTFGCNB");
//driver.findElement(By.cssSelector("input#login-signin")).click();

//by linktext
//driver.findElement(By.linkText("Forgotten username?")).click();

//by partiallinktext
driver.findElement(By.partialLinkText("username")).click();

	}

}
