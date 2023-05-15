package POPUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FILE_UPLOAD_POPUP {
	
// can upload file if type=file present in dom structure & 
//if type=file not present then we have to use sikuli or AutoIt tool

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/upload");
Thread.sleep(3000);

// if type = file then only we can access the window based application
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\dell\\Desktop\\STUDENTS.xlsx");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
Thread.sleep(3000);

boolean b = driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]")).isDisplayed();
System.out.println(b);

//driver.quit();
	
}

}
