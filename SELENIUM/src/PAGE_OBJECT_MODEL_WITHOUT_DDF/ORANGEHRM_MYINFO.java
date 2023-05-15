package PAGE_OBJECT_MODEL_WITHOUT_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORANGEHRM_MYINFO {
	
	// global variable
	@FindBy(xpath="//a[@href=\"/web/index.php/pim/viewMyDetails\"]")
	private WebElement myinfo;
	
	@FindBy(xpath="//img[@class=\"employee-image\"]")
	public WebElement image;
	
	@FindBy(xpath="//a[contains(text(),\"Personal Details\")]")
	private WebElement PD;
	
	@FindBy(xpath="//a[contains(text(),\"Immigration\")]")
	public WebElement immigration;
	
	// constructor
	public ORANGEHRM_MYINFO(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	// method
	
	public void MYINFO () {
		myinfo.click();
	}
	public void IMAGE() {
		boolean b = image.isDisplayed();
		System.out.println(b);
	}
public void PERSONAL() {
	String text = PD.getText();
	System.out.println(text);
}
public void IMMIGRATION() {
	String text1 = immigration.getText();
	System.out.println(text1);
}

}
