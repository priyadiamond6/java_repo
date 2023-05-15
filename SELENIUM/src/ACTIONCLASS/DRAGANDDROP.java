package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAGANDDROP {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
Thread.sleep(3000); 

WebElement source = driver.findElement(By.id("box3"));
WebElement target = driver.findElement(By.id("box103"));
Actions Act = new Actions(driver);
Thread.sleep(3000);
Act.dragAndDrop(source, target).build().perform();

}
}
