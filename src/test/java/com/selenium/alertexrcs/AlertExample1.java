package com.selenium.alertexrcs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.GenericFunc.GenericFunctionsEx1;

public class AlertExample1 extends GenericFunctionsEx1 {

	public static WebDriver driver;

	@Test
	public void test48() throws InterruptedException {
		launchBrowser("chrome");
		launchApplication("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("39585");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.switchTo().alert().accept();
	}
}
