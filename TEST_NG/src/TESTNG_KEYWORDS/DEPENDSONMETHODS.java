package TESTNG_KEYWORDS; 
	import org.testng.annotations.Test;

	public class DEPENDSONMETHODS {

		@Test
		public void LoginTest() {		
			int No=20/0;  //---> ArithmeticException
		}	
		@Test
		public void Searchpage() {
			System.out.println("Searchpage");
		}
		@Test
		public void Refreshpage() {
			System.out.println("Refreshpage");
		}
		@Test(dependsOnMethods = "LoginTest")
		public void Users() {
			System.out.println("Users");
		}
		
		
}
