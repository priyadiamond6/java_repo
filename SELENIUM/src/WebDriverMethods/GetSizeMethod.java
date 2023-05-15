package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		// step 2 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// step 3
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		System.out.println(driver.manage().window().getSize());
		
		Dimension Size = new Dimension (924,500); // width, height
		
		driver.manage().window().setSize(Size); 
		
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getSize());
		
        driver.quit();
	}

}
