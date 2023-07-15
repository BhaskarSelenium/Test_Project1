package com.testing.SeleniumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCWindowHandl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement frame_element = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame_element);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("293857694");
		String mainwindow = driver.getWindowHandle();
		System.out.println("Main window id: " + mainwindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//span[@class='lightbluecolor'])[5]/a")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		int i=1;
		for (String wind : windows) {
			System.out.println("windows:" + wind);
			/*if(i==2)
			{
				driver.switchTo().window(wind);
			}
			i++;
		}*/
	    System.out.println(driver.getTitle());
	}

	}
}
