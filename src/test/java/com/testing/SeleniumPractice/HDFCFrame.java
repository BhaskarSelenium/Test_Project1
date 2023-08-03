package com.testing.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://484859958@netbanking.hdfcbank.com/netbanking/");
		WebElement frame_element = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame_element);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("293857694");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='keyboard']")).sendKeys("Selenium");
		WebElement log=driver.findElement(By.xpath("//a[@id='loginBtn']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", log);
		driver.findElement(By.xpath("//a[@id='forgotPassword']")).click();
		//driver.switchTo().alert().dismiss();
		/*
		 * WebElement cusid=driver.findElement(By.xpath("//input[@id='ipinCustId']"));
		 * cusid.sendKeys("selenium");
		 */
		
		/*
		 * driver.switchTo().frame(0); Thread.sleep(5000); Alert
		 * al1=driver.switchTo().alert(); Thread.sleep(5000); al1.sendKeys("Hello");
		 */ //AL1.dismiss();
		 
		
		/*
		 * Thread.sleep(10000); WebElement
		 * e1e1=driver.findElement(By.xpath("//div[@class='light-box-close ng-scope']"))
		 * ; JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", e1e1);
		 */
		//alert1.sendKeys("hello");
		//alert1.dismiss();
		//driver.findElement(By.xpath("//div[@class='light-box-close ng-scope']"));
		//alert.dismiss();
		//System.out.println(alert.getText());

	}

}
