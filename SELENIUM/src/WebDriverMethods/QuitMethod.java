package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// step 1 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
				
				// step 2 
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				// step 3
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
				Thread.sleep(5000);

	//driver.close();
	
	driver.quit();
}
}