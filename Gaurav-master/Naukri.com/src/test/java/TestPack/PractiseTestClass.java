package TestPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class PractiseTestClass {
	
	@BeforeTest
	@Parameters("testData")
	public void beforeTest(String data) {
		System.out.println(data);
		System.out.println("Before Test - Class1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - Class1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - Class1");
	}
	@Test
	public void testA () {
		System.out.println("Test A - Class1");
	}
	
	@Test
	public void testB () {
		System.out.println("Test B - Class1");
	}
	
	@Test
	public void testC () {
		System.out.println("Test C - Class1");
	}
	
	@Test
	public void testD () {
		System.out.println("Test D - Class1");
	}
	
	@AfterMethod
	public void afterMethod () {
		System.out.println("After Method - Class1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class - Class1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test - Class1");
	}

}
