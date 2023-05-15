package ecommercepageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommercebaseclass.baseclass;

public class tcloginpage extends baseclass { // extended baseclass to access public static webdriver
	                                       //

	public tcloginpage() {
		PageFactory.initElements(driver,this);
	}	
	//2.
	@FindBy(id = "Email")
	public WebElement username;
		
	@FindBy(id = "Password")
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement login;	
	
	
	//3	
	public void SetUsername(String Uname) {		
		username.sendKeys(Uname);		
	}
	public void SetPassword(String Pass) {
		password.sendKeys(Pass);
	}	
	public void ClickButton() {
		login.click();
	}
	
	public void Logout() {
		Logout.click();
	}

}
