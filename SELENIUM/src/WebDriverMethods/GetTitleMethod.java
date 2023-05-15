package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// step 1 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
		// step 2 
		
		WebDriver driver = new ChromeDriver();
		
		// step 3
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		String Title = driver.getTitle(); 
		
		System.out.println(Title); // get title method 
		
String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
;	

if (Title.equals(ExpectedTitle)) {
	System.out.println("Correcttitle");
}

else {System.out.println("Incorrecttitle");
}

driver.close();


	
	}

}
