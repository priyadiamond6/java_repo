package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot_100 {
	
static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, IOException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		
		for (int i=0; i<=20; i++) {
			//System.out.println(i);
			Photo("Spring1");
		}
		
		
		
//		TakeScreenshot("Autumn2");
//		TakeScreenshot("Winter3");
			}

		public static void Photo (String Filename) throws IOException {
			//WebElement A = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String Random = RandomString.make(5);
			File Dest = new File ("C:\\Users\\dell\\eclipse-workspace\\SELENIUM\\Screenshot\\"+Filename+Random+" "+".png");
			FileHandler.copy(Source, Dest);
		
	}

}
