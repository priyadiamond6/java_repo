package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//step 1
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		// step 2 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// step 3
		
		driver.get("https://www.facebook.com/priyankatornekar");
		
		Thread.sleep(3000);
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		
	    String Page2 = driver.getTitle();
		System.out.println(Page2);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(6000);
		
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	
	driver.quit();
	}

}
