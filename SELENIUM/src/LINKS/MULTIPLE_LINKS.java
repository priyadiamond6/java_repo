package LINKS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MULTIPLE_LINKS {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
// click on links
//driver.findElement(By.xpath("//a[@href=\"/gp/new-releases/?ref_=nav_cs_newreleases\"]")).click();
//driver.findElement(By.xpath("//a[@href=\"/gp/browse.html?node=6648217031&ref_=nav_cs_fashion\"]")).click();
	
	// how many links present on webpage
	List<WebElement> Links =driver.findElements(By.tagName("a"));
	System.out.println("Total Links:" +Links.size());
	
	// print all links // for each loop
//	for (WebElement link : Links) {
//		System.out.println(link.getText());
//		System.out.println(link.getAttribute("href"));
//	}
	for (int i=0; i<Links.size(); i++) {
		System.out.println(Links.get(i).getText());
		System.out.println();
		System.out.println(Links.get(i).getAttribute("href"));
		
	}
	driver.quit();
	}
}

