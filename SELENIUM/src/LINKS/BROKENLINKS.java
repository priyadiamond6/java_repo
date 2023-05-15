package LINKS;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BROKENLINKS {
public static void main(String[] args) throws IOException  {
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 System.out.println("Total:" + links.size());
	 
	 int brokenlinks = 0;
	 for(WebElement element : links) {
		 String url = element.getAttribute("href");
		 if (url==null || url.isEmpty()) { // use either null or isempty method
			 System.out.println("url is empty");
			 continue;
		 }
		 URL link = new URL(url);
		 // abstract class
		 HttpURLConnection httpcode = (HttpURLConnection) link.openConnection();
		 httpcode.connect();
		 
		 if (httpcode.getResponseCode()>=400) {
			 System.out.println(httpcode.getResponseCode()+url+"--"+"brokenlinks");
			 brokenlinks++;
			 }
		 else {System.out.println(httpcode.getResponseCode()+url+"--"+"validlinks");
	 }

	}
System.out.println("No of brokenlinks" +brokenlinks);
}
}
