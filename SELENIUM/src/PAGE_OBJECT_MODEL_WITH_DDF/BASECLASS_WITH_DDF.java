package PAGE_OBJECT_MODEL_WITH_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BASECLASS_WITH_DDF {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
System.setProperty("webdriver.chrome.driver", "E:/INSTALLER/chromedriver_win32/chromedriver.exe");
ChromeOptions options  = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(options);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

// to fetch data from excel sheet
String path = "C:\\Main\\Manual\\DDF.xlsx";
FileInputStream File = new FileInputStream(path);
Sheet data = WorkbookFactory.create(File).getSheet("Sheet1");

ORANGELOGINPAGE OL = new ORANGELOGINPAGE(driver);

String un = data.getRow(1).getCell(0).getStringCellValue();
OL.USERNAME(un);

String ps = data.getRow(1).getCell(1).getStringCellValue();
OL.PASSWORD(ps);

OL.LOGINBUTTON();






	}

}
