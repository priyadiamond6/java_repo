package PAGE_OBJECT_MODEL_WITH_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORANGELOGINPAGE {
	// 1.Data member should be declared globally with access level private/public
	
			@FindBy(xpath="//input[@name=\"username\"]")
			public WebElement UN;
			
			@FindBy(xpath="//input[@name=\"password\"]")
			private WebElement PW;
			
			@FindBy(xpath="//button[@type=\"submit\"]")
			public WebElement LOGIN;
			
			
// 2.Initialize within a constructor with access level public using pagefactory
	
	public ORANGELOGINPAGE (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
// 3. Method
				
	public void USERNAME(String username1) {
		UN.sendKeys(username1);
	}
	
	public void PASSWORD(String password1) {
		PW.sendKeys(password1);
	}
	
	public void LOGINBUTTON() {
	LOGIN.click();
	}

}
