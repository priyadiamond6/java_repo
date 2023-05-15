package PAGE_OBJECT_MODEL_WITHOUT_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORANGEHRM_DASHBOARD {

@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
public WebElement Uname;

@FindBy(xpath="(//p[@class=\"oxd-text oxd-text--p\"])[4]")
public WebElement Act;

public ORANGEHRM_DASHBOARD(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void username() {
	String text = Uname.getText();
	System.out.println(Uname);
	if (text.equals("Soda GDK")) {
		System.out.println("correct text");
	}
	else {
		System.out.println("incorrect text");
	}
	
	
}
public void myaction() {
	String text1 = Act.getText();
	System.out.println(text1);
	boolean b = Act.isDisplayed();
	System.out.println(b);
}
}
