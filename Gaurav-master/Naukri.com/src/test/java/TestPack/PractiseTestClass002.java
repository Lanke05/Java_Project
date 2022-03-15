package TestPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PractiseTestClass002 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - Class2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - Class2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - Class2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - Class2");
	}
	@Test
	public void test1 () {
		System.out.println("Test 1 - Class2");
	}
	
	@Test
	public void test2 () {
		System.out.println("Test 2 - Class2");
	}
	
	@Test
	public void test3 () {
		System.out.println("Test 3 - Class2");
	}
	
	@Test
	public void test4 () {
		System.out.println("Test 4 - Class2");
	}
	
	@AfterMethod
	public void afterMethod () {
		System.out.println("After Method - Class2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class - Class2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test - Class2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - Class2");
	}

}
