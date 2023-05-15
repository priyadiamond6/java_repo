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

import net.bytebuddy.utility.RandomString;

public class Screenshot5 {

static WebDriver driver;
	public static void main(String[] args) throws IOException {
    
	// Full Page
		
	
System.setProperty ("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    driver = new ChromeDriver();
								
		driver.manage().window().maximize();
								
		driver.get("https://www.facebook.com/");
		
		WebElement A = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		WebElement P = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		
		TakeScreenShot(A, "Redbus");
		TakeScreenShot(P, "Instagram");
//		TakeScreenShot("Facebook3");
//		TakeScreenShot("Facebook4");
		
	}
	
	
	public static void TakeScreenShot  (WebElement element, String Filename) throws IOException  {
		
	File Source = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
	
	
		
	String Random = RandomString.make(9);
		
	File Dest = new File ("C:\\Users\\dell\\eclipse-workspace\\SELENIUM\\Screenshot\\"+Filename+""+Random+".png");

	FileHandler.copy(Source, Dest);
		
	}

	}

