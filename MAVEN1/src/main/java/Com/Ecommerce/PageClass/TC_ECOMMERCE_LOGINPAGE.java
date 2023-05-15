package Com.Ecommerce.PageClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com.Ecommerce.BaseClass.Ecommerce_Baseclass;

public class TC_ECOMMERCE_LOGINPAGE extends Ecommerce_Baseclass {
	
public TC_ECOMMERCE_LOGINPAGE(){

PageFactory.initElements(driver, this);
}
	
@FindBy(id="email")
public WebElement Email;

@FindBy(id="pass")
public WebElement Password;

@FindBy(xpath="//button[@value=\"1\"]")
public WebElement Loginbtn;

public void Setemail (String email) {
Email.sendKeys(email);
}

public void Setpassword (String password) {
Password.sendKeys(password);
}

public void Click() {
Loginbtn.click();
}

}


