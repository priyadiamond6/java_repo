package TESTNGASSERTION;

import org.testng.Assert;
import org.testng.annotations.Test;
public class HARDASSERTION {
	
	@Test
	public void Test1() {
		System.out.println("Execution started"); // Print

		Assert.assertTrue(true);

		System.out.println("Hello good morning"); // Print

		Assert.assertEquals("Seleniu", "Selenium"); // false //print

		System.out.println("Hard assetion"); // print

		Assert.assertEquals("Python", "Python"); // false

		System.out.println("Execution completed");

	}

	@Test
	public void Test2() {

		Assert.assertTrue(true);
		System.out.println("Hello");
		Assert.assertEquals("Automation", "Automation"); // True
		System.out.println("Execution completed");
	}
}
