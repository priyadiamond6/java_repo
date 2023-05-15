package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KEYBOARDACTIONS {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/key_presses");
Thread.sleep(3000); 
Actions Act = new Actions(driver);
Thread.sleep(3000);


Act.sendKeys(Keys.BACK_SPACE).build().perform();
String Text1 = driver.findElement(By.id("result")).getText();
System.out.println(Text1);
Thread.sleep(3000);

Act.sendKeys(Keys.DELETE).build().perform();
String Text2 = driver.findElement(By.id("result")).getText();
System.out.println(Text2);
Thread.sleep(3000);

Act.sendKeys(Keys.ENTER).build().perform();
String Text3 = driver.findElement(By.id("result")).getText();
System.out.println(Text3);
Thread.sleep(3000);

Act.sendKeys(Keys.TAB).build().perform();
String Text4 = driver.findElement(By.id("result")).getText();
System.out.println(Text4);



}


}
