package POPUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTHENTICATION_HEROKAPS_POPUP {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

Thread.sleep(3000);

String str = driver.findElement(By.xpath("//p[contains(text(), \"Congratulations! \")]")).getText();
System.out.println(str);
Thread.sleep(3000);
boolean b = driver.findElement(By.xpath("//p[contains(text(), \"Congratulations! \")]")).isDisplayed();
System.out.println(b);

}

}
