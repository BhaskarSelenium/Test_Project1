package com.testing.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NopCommmerceActioMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		WebElement computers=driver.findElement(By.xpath("(//a[text()='Computers '])[1]"));
		Actions ac1=new Actions(driver);
		ac1.moveToElement(computers).build().perform();
		WebElement desktops1=driver.findElement(By.xpath("//ul[@class='sublist first-level']/li/a[1]"));
		Thread.sleep(5000);
		ac1.moveToElement(desktops1).contextClick().build().perform();
		Thread.sleep(5000);
		ac1.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).doubleClick().build().perform();
	}

}
