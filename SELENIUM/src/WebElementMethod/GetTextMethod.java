package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
		
String ExpectedResult = "Facebook helps you connect and share with the people in your life.";
	// 1st approach	
System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]")).getText());

// 2nd approach
String Text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]")).getText();

System.out.println(Text);

if (Text.equals(ExpectedResult)) {
	
	System.out.println("correcttext");
}

else {
	System.out.println("incorrecttext");
}

driver.quit();
}
}