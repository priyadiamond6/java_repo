package TESTNGASSERTION;

import org.testng.Assert;


public class ASSERTIONEXAMPLE3 {
	@org.testng.annotations.Test
public void Test() {
		
		Assert.assertNotEquals("Hello", "Hi");
		Assert.assertNotNull(10);
		Assert.assertNull(null);
//		SoftAssert soft = new SoftAssert();
//		soft.assertNotEquals("Hello","Hello");// True
//		soft.assertNull(null); // True
//		soft.assertNotNull(10); // True
	   
		System.out.println("Hello this is assertion topic");
		// soft.assertAll();
	}
}
