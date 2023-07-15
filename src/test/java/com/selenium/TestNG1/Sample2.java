package com.selenium.TestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample2 {

	@BeforeMethod
	public void mobile()
	{
		System.out.println("I am parent of mobile company");
	}
	
	@Test
	public void samsung()
	{
		System.out.println("I am samsung mobile");
	}
	
	@Test
	public void nokia()
	{
		System.out.println("I am Nokia mobile");
	}
	
	
	@AfterMethod
	public void MobileFinal()
	{
		System.out.println("I am MobileFinal mobile");
	}
}
