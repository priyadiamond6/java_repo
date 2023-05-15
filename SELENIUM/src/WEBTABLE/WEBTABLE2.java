package WEBTABLE;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBTABLE2 {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\INSTALLER\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/html/html_tables.asp");

JavascriptExecutor Js = (JavascriptExecutor) driver;
WebElement Example =driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
Js.executeScript("arguments[0].scrollIntoView();", Example);

// first way
// how many rows in table
int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
System.out.println("Total no of rows are :" +Row);

// second way 
List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
System.out.println("Total no of rows are :" +Row1.size());

//first way
// how many columns in table
int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
System.out.println("Total no of columns:" +col);

//second way 
List<WebElement> col1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
System.out.println("Total no of columns:" +col1.size());

// retrieve specific row or column data
String data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
System.out.println(data);

String data1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[2]")).getText();
System.out.println(data1);
    
// retrieve all data from table 
for (int i=2; i<=Row; i++) { // outer loop
    	
for (int j=1; j<=col; j++) {// inner loop
    String actualValue = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
if(actualValue.equals("Canada")) {
	  System.out.println(actualValue);
	  System.out.println("Row no :" +i+ ": col no:" +j);
}
}
System.out.println();
}
driver.quit();
}
}