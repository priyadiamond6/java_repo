package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysandClickMethod {

public static void main(String[] args) throws InterruptedException {
		
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

driver.findElement(By.id("email")).sendKeys("KTSGHMJJH");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();

	}

}
