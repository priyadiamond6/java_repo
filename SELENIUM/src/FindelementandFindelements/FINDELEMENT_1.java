package FindelementandFindelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FINDELEMENT_1 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\CD\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
Thread.sleep(3000);

WebElement searchbox = driver.findElement(By.xpath("//a[@href=\"/minitv?ref_=nav_avod_desktop_topnav\"]"));
searchbox.sendKeys("Oneplus");
Thread.sleep(3000);

WebElement best = driver.findElement(By.xpath("//a[@class=\"nav-a\"]"));
System.out.println(best.getText());

}

}
