package DATADRIVENFRAMEWORK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DDF_WITH_FRAMEWORK {

public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	System.setProperty("webdriver.chrome.driver", "E:/INSTALLER/chromedriver_win32/chromedriver.exe");
	ChromeOptions options  = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	FileInputStream File = new FileInputStream("C:\\Users\\dell\\Desktop\\Excel for eclipse\\DDF.xlsx");
	
	Sheet Sh = WorkbookFactory.create(File).getSheet("Sheet1");
	
	// enter username
	String Username = Sh.getRow(1).getCell(0).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
	
	// enter password
	String Password = Sh.getRow(1).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	// name
	
    String Name1 = Sh.getRow(1).getCell(2).getStringCellValue();
    
    String Username1 =driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
    
    System.out.println(Username1);

if(Name1.equals(Username1)) {
	System.out.println("correct username");
}
else {
	System.out.println("incorrect username");
}

driver.quit();

	}

}
