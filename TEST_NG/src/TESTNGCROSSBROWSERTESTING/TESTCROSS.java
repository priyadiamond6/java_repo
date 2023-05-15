package TESTNGCROSSBROWSERTESTING;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TESTCROSS {
	

		WebDriver driver;
	@Parameters("Browsername")
		@Test
		public void facebook(String Browsername) {

			if (Browsername.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\INSTALLER\\chromedriver.exe");
				driver = new ChromeDriver();
			}
//			} else if (Browsername.equals("Firefox")) {
//				System.setProperty("webdriver.gecko.driver", "E:\\INSTALLER\\geckodriver.exe");
//				driver = new FirefoxDriver();
//			
//			} 
			else if (Browsername.equals("Edge")) {
				System.setProperty("webdriver.edge.driver", "E:\\INSTALLER\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
//			}else if (Br.equals("Edge")) {
//				System.setProperty("webdriver.IE.driver", "/Users/ranjeetkendre/Downloads/IEdriverserver");
//				driver = new InternetExplorerDriver();
//			}
			
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get("https://www.facebook.com/");

			driver.findElement(By.id("email")).sendKeys("Abc");
			driver.findElement(By.id("pass")).sendKeys("SDFGH");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

			boolean Account = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).isDisplayed();
			Assert.assertTrue(true);
			driver.quit();
		}
	}


