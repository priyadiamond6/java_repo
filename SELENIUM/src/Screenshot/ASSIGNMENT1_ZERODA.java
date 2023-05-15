package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ASSIGNMENT1_ZERODA {

	public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(source);
	
	File Dest = new File("C:\\Users\\dell\\Desktop\\ZERODA\\sample2.png");
	
	FileHandler.copy(source, Dest);
	
	driver.quit();

	}

}
