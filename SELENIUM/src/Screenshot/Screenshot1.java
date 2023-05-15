package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
public static void main(String[] args) throws IOException  {
System.setProperty ("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
						
driver.manage().window().maximize();
						
//driver.get("https://www.facebook.com/");

driver.get("https://www.redbus.in/");

// Take Screenshot & copy into object 

File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //TakeScreenShot Interface & getScreenshot method
                                                                        //typecasting 

System.out.println(Source);

File Dest = new File ("C:\\Users\\dell\\Desktop\\SCREENSHOTS WEBDRIVER\sample13.png");

FileHandler.copy(Source, Dest);

driver.quit();

	}

}
