package com.selenium.TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample3 {

	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("I am launching the browser");
		driver=new ChromeDriver();
	}
	
	@Test(priority=1)
	public void samsung()
	{
		driver.get("https://www.samsung.com/in/offer/online/samsung-fest/");
		System.out.println("Launched the samsung browser successfully");
	}
	
	@Test(priority=2)
	public void nopCommerce()
	{
		driver.get("https://www.nopcommerce.com/en");
		System.out.println("Launched the nop commerce application");
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Browser has been closed successfully");
	}
}
