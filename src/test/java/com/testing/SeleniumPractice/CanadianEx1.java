package com.testing.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CanadianEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cwb-qa.temenoscloudna.com/apps/KonyOLB/#_frmLogin");
		Thread.sleep(10000);
		driver.findElement(By.id("idp-discovery-username")).sendKeys("01227431");
		driver.findElement(By.id("idp-discovery-submit")).click();
		/*Actions action1=new Actions(driver);
		Thread.sleep(10000);
		action1.moveToElement(next).click().build().perform();*/
		
	}

}
