package FindelementandFindelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FINDELEMENTS_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALLER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	
//		List<WebElement> searchbox = driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
//		searchbox.s // searchbox.sendkeys not used
		List<WebElement> Text = driver.findElements(By.xpath("//a[@href=\"/deals?ref_=nav_cs_gb\"]"));
		System.out.println(Text);
//	for( WebElement Ele : Text) {
//		System.out.println(Ele.getText());
//	}
//	
	Iterator<WebElement> itr = Text.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	// if path of findelements goes wrong then it shows 0 value in console as below
//	List<WebElement> Link = driver.findElements(By.xpath("//a[@class=\"nav-ass  \"]")); // wrong path so 0 value
//    System.out.println(Link.size());
	//driver.quit();
	}

}
