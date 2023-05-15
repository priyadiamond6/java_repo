package JAVASCRIPTEXECUTOR;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLL_DOWN_BOTTOM {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
Thread.sleep(3000);

JavascriptExecutor Js = (JavascriptExecutor) driver;

// Scroll down and up till bottom
Js.executeScript("window.scrollBy(0, document.body.scrollHeight)", " ");
Thread.sleep(3000);

Js.executeScript("document.documentElement.scrollTop=0", " ");
}

}
