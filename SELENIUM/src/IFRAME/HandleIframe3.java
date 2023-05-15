package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe3 {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://demo.automationtesting.in/Frames.html");
Thread.sleep(3000);
// To Switch main page to iframe page

driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
Thread.sleep(3000);
WebElement Outerframe = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
driver.switchTo().frame(Outerframe);

WebElement Innerframe = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]"));
Thread.sleep(3000);
driver.switchTo().frame(Innerframe);
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
Thread.sleep(3000);
driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[@href=\"Index.html\"]")).click();
}

}
