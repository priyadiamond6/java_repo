package PAGE_OBJECT_MODEL_WITHOUT_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ORANGEHRM_BASECLASS {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:/INSTALLER/chromedriver_win32/chromedriver.exe");
ChromeOptions options  = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(options);

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

// create object of ORANGEHRMLOGINPAGE
ORANGEHRMLOGINPAGE OL = new ORANGEHRMLOGINPAGE(driver);
OL.USERNAME();
OL.PASSWORD();
OL.LOGINBUTTON();

Thread.sleep(3000);

ORANGEHRM_DASHBOARD OD = new ORANGEHRM_DASHBOARD(driver);
OD.username();
OD.myaction();
Thread.sleep(3000);
//driver.quit();

ORANGEHRM_MYINFO OM = new ORANGEHRM_MYINFO(driver);
OM.MYINFO();
OM.PERSONAL();
OM.IMMIGRATION();
OM.IMAGE();

	}

}
