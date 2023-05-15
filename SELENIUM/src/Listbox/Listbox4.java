package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox4 {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty ("webdriver.chrome.driver", "C:\\\\INSTALLER\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
						
driver.manage().window().maximize();
						
driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//a[@role=\"button\" and @class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Priyanka");

driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patil");

driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("123456789");

driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("@#$%");
//Step 1.

WebElement Day = driver.findElement(By.xpath("//select[@id=\"day\"]"));

WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));

WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));

// 1. select Day
// Q.1. how will u get total number of size

Select select1 = new Select(Day);
List<WebElement> Listday = select1.getOptions(); // return type of findelements = list of webelement
System.out.println("Total Day :"+Listday.size());
   
	
	// Q.2. how will you print all values
	
	for (int a=0; a<Listday.size(); a++) {
	 
		String DayValues = Listday.get(a).getText();
		
   System.out.println(DayValues);
		

	if(DayValues.equals("14")) {
			
		Listday.get(a).click();
		break;
	}
		

}
	

	
// 2. Select Month
// Q.3. how will you select specific values from drop down


Select select2 = new Select(Month);
List<WebElement> MonthValue = select2.getOptions();
System.out.println("Total Month :"+MonthValue.size());
	
	for (int b=0; b<MonthValue.size(); b++) {
	
	String Months = MonthValue.get(b).getText();
    System.out.println(Months);

if (Months.equals("May")) {
	
	MonthValue.get(b).click();
	break;
}

	}

// 3. Select Year

Select select3 = new Select(Year);
List<WebElement> ListYear = select3.getOptions();
System.out.println("Total Year :"+ListYear.size());
	
	for (int c=0; c<ListYear.size(); c++) {
		 
		String YearValue = ListYear.get(c).getText();
		
System.out.println(YearValue);
		
	if(YearValue.equals("2003")) {
			
		ListYear.get(c).click();
	
	break;
	}
	
		
}
	


for (int a=0; a<=Listday.size(); a++) {
	
	String Dayvalues = Listday.get(a).getText();
	
	System.out.println(Dayvalues);
	
	if (Dayvalues.equals("15")) {
		
		Listday.get(a).click();
		break;
	}
	
}

}

}
