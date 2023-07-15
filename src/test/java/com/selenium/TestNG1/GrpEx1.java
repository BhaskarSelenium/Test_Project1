package com.selenium.TestNG1;

import org.testng.annotations.Test;

public class GrpEx1 {

	@Test(groups="smoketest")
	public void test100()
	{
		System.out.println("I am Test100");
	}
	
	@Test
	public void test200()
	{
		System.out.println("I am Test200");
	}
	
	@Test(groups="smoketest")
	public void test300()
	{
		System.out.println("I am Test300");
	}
	
	@Test
	public void test400()
	{
		System.out.println("I am Test400");
	}
	
	@Test(groups="smoketest")
	public void test500()
	{
		System.out.println("I am Test500");
	}
	
	@Test
	public void test600()
	{
		System.out.println("I am Test600");
	}
	
	@Test(groups="smoketest")
	public void test700()
	{
		System.out.println("I am Test700");
	}
	
	
}
