package POPUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FILEDOWNLOAD_POPUP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/download");
		
driver.findElement(By.xpath("//a[@href=\"download/logo.jpg\"]")).click();

String path = "C:\\Users\\dell\\Downloads\\picture5.png";
System.out.println(path);


	}

}
