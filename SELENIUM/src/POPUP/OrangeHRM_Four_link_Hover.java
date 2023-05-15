package POPUP;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Four_link_Hover {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\CD\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);
 String ParentWindow =driver.getWindowHandle();
 System.out.println(ParentWindow);
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
driver.switchTo().window(ParentWindow);
driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();
driver.switchTo().window(ParentWindow);
driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")).click();
driver.switchTo().window(ParentWindow);
driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]")).click();
driver.switchTo().window(ParentWindow);

Set<String> WindowIDs = driver.getWindowHandles();
System.out.println(WindowIDs);

ArrayList<String> Titles = new ArrayList<String> (WindowIDs);
System.out.println();
String Parent = Titles.get(0);
String LinkedIn = Titles.get(1);
String Facebook = Titles.get(2);
String Twitter = Titles.get(3);
String Youtube = Titles.get(4);
for(int i=0; i<=4; i++) {
	driver.switchTo().window(Titles.get(i));
	String Title = driver.getTitle();
	System.out.println(Title);
}
		
}

}


