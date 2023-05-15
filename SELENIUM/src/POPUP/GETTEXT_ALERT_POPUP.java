package POPUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETTEXT_ALERT_POPUP    {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

driver.findElement(By.id("login1")).sendKeys("PIYU");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
Thread.sleep(3000);

Alert Popup = driver.switchTo().alert();
System.out.println(Popup.getText());

String Text = Popup.getText();

if (Text.equals("Please enter your password")) {
	System.out.println("Correct Alert Message");
}
	else 
		System.out.println("Incorrect Alert Message");
        Popup.accept();
	}
		
}


