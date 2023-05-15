package POPUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT_DISMISS_POPUP {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(3000);

driver.get("https://the-internet.herokuapp.com/javascript_alerts");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
driver.switchTo().alert().dismiss();

boolean b = driver.findElement(By.xpath("//p[@style=\"color:green\"]")).isDisplayed();
System.out.println(b);



}
}
