package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
			
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://youtu.be/SqnnOG4HwOk");
				
				Thread.sleep(3000);
				
				Dimension Size =new Dimension(300,500);
				Point Po = new Point(500,200);
				
				Thread.sleep(4000);
				
				driver.manage().window().setPosition(Po);
				
				Thread.sleep(4000);
				
				System.out.println(driver.manage().window().getPosition());
				
				Thread.sleep(4000);

				driver.quit();

	}

}
