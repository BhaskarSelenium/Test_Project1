package com.testing.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		driver.manage().window().maximize();
		//driver.manage().timeouts().
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("User1");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("User1Test@gmail.com");
		        
				
				
			
				
				
				
				
				
				
				
				
				

	}

}
