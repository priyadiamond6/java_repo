package POPUP;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WINDOWHANDLE1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALLER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		Thread.sleep(3000);
		
		Set<String> WindowID = driver.getWindowHandles();
		Iterator<String> it = WindowID.iterator();
		
		String ParentWindow = it.next(); // ID store
		System.out.println("parentwindow"+ParentWindow);
		
		String ChildWindow = it.next(); // ID store
		System.out.println("childwindow"+ChildWindow);
		
		
		//System.out.println("childwindow"+ChildWindow);
		driver.switchTo().window(ChildWindow);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		driver.switchTo().window(ParentWindow);
		Thread.sleep(3000);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
		driver.switchTo().window(ChildWindow);
		  driver.findElement(By.id("Form_getForm_Email")).sendKeys("priyankatornekar@gmail.com");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
          Thread.sleep(3000);
          driver.quit();
         
		
		
		
		
		
		
		
		
		
		
		

	}

}
