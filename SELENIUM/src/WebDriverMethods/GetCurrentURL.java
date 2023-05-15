package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCurrentURL {

	public static void main(String[] args) {
		
		// step 1 
				System.setProperty("webdriver.chrome.driver", "E:/INSTALLER/chromedriver_win32/chromedriver.exe");
				
				// step 2 
				ChromeOptions options  = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				
				
				// step 3
				
				driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
				
//				String URL = driver.getCurrentUrl();
//				System.out.println(URL);

	}

}
