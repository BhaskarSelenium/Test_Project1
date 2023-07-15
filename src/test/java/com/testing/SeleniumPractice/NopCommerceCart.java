package com.testing.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceCart {

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
		ac1.moveToElement(desktops1).click().build().perform();
		driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		Thread.sleep(5000);
		WebElement ram=driver.findElement(By.xpath("//select[@id='product_attribute_2']"));
		Select sc1=new Select(ram);
		sc1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='product_attribute_3_6']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-button-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		WebElement text1=driver.findElement(By.xpath("//span[@class='sku-number']"));
		System.out.println(text1.getText());

		WebElement text2=driver.findElement(By.xpath("(//div[@class='attributes'])[2]"));
		System.out.println(text2.getText());
		
		driver.findElement(By.xpath("//td[@class='remove-from-cart']")).click();
		
		WebElement cartempty=driver.findElement(By.xpath("//div[@class='no-data']"));
		System.out.println(cartempty.getText());
		
		
		
		
		
	}

}
