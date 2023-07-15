package com.testing.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NopCom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("FirstName")).sendKeys("TestFirst123");
		driver.findElement(By.name("LastName")).sendKeys("TestLast123");
		driver.findElement(By.id("Email")).sendKeys("Testfirstlast@gmail.com");
		driver.findElement(By.id("ConfirmEmail")).sendKeys("Testfirstlast@gmail.com");
		driver.findElement(By.id("Username")).sendKeys("Test100101");
		driver.findElement(By.id("check-availability-button")).click();
		driver.findElement(By.id("Password")).sendKeys("test@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("test@1234");
		Select dropdown=new Select(driver.findElement(By.id("Details_CompanyIndustryId")));
		dropdown.selectByIndex(2);
		//driver.findElement(By.te("Develops nopCommerce extensions")).click();
		Select dropdown1=new Select(driver.findElement(By.id("Details_CompanyRoleId")));
		dropdown1.selectByVisibleText("Technical developer");
		Select dropdown2=new Select(driver.findElement(By.name("Details.ExtensionsDevelopmentPeriodId")));
		dropdown2.deselectByIndex(1);
		
		Select dropdown3=new Select(driver.findElement(By.name("Details.CompanySizeId")));
		dropdown3.deselectByIndex(1);
		
		//driver.findElement(By.id("register-button")).click();

	}

}
