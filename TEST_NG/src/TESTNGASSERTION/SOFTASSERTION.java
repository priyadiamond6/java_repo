package TESTNGASSERTION;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SOFTASSERTION {
	@Test
	public void Test1() {

		SoftAssert soft = new SoftAssert();

		System.out.println("Execution started");// print

		soft.assertEquals("Automation", "Automation");// marks

		soft.assertEquals(true, true); // Fail

		soft.assertTrue(true);

		System.out.println("Execution Completed");

		//soft.assertAll(); // it will collect the result of all the assertion and in case any failure as marks
		                 // the test cases as failed

		
	}

	@Test
	public void Test2() {

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(true, false); // Fail

		System.out.println("Welcome");
		soft.assertAll();
	}
}

