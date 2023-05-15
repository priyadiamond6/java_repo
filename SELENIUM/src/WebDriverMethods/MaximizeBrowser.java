package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// step 1 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		// step 2 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		// step 3
		
		
		driver.get("https://www.facebook.com/priyankatornekar");
		
		Thread.sleep(4000);
	}

}
