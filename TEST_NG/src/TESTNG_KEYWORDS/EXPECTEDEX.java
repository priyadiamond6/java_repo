package TESTNG_KEYWORDS;


import org.testng.annotations.Test;

public class EXPECTEDEX{

	@Test(expectedExceptions=NumberFormatException.class)
	public void infiniteforloop() {
		System.out.println("Exception Handled");
		String s  = "abc";
		
		Integer.parseInt(s);
		
	}
@Test
	public void demo() {
		System.out.println("God");
	}
}