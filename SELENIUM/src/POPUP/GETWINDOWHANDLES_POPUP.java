package POPUP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETWINDOWHANDLES_POPUP {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\INSTALLER\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		
			Set<String> WindowID= driver.getWindowHandles();
			System.out.println(WindowID);
			// This method is used to store all the open windows IDs in the Set data
			//Iterator
			Iterator<String> it = WindowID.iterator();
			System.out.println(WindowID);
			
			String parentwindow = it.next();
			System.out.println("Parent Window"+parentwindow);
			
			String childwindow = it.next();
			System.out.println("Child Window"+childwindow); // or use ArrayList method
			//Converting Set into Array List
			
            ArrayList<String> Windowlist = new ArrayList<String>(WindowID);
            
            String ParentWindow = Windowlist.get(0);
            System.out.println("ParentWindow"+ParentWindow);
            
            String ChildWindow = Windowlist.get(1);
            System.out.println("ChildWindow"+ChildWindow);
            
            driver.switchTo().window(ChildWindow);
            
            driver.findElement(By.id("Form_getForm_Email")).sendKeys("priyankatornekar@gmail.com");
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
           Thread.sleep(3000);
            
           driver.quit();
			
			

	}

}
