package Com.Ecommerce.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.Ecommerce.Configuration.Readconfiguration;
import Com.Ecommerce.Utilities.TestUtils;
import net.bytebuddy.utility.RandomString;
public class Ecommerce_Baseclass{
	
Readconfiguration readconfig= new Readconfiguration();
	
	public String BaseURL=readconfig.getApplicationURL();
	public String email=readconfig.getEmail();
	public String password=readconfig.getPassword();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("Browser")
	@BeforeMethod
	public void Initialization (String Browsername) {
		
		logger=logger.getLogger("Ecommerce_Baseclass");
		PropertyConfigurator.configure("log4j.properties");
		
		if (Browsername.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			driver = new ChromeDriver();
		}
		
//		else if (Browsername.equals("Firefox")) {
//			System.setProperty("webdriver.gecko.driver", readconfig.getChromepath())
//			driver = new FirefoxDriver();
//		}
//		
//		else if (Browsername.equals("IE")) {
//			System.setProperty("webdriver.Ie.driver", readconfig.getChromepath());
//			driver = new InternetExplorerDriver();
//		}
		
		else if (Browsername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getEdgedriver());
			driver = new EdgeDriver();
		}
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(TestUtils.Implicit_Wait,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_Load_TimeOut,TimeUnit.SECONDS);
		
	    driver.get(BaseURL);
}
	
	public String getScreenshotAs (String Testcasename) throws IOException {
		
		TakesScreenshot Ts = (TakesScreenshot) driver;
		
		File source = Ts.getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(9);
		String dest = System.getProperty("user.dir") + "/Screenshots/" + Testcasename + "" + Random + ".png";
		FileUtils.copyFile(source, new File (dest));
		return dest;
	}
	@AfterMethod
	 public void Teardown() {
	    	driver.quit();
	    }
}

