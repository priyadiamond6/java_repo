package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ListBoxAutomationDemo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
	
    driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("firstpassword")).sendKeys("hdfhyfg");
	
	driver.findElement(By.id("firstpassword")).clear();
	
	WebElement Ski = driver.findElement(By.id("Skills"));
	
	Select s1 = new Select(Ski);
	
	List<WebElement> ListSki = s1.getOptions();
	
	System.out.println("Total Skills" +ListSki.size());
	
    for (int i=0; i<ListSki.size(); i++) {
    	//System.out.println(ListSki.get(i).getText());
    	
    	if (ListSki.get(i).getText().equals("APIs")) {
    		
    		ListSki.get(i).click();
    		break;	
    	}
    }
    Thread.sleep(3000);
    

    String DOB = "1923-June-8";
    
    String s[] = DOB.split("-");
    
    String Year = "//select[@id=\"yearbox\"]//option";
    
    String Month = "//select[@placeholder=\"Month\"]//option";
    
    //String Month = "(//select[@type=\"text\"])[4]//option";
    		
    String Day = "//select[@id=\"daybox\"]//option";
    		
    	m1 (Year, s[0]);
    	m1 (Month, s[1]);
    	m1 (Day, s[2]);
    	
    	driver.quit();
	}
	
	public static void m1 (String Element, String Value) {
		 
	List<WebElement> a = driver.findElements(By.xpath(Element));
	System.out.println(a.size());
	
	for (int i=0; i<a.size(); i++) {
	//System.out.println(a.get(i).getText());
    if (a.get(i).getText().equals(Value)) {
    	System.out.println(a.get(i).getText());
    	a.get(i).click();
    	//break;
    }
		

	}
	

	}
	

}