package POPUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETWINDOWHANDLE_POPUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALLER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String WindowID = driver.getWindowHandle(); // return type of get windowhandle is string.
		System.out.println(WindowID);
//		driver.quit();// every time we open the browser new id is generated as below line no 17 & 18
		//CDwindow-B692E9BB22477BB4089ABBD5EDEC34DB
		//CDwindow-F80ED633E2F5B332F106654955BD4D21
		
		
		

	}

}
