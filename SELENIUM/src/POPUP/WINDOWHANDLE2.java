package POPUP;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOWHANDLE2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\INSTALLER\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String BaseURL = "https://demoqa.com/browser-windows";
		
		driver.get(BaseURL);
		
		driver.findElement(By.id("windowButton")).click(); //  child window opens
	
		
		driver.manage().window().maximize();
		
		String ParentWindow = driver.getWindowHandle(); // current window or parent window ID
		System.out.println(ParentWindow);
		
		
		Set<String> ChildWindows = driver.getWindowHandles(); // all new window IDs print
		System.out.println(ChildWindows);
		
		for (String ChildWindow : ChildWindows) {
			
			if (!ParentWindow.equalsIgnoreCase(ChildWindow)) {
				
				driver.switchTo().window(ChildWindow);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				String Text = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(Text);
				driver.close();
			}
		}
		driver.switchTo().window(ParentWindow);
		String Text = driver.findElement(By.xpath("//div[@class=\"main-header\"]")).getText();
		System.out.println(Text);
//		driver.quit();
		
	}

}
