package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.utility.RandomString;

public class ZERODAMULTIPLESCREENSHOTLOGINPAGE {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
Thread.sleep(3000);
TakeScreenshot("Spring1");
TakeScreenshot("Autumn2");
TakeScreenshot("Winter3");
	}

public static void TakeScreenshot (String Filename) throws IOException {
	//WebElement A = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String Random = RandomString.make(5);
	File Dest = new File ("C:\\Users\\dell\\eclipse-workspace\\SELENIUM\\Screenshot\\"+Filename+Random+" "+".png");
	FileHandler.copy(Source, Dest);
	

}

}
