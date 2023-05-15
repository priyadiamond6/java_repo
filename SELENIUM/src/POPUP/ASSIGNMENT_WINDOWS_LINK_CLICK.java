package POPUP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT_WINDOWS_LINK_CLICK {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\CD\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);

Set<String> WindowID= driver.getWindowHandles();
System.out.println(WindowID);

ArrayList<String> Windowlist = new ArrayList<String>(WindowID);

String ParentWindow = Windowlist.get(0);
System.out.println("ParentWindow"+ParentWindow);


String ChildWindow = Windowlist.get(1);
System.out.println("ChildWindow"+ChildWindow);
driver.switchTo().window(ChildWindow);
driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
driver.switchTo().window(ChildWindow);





		
		
		
		
		
		
	}

}
