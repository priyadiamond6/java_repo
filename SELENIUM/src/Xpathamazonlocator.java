import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazonlocator {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href=\"/gp/new-releases/?ref_=nav_cs_newreleases\"]")).click();

	}

}
