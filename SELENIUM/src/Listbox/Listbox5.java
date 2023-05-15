package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox5 {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty ("webdriver.chrome.driver", "C:\\\\INSTALLER\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
						
		driver.manage().window().maximize();
						
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		
		Thread.sleep(3000);
		
		List<WebElement> City =driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		System.out.println("TotalCount :"+ City.size());
		
		for (int i=0; i<City.size(); i++) {
			
		    City.get(i).getText();
		    
		    if(City.get(i).getText().equals("Wakad, Pune")); {
			System.out.println(City.get(i).getText());
			City.get(i).click();
			break;
		}
		
		}
		
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		Thread.sleep(3000);

        List<WebElement> DestCity= driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));		
	
        System.out.println("Total city count :"+DestCity.size());
		Thread.sleep(2000);

        for(int i=0 ;i<DestCity.size();i++) {
           System.out.println(DestCity.get(i).getText());  
           if(DestCity.get(i).getText().equals("Borivali West, Mumbai")) {
               System.out.println("Selected Dest city :"+DestCity.get(i).getText());  

        	   DestCity.get(i).click();
        	   break;
           }
        }
driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
Thread.sleep(2000);
//
 driver.findElement(By.xpath("//td[@class=\"wd day\"]")).click();
Thread.sleep(3000);
driver.findElement(By.id("search_btn")).click();

	}

}
