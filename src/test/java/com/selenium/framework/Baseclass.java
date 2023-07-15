package com.selenium.framework;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.selenium.GenericFunc.GenericFunctionsEx1;

public class Baseclass {
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static Map<String, String> map1;

	@BeforeSuite

	public void beforeSuite() {
		report = new ExtentReports("E:\\Selenium\\Selenium_Project\\Results\\seleniumreport.html");

	}

	@BeforeMethod

	public void beforeMethod(ITestResult result) {
		// map1.clear();
		String testcasename = result.getMethod().getMethodName();
		map1 = GenericFunctionsEx1.readExdata(testcasename);
	}

	/*
	 * @Test public void TC_CWB_Login() {
	 * 
	 * GenericFunctionsEx1.launchBrowser(map1.get("browsername"));
	 * GenericFunctionsEx1.launchApplication(map1.get("url"));
	 * 
	 * 
	 * m System.out.println(map1.get("browsername"));
	 * System.out.println(map1.get("url")); }
	 */

	@AfterSuite
	public void afterSuite() {
		report.flush();
	}

}
