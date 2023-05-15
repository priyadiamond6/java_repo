package DATADRIVENFRAMEWORK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF_WITHOUT_FRAMEWORK {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String Name = "Paul Collings";
	String Username = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
	System.out.println(Username);
	if (Name.equals(Username)) {
	System.out.println("correct username");
	}
	else {
		System.out.println("incorrect username");
	}
	driver.quit();
	}

}
