package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver.exe");
		
		// step 2 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// step 3
		driver.get("https://youtu.be/SqnnOG4HwOk");
		
		Thread.sleep(5000);
		
		Dimension Size = new Dimension (300,500);
		
		driver.manage().window().setSize(Size);
		System.out.println(driver.manage().window().getSize());
		
		Point PO = new Point(500,200);
		
		Thread.sleep(15000);
		
		driver.manage().window().setPosition(PO);
		System.out.println(driver.manage().window().getPosition());
		driver.quit();

	}

}
