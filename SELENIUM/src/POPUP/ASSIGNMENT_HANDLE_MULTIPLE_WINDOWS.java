package POPUP;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT_HANDLE_MULTIPLE_WINDOWS {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])")).click();
		
		Set<String> WindowID =  driver.getWindowHandles();
		System.out.println(WindowID);
		
		Iterator<String> it = WindowID.iterator();
		
		String parentwindow = it.next();
		System.out.println("ParentWindow"+parentwindow);
		
		String childwindow = it.next();
		System.out.println("ChildWindow"+childwindow);
		
		driver.switchTo().window(childwindow);
		driver.getWindowHandle();
		
		boolean b = driver.findElement(By.xpath("//a[@title=\"Home\"]")).isDisplayed();
		System.out.println(b);
		Thread.sleep(3000);
		
	driver.switchTo().window(parentwindow);
	String s = driver.getWindowHandle();
    System.out.println(s);
	Thread.sleep(3000);
		
	boolean run = driver.findElement(By.xpath("//button[contains(text(),\"Run ❯\")]")).isDisplayed();
	System.out.println(run);
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
}

}
