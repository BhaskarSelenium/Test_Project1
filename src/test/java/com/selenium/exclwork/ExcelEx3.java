package com.selenium.exclwork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.GenericFunc.GenericFunctionsEx1;
import com.selenium.framework.Baseclass;

public class ExcelEx3 extends GenericFunctionsEx1 {

	// static ExtentReports report;

	/*
	 * static ExtentReports report; static ExtentTest test;
	 */

	/*
	 * @Test public void TC_CWB_LoginTest() {
	 *  //report=new
	 * ExtentReports("Results\\seleniumreport.html");
	 * //test=report.startTest("TC_01");
	 * 
	 * 
	 * File f = new File("Testdata\\Testdata3.xlsx"); FileInputStream fis = new
	 * FileInputStream(f); XSSFWorkbook book = new XSSFWorkbook(fis); XSSFSheet
	 * sheet = book.getSheetAt(0); String browservalue =
	 * sheet.getRow(1).getCell(0).getStringCellValue(); String urlvalue =
	 * sheet.getRow(1).getCell(1).getStringCellValue(); String usernamevalue =
	 * sheet.getRow(1).getCell(2).getStringCellValue(); String
	 * passwordvalue=sheet.getRow(1).getCell(3).getStringCellValue(); String
	 * mfavalue=sheet.getRow(1).getCell(4).getStringCellValue();
	 * 
	 * 
	 * launchBrowser(map1.get("browsername")); 
	 * launchApplication(map1.get("url"));
	 * 
	 * test.log(LogStatus.PASS, "URL launch is pass");
	 * inputUsername("//input[@id='idp-discovery-username']", usernamevalue);
	 * usernameClick("//input[@id='idp-discovery-submit']");
	 * test.log(LogStatus.PASS,
	 * test.addScreenCapture(getScreenshot("username login click")));
	 * //rememberMe("//input[@id='Remember me']");
	 * inputpassword("//input[@id='okta-signin-password']",passwordvalue);
	 * PasswordClick("//input[@id='okta-signin-submit']");
	 * inputMFA("//input[@id='input101']",mfavalue);
	 * mfaVerify("//input[@class='button button-primary']");
	 * test.log(LogStatus.PASS,
	 * test.addScreenCapture(getScreenshot("Logged in successfully")));
	 * //screenshot("successfully logged in"); report.flush();
	 * 
	 * 
	 * }
	 */
	@Test
	public void TC_CWB_Login() {
		test=report.startTest("TC_CWB_Login");
		launchBrowser(map1.get("browsername"));
		logStatus("Launch Browser", true);
		launchApplication(map1.get("url"));
	}

}
