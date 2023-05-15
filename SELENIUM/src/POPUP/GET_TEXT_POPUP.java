package POPUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET_TEXT_POPUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(3000);
		String Text =	"I am a JS prompt";
		Alert Text1 = driver.switchTo().alert();
		String PopupMessage = Text1.getText();
		System.out.println("Alert Message :"+PopupMessage);
		if (Text.equals(PopupMessage)) {
			System.out.println("Correct message");
			}
		else {
			System.out.println("Incorrect message");
		}
		Text1.sendKeys("Automation Class");
		Text1.accept();
		boolean b = driver.findElement(By.id("result")).isDisplayed();
		System.out.println(b);
		driver.quit();
	}

}
