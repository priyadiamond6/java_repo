package SYNCHRONISATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMPLICIT_WAIT_FACEBOOK{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String BaseURL = "https://www.facebook.com/";
		driver.get(BaseURL);
		driver.findElement(By.id("email")).sendKeys("Iceland");
		driver.findElement(By.id("pass")).sendKeys("Switzerland");
		Thread.sleep(3000);
		//driver.quit();


	}

}
