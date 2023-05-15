package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisplayed {
// try & catch are exception handling keywords
	public static void main(String[] args) {
System.setProperty ("webdriver.chrome.driver", "E:\\INSTALLER\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		boolean b = driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed();
		
		System.out.println(b);

	}

}
