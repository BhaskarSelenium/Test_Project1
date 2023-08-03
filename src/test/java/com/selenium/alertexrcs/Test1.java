package com.selenium.alertexrcs;

import org.openqa.selenium.By;

import com.selenium.GenericFunc.GenericFunctionsEx1;

public class Test1  extends GenericFunctionsEx1  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Manasa();
	}
	
	
		
		public static void Manasa() throws InterruptedException {
			
			
			launchBrowser("chrome");
			launchApplication("https://demo.guru99.com/test/delete_customer.php");
			driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("39585");
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			driver.switchTo().alert().accept();
			
		}
		
		
		
		
	

}
