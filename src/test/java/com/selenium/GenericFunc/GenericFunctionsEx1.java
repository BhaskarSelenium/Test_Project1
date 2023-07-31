package com.selenium.GenericFunc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.exclwork.ExcelEx3;
import com.selenium.framework.Baseclass;

public class GenericFunctionsEx1 extends Baseclass{

	//public static WebDriver driver;
	//public static ExtentReports report;
	//public static ExtentTest test;

	public static void launchBrowser(String browsername) {
		switch (browsername.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("Launch chrome browser");
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("Launch edge browser");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			System.out.println("Launch firefox browser");
			break;
		default:
			System.out.println("please select correct browser");
			break;

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void launchApplication(String URL) {
		driver.get(URL);
		System.out.println("Entered the ur1: " + URL);
	}

	public static void inputUsername(String Xpath, String username) {
		WebElement ele1 = driver.findElement(By.xpath(Xpath));
		ele1.click();
		ele1.clear();
		ele1.sendKeys(username);
	}

	public static void usernameClick(String Xpath) throws Exception {
		WebElement next1 = driver.findElement(By.xpath(Xpath));
		Thread.sleep(5000);
		next1.click();
	}

	public static void rememberMe(String checkbox) throws Exception {
		WebElement check = driver.findElement(By.xpath(checkbox));
		Thread.sleep(5000);
		check.click();
	}

	public static void inputpassword(String Xpath, String password) {
		WebElement pw = driver.findElement(By.xpath(Xpath));
		pw.click();
		pw.clear();
		pw.sendKeys(password);
	}

	public static void PasswordClick(String Xpath) throws Exception {
		WebElement Login1 = driver.findElement(By.xpath(Xpath));
		Thread.sleep(5000);
		Login1.click();
	}

	public static void inputMFA(String Xpath, String mfa) {
		WebElement pw = driver.findElement(By.xpath(Xpath));
		pw.click();
		pw.clear();
		pw.sendKeys(mfa);
	}

	public static void mfaVerify(String Xpath) throws Exception {
		WebElement verify = driver.findElement(By.xpath(Xpath));
		Thread.sleep(5000);
		verify.click();
	}

	public static void exReport1(String name1) {
		ExtentReports report = new ExtentReports("Results\\SeleniumReport.html");
		ExtentTest test = report.startTest(null);
		test.log(LogStatus.PASS, "");
	}

	public static String getScreenshot(String filename) {
		TakesScreenshot takescreen = (TakesScreenshot) driver;
		File sourefile = takescreen.getScreenshotAs(OutputType.FILE);
		String path = "E:\\Selenium\\Selenium_Project\\Screenshots\\" + new Date().getTime() + ".png";
		File destfile = new File(path);
		try {
			FileUtils.copyFile(sourefile, destfile);
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		return path;
	}

	public static Map<String, String> readExdata(String testcasename) {
		Map<String, String> map1 = new HashMap<>();
		try {
			File file=new File("E:\\Selenium\\Selenium_Project\\Testdata\\Testdata3.xlsx");
			FileInputStream fis1 = new FileInputStream(file);
			XSSFWorkbook book = new XSSFWorkbook(fis1);
				XSSFSheet sheet = book.getSheetAt(0);
				int rCount = sheet.getLastRowNum();
				for (int i = 0; i <= rCount; i++) {
					String testcase = sheet.getRow(i).getCell(0).getStringCellValue();
					if (testcase.equals(testcasename)) {
						int cCount = sheet.getRow(i).getLastCellNum();
						for (int j = 1;j<cCount;j++) {
							String data = sheet.getRow(i).getCell(j).getStringCellValue();
							String[] values = data.split("=");
							map1.put(values[0], values[1]);

						}
					}
				}
			}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map1;
	}

	public static void logStatus(String message,boolean status) {
		if(status) {
             test.log(LogStatus.PASS, message);
             test.log(LogStatus.PASS, test.addScreenCapture(getScreenshot("1")));
		}
		else {
			test.log(LogStatus.FAIL, message);
            test.log(LogStatus.FAIL, test.addScreenCapture(getScreenshot("1")));
		}
	}

	public static void windowHandle1(String window) {
		WebElement w1 = driver.findElement(By.xpath(window));
		w1.click();
		String wd1 = driver.getWindowHandle();
		System.out.println("opened window is: " + wd1);
		Set<String> list1 = driver.getWindowHandles();
		System.out.println(list1.size());
		int num = 1;
		for (String wds : list1) {
			System.out.println("windows: " + wds);
			if (num == 2) {
				driver.switchTo().window(wds); // System.out.println();
				System.out.println(driver.getTitle());
			}
			num++;

		}
	}

	public static void closeBrowser() {
		driver.quit();
	}

}
