package Screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
public class ScreenShot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty ("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
								
		driver.manage().window().maximize();
								
		driver.get("https://www.facebook.com/");

		// Take Screenshot & copy into object 

		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(5);
		
		String Imagename = ("Facebook7");
		
		File Dest = new File ("C:\\Users\\dell\\Desktop\\SCREENSHOTS WEBDRIVER\\"+Imagename+""+Random+".jpg");

		FileHandler.copy(Source, Dest);
		
		driver.quit();
	}

}
