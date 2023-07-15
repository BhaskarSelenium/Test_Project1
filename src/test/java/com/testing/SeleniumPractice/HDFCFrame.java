package com.testing.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement frame_element = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame_element);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("293857694");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//input[@id='keyboard']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//a[@id='forgotPassword']")).click();
		//Alert alert=driver.switchTo().alert();
		//driver.findElement(By.xpath("//div[@class='light-box-close ng-scope']"));
		//alert.dismiss();
		//System.out.println(alert.getText());

	}

}
