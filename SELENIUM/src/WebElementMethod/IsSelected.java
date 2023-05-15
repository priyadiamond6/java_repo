package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

public static void main(String[] args) throws InterruptedException {
System.setProperty ("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\INSTALLER\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
driver.manage().window().maximize();

driver.get("https://demo.automationtesting.in/Register.html");

Thread.sleep(3000);

boolean b = driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).isSelected();
System.out.println(b);

driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
boolean b1=	driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).isSelected();
System.out.println(b1);

		

	}

}
