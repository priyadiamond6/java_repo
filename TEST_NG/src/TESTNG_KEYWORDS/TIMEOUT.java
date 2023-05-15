package TESTNG_KEYWORDS;

import org.testng.annotations.Test;

public class TIMEOUT {
	@Test(timeOut=1000, priority=2)
	public void infiniteforloop() {		
		for(int i=0; i<=10; i--) {
			System.out.println("Good morning");
		}
	}
	
	@Test(priority=1)
	public void loop() {	
		
			System.out.println("Hi");
		}
}
