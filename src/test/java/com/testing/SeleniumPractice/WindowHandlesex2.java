package com.testing.SeleniumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement frame_element = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame_element);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("293857694");
		driver.findElement(By.xpath("(//span[@class='lightbluecolor'])[5]/a")).click();
		driver.findElement(By.xpath("(//span[@class='lightbluecolor'])[6]/a")).click();
		driver.findElement(By.xpath("(//span[@class='lightbluecolor'])[1]/a")).click();
		driver.findElement(By.xpath("(//span[@class='lightbluecolor'])[2]/a")).click();
		driver.findElement(By.xpath("(//span[@class='lightbluecolor'])[3]/a")).click();
		Set<String> hands = driver.getWindowHandles();
		System.out.println(hands.size());
		int i=0;
		for (String winds1 : hands) {
			System.out.println("Windows: " + winds1);
			if(i==2)
			{
				driver.switchTo().window(winds1);
			}
			i++;
		}
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		WebElement text10=driver.findElement(By.xpath("//div[@class='pdtb25 text-center']/a"));
		System.out.println(text10.getText());
		

	}

}
