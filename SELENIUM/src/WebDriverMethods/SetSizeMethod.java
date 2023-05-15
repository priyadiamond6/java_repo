package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
			
			// step 2 
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			// step 3
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(5000);
		
			Dimension a = new Dimension (700,800); // width, height
			
			driver.manage().window().setSize(a); 
			
			Thread.sleep(5000);
			
			driver.quit();
			

	}

}
