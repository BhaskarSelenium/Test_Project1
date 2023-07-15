package com.selenium.TablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.GenericFunc.GenericFunctionsEx1;

public class TabEx1 extends GenericFunctionsEx1 {
	
	public WebDriver driver;
	@BeforeMethod
	public void browserlaunch()
	{
		launchBrowser("chrome");	
	}
	
	
	@Test
	public void readTable()
	{
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List <WebElement> headerlist=driver.findElements(By.xpath("//table[@id='VisitingTable']/thead/tr/th"));
		System.out.println("list of headers in the table is:" +headerlist.size());
		
		for(WebElement ele:headerlist) {
			
			System.out.println(ele.getText());
		}
	}
	

	@AfterMethod
	public void browserClose()
	{
		closeBrowser();
	}
	
}
