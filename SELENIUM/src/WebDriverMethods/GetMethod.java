package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {

		// step 1 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		// step 2 
		 // upcasting - we create object of chromdriver class w.r.t.
        // webdriver interface (parentclass like). we can access the variables or
        // methods of webdriver into chromedriver. assigning 
		
		WebDriver driver = new ChromeDriver();
		
		// step 3
		
		driver.get("https://www.myntra.com/");
		
		
		
		
	}

}
