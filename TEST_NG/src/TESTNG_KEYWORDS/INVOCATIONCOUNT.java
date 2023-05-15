package TESTNG_KEYWORDS;

import org.testng.annotations.Test;

public class INVOCATIONCOUNT {

	@Test
	public void syso1() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

	}
//	@Test
//	public void ForLopp() {
//		for(int i=1;i<=5;i++) {
//			System.out.println("Hello");
//		}
//	}
//	@Test(invocationCount = 5)
//	public void TestNgCount() {
//		System.out.println("Hello");
//	}
	
	@Test(invocationCount = 10)
	public void Demo() {
		
		int x =20;
		int y =30;
		int z =x+y;
		System.out.println("Sum is ---->"+z);
	}
	
}
