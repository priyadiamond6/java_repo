package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Kartik");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("Priyanka");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).clear();
	}

}
