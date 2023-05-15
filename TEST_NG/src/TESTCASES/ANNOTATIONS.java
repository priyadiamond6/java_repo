package TESTCASES;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ANNOTATIONS {

		/*@BeforeSuite --- >SetUp Method
		@BeforeTest -- > Launchbrowser
		@BeforeClass -- > ENTERURL Application URL
		@BeforeMethod -- >Application login
		@Test 3 -- >Facebook title
		@AfterMethod -- >Application Logout
		@BeforeMethod -- >Application login
		@Test 2-- > Google title
		@AfterMethod -- >Application Logout
		@BeforeMethod -- >Application login
		@Test 1 -- > OrangeHRMTitle
		@AfterMethod -- >Application Logout
		@AfterClass -- > Close browser
		@AfterTest --> Deletecookies
		@AfterSuite -->Tear down
		
		
		@Test BeforeMethod @Aftermethod @Beforeclass and @Afterclass
		*/
		// Precondition Annotations
		@BeforeSuite
		public void Setup() {
			System.out.println("@BeforeSuite --- >SetUp Method");
		}

		@BeforeTest
		public void Launchbrowser() {
			System.out.println("@BeforeTest -- > Launchbrowser");
		}

		@BeforeClass
		public void ENTERURL() {
			System.out.println("@BeforeClass -- > ENTERURL Application URL");
		}

		@BeforeMethod
		public void ApplicationLogin() {
			System.out.println("@BeforeMethod -- >Application login");
		}

		// Testclass Annotations
		@Test
		public void A() {
			System.out.println("@Test 1 -- > OrangeHRMTitle");
		}
		@Test
		public void B() {
			System.out.println("@Test 2-- > Google title");
		}
		
		@Test
		public void C() {
			System.out.println("@Test 3 -- >Facebook title");
		}
		//Postcondition annotations
		@AfterMethod
		public void ApplicationLogout() {
			System.out.println("@AfterMethod -- >Application Logout");
		}
		
		
		
		@AfterClass
		public void CloseBrowser() {
			System.out.println("@AfterClass -- > Close browser");
		}
		
		@AfterTest
		public void Deletecookies() {
			System.out.println("@AfterTest --> Deletecookies");
		}
		@AfterSuite
		public void Teardown() {
			System.out.println("@AfterSuite -->Tear down");
        }
		
}