package com.selenium.TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.selenium.GenericFunc.GenericFunctionsEx1;
//import com.beust.jcommander.Parameters;

public class ParamGroupEx1 extends GenericFunctionsEx1 {

	/*
	 * @Test
	 * 
	 * @Parameters({"browser", "url" })
	 * 
	 * public void test001(String browser, String url) {
	 * System.out.println("I am Test001 Method"); System.out.println(browser);
	 * System.out.println(url); }
	 */
	@Test
	@Parameters({ "browser", "url" })

	public void test001(String browser, String url) {
		launchBrowser(browser);
		launchApplication(url);
	}

	@Test
	public void test002() {
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.guru99.com/all-about-testng-and-selenium.html");
	}
	
	@Test
	public void sample29() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
