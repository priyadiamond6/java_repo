package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3 {

	public static void main(String[] args) throws InterruptedException {
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
		
		String DOB = "9/9/1987";
		
		String Date[]=DOB.split("/");
		
		// 0 = 9
		// 1 = 9
		// 2 = 1987
		
//		Listbox(Day, "22");
//		Listbox(Month, "4");
//		Listbox(Year, "2020");
		
		 Listbox(Day, Date[0]);
		 Listbox(Month, Date[1]);
         Listbox(Year, Date[2]);
		 
	}
	public static void Listbox(WebElement element, String value) {
		Select select1 = new Select(element);
		select1.selectByValue(value);
	}

}
