package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
                           // "webdriver.chrome.driver"
		
		
		WebDriver driver = new ChromeDriver(); // this is method of launching browser
		                                       // Upcasting. webdriver is interface.
		
	//	driver.get("https://youtu.be/yklDT_Km15E");
	}

}
