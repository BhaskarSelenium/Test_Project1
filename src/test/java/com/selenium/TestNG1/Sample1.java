package com.selenium.TestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am Before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am Before Method");
	}

	@Test
	public void test() {
		System.out.println("I am Test Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am After class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am After Suite");
	}

}
