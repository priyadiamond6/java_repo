package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox8_Assignment {

	//static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    WebDriver  driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("UTDT");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();
		
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
				
		WebElement Month = driver.findElement(By.xpath("//select[@class=\"form-control ng-pristine ng-invalid ng-invalid-required ng-touched\"]"));
		
	    WebElement Day = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		
//		//1. Select element using selectbyvisibletext
//		
//          Select select1 = new Select(Day);
//		  select1.selectByVisibleText("8");
//		
//	
//		 Select select2 = new Select(Month);
//		 select2.selectByVisibleText("June");
//		
//	    Select select3 =new Select(Year);
//        select3.selectByVisibleText("1923");
		
	String DOB = "1923/June/8";
		
		String Date[] = DOB.split("/");
//		
		 Listbox(Year, Date[0]);
		 Listbox(Month, Date[1]);
         Listbox(Day, Date[2]);
         
//		Selectdropdown(Year, date[0]);
//		Selectdropdown(Month, date[1]);
//		Selectdropdown(Day, date[2]);

	}
	
	public static void Listbox(WebElement element, String value) {
		Select select1 = new Select(element);
		select1.selectByValue(value);
	}
//	
//	public static void Selectdropdown(String element, String value) {
//		
//		List<WebElement> AT = driver.findElements(By.xpath(element));
//		System.out.println(AT.size());
//		
//		for(int i=0;i<AT.size();i++) {
//			
//			if(AT.get(i).getText().equals(value)) {
//				AT.get(i).click();
//				break;
//			}
//		}
//	
	

}

	


