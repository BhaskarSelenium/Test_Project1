package com.selenium.exclwork;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.GenericFunc.GenericFunctionsEx1;
import com.selenium.GenericFunc.ScreenFunctions;
import com.selenium.framework.Baseclass;

public class ExcelEx3 extends GenericFunctionsEx1 {

	// static ExtentReports report;

	/*
	 * static ExtentReports report; static ExtentTest test;
	 */

	/*
	 * @Test public void TC_CWB_LoginTest() { //report=new
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
	 * launchBrowser(map1.get("browsername")); launchApplication(map1.get("url"));
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
	@Test(priority = 0)
	public void TC_CWB_Login() {
		try {
			test = report.startTest("TC_CWB_Login");
			launchBrowser(map1.get("browsername"));
			logStatus("Launch Browser", true);
			launchApplication(map1.get("url"));
			inputText("//input[@id='idp-discovery-username']", map1.get("username"));
			logStatus("Input username", true);
			clickFunc("//input[@id='idp-discovery-submit']");
			inputText("//input[@id='okta-signin-password']", map1.get("password"));
			logStatus("Input password", true);
			clickFunc("//input[@id='okta-signin-submit']");
			inputText("//input[@name='answer']", map1.get("mfa"));
			logStatus("Input MFA", true);
			clickFunc("//input[@type='submit']");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			logStatus(e.toString(), false);
		}

	}

	@Test(priority = 1)
	public void TC_CWB_Payee() {
		try {
			clickFunc("//div[@id='frmCombinedAccountsLanding_customheader_topmenu_flxMyBills']");
			WebElement managepaye = driver.findElement(By.xpath("//div[@id='frmCombinedAccountsLanding_customheader_topmenu_lblManagepayee']"));
			// clickFunc("//div[@id='frmCombinedAccountsLanding_customheader_topmenu_lblManagepayee");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", managepaye);
			logStatus("Navigate to add payee screen", true);
			clickFunc("//div[@id='frmManagePayees_lblAddPayee']");
			Thread.sleep(15000);
			driver.findElement(By.xpath("//input[@id='frmAddPayee1_tbxCustomerName']")).sendKeys("ABC");
			//inputText("//input[@id='frmAddPayee1_tbxCustomerName']", map1.get("payeename"));
			clickFunc("//div[@id='flxNewPayees_lblNewPayees']");
			inputText("//input[@id='frmAddPayee1_tbxAccountNumber']", map1.get("acnumber"));
			inputText("//input[@id='frmAddPayee1_tbxConfirmAccountNumber']", map1.get("confirmacnumber"));
			clickFunc("//input[@id='frmAddPayee1_btnNext']");
			logStatus("personal or business selection", true);
			clickFunc("//input[@id='frmPayeeDetails_btnAddRecepientContinue']");
			logStatus("Add Payee Confirmation", true);
			clickFunc("//input[@id='frmVerifyPayee_btnConfirm']");
			logStatus("Add Payee acknowledgement", true);
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			logStatus(e.toString(), false);
		}

	}

}
