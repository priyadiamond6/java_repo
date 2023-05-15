package Listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LISTBOX_ALPHABETICAL {


	//Print All options of listbox in alphabetical order
	public static void main(String[] args) throws InterruptedException { 
	System.setProperty("webdriver.chrome.driver","C:\\\\INSTALLER\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//To wait after opening chrome browser for 2sec Thread.sleep(2000);
	//To open facebook driver.get("https://www.facebook.com/");
	//To wait after opening facebook page for 2sec Thread.sleep(2000);
	//To click on create new account 
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	//To wait after click on create new account for 2sec Thread.sleep(6000);
	//Step I
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(6000);
	
	//Step II
	
	Select s = new Select(month); Thread.sleep(6000);
	
	//Step III
	//1.To get size of the month listbox on facebook page in create new account //1stApproach
	
	List<WebElement> AllOptions = s.getOptions(); Thread.sleep(6000);
	
	//int text = AllOptions.size(); //System.out.println(text);
	//2nd Approach
	//List<WebElement> AllOptions = s.getOptions();
	//System.out.println(AllOptions.size());
	//3rd approach //System.out.println(s.getOptions().size());
	
	TreeSet tr = new TreeSet();
	
	//use for each loop for print to get options
	 
	for(WebElement str:AllOptions) {
	String Text = str.getText();
	tr.add(Text); }
	for(Object s1:tr) {
	System.out.println(s1); }


	}

}

