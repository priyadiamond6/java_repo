package POPUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PERMISSION_HDFC_POPUP {

public static void main(String[] args) {
	
ChromeOptions option = new ChromeOptions();
option.addArguments("disable-notifications");

System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver(option);
driver.manage().window().maximize();
driver.get("https://www.hdfcbank.com/");
		
		
	}

}
