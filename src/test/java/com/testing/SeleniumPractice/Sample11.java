package com.testing.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample11 {

	public static WebDriver driver;
	public static void launchBrowser(String browserName)
	{
		switch(browserName.toLowerCase())
		{
		case "chrome":
		driver=new ChromeDriver();
		System.out.println("launch chrome browser");
		case "edge":
			driver=new EdgeDriver();
			System.out.println("launch edge browser");
			
			default:
				System.out.println("please select valid browser");
				break;
				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		launchBrowser("edge");
		driver.get("https://www.amazon.in");
	}

}
