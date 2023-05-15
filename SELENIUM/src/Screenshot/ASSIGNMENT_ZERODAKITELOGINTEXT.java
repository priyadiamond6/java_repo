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

public class ASSIGNMENT_ZERODAKITELOGINTEXT {

public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
Thread.sleep(3000);
WebElement screen = driver.findElement(By.xpath("//h2[contains(text(),\"Login to Kite\")]"));
File source = ((TakesScreenshot)screen).getScreenshotAs(OutputType.FILE);
String Random = RandomString.make();
//String Imagename = ("Zeroda1");
File Dest = new File("C:\\Users\\dell\\Desktop\\ZERODA\\"+"Zeroda"+""+Random+".jpg");
FileHandler.copy(source, Dest);
driver.quit();

	

	}

}
