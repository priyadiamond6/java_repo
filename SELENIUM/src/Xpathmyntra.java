import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathmyntra {

	public static void main(String[] args) throws InterruptedException {
		
		
			
			System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.meesho.com/");
			
			Thread.sleep(3000);
			
			driver.get("//div[@class=\"NavBarDesktop__Subtitle-xsryom-0 kPKaWB\"]");

	}

}
