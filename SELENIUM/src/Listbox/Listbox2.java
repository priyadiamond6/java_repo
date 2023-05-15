package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty ("webdriver.chrome.driver", "E:\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
						
		driver.manage().window().maximize();
						
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[@role=\"button\" and @class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Priyanka");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("@#$%");
	//Step 1.
		
		WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
	//Step 2.
		
//	1. Select element using selectbyvisibletext
		
        Select select1 = new Select(Day);
		select1.selectByVisibleText("7");
		
	
		Select select2 = new Select(Month);
		select2.selectByVisibleText("Jul");
		
	Select select3 =new Select(Year);
    select3.selectByVisibleText("2022");
    
    //2. select element using selectbyvalue

		
//
//Select select4 = new Select(Day);
//select4.selectByValue("7");
//
//
//Select select5 = new Select(Month);
//select5.selectByValue("7");
//
//Select select6 =new Select(Year);
//select6.selectByValue("2022");

		// 3. select element using selectbyindex
//Select select7 = new Select(Day);
//select7.selectByIndex(8);
//
//
//Select select8 = new Select(Month);
//select8.selectByIndex(8);
//
//Select select9 =new Select(Year);
//select9.selectByIndex(1);
//Thread.sleep(10000);
	}

}
