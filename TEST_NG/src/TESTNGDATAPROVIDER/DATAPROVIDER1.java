package TESTNGDATAPROVIDER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATAPROVIDER1 {
	@Test(dataProvider = "Logindata")
	public void LoginTest(String username, String Password) {
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement User = driver.findElement(By.name("username"));
		User.sendKeys(username);

		WebElement Pass = driver.findElement(By.name("password"));

		Pass.sendKeys(Password);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		boolean Text=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).isDisplayed();
		
		Assert.assertTrue(Text);
		
		driver.quit();
	}

	@DataProvider(name="Logindata")
	public Object[][] LoginData() {

		Object[][] data = new Object[4][2];

		// Correct username & password
		data[0][0] = "Admin";
		data[0][1] = "admin123";

		// Correct username and incorrect pass

		data[1][0] = "Admin";
		data[1][1] = "admin1234";

		// incorrectusername correct pass

		data[2][0] = "admin12";
		data[2][1] = "admin123";

		// Incorrect username and pass

		data[3][0] = "admin121";
		data[3][1] = "admin1231";

		return data;
	}


}
