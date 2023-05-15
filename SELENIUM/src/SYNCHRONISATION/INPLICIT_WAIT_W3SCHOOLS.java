package SYNCHRONISATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class INPLICIT_WAIT_W3SCHOOLS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String BaseURL = "https://www.w3schools.com/";
		driver.get(BaseURL);
		driver.findElement(By.id("search2")).sendKeys("Canvas");
		driver.findElement(By.id("learntocode_searchbtn")).click();
		//driver.quit();

	}

}
