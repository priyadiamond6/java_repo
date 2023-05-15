package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2MethodwithVariable {

	public static void main(String[] args) throws InterruptedException {
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebookjyt.com/");
		
		Thread.sleep(3000);
		
//		WebElement Email3 = driver.findElement(By.id("email"));
//		
//		Email.sendKeys("Kartik");
//		Thread.sleep(3000);
//		Email.clear();
//        Thread.sleep(3000);
//        Email.sendKeys("Priyanka");
      
        WebElement Password = driver.findElement(By.id("pass"));
        
        Password.sendKeys("******");
        Thread.sleep(3000);
        Password.clear();
        Thread.sleep(3000);
        Password.sendKeys("%%%%%%");
        
        System.out.println("Validation Completed");
        
        
        
	}

}
