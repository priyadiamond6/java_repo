package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT_IFRAME {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/frames");

driver.switchTo().frame("frame1");
String Text =  driver.findElement(By.id("sampleHeading")).getText();
System.out.println(Text);

boolean b =  driver.findElement(By.id("sampleHeading")).isDisplayed();
System.out.println(b);
driver.quit();

	}

}
