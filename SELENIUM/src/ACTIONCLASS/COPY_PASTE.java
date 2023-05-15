package ACTIONCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class COPY_PASTE {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);

WebElement input1 = driver.findElement(By.id("email"));
Thread.sleep(3000);

WebElement input2 =  driver.findElement(By.id("pass"));
Thread.sleep(3000);
 
input1.sendKeys("Hello Priyanka Tornekar");


Actions Act = new Actions(driver);



// CTRL + A
Act.keyDown(Keys.CONTROL);
Act.sendKeys("a");
Act.keyUp(Keys.CONTROL);
Act.build().perform();

// CTRL + C
Act.keyDown(Keys.CONTROL);
Act.sendKeys("c");
Act.keyUp(Keys.CONTROL);
Act.build().perform();

// TAB
Act.sendKeys(Keys.TAB).build().perform();

// CTRL + V
Act.keyDown(Keys.CONTROL);
Act.sendKeys("v");
Act.keyUp(Keys.CONTROL);
Act.build().perform();

System.out.println(input1.getAttribute("value"));
System.out.println(input2.getAttribute("value"));

//compare text
if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
	System.out.println("Correct text");
}
else {
	System.out.println("incorrect copied");
}



	}

}
