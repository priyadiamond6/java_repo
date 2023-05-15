package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe4 {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

driver.switchTo().frame("iframeResult");

driver.switchTo().frame(0);

String Text1 = driver.findElement(By.xpath("//h1[contains(text(),\"This page is displayed in an iframe\")]")).getText();
System.out.println(Text1);

driver.switchTo().parentFrame();
String Text2 = driver.findElement(By.xpath("//p[contains(text(),\"You can use the height and width attributes to specify the size of the iframe:\")]")).getText();
System.out.println(Text2);
//
driver.switchTo().defaultContent();
//driver.quit();
	}

}
