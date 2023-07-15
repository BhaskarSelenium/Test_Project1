package com.selenium.TestNG1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingMastersEx5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> design1 = driver
				.findElements(By.xpath("//table[@id='VisitingTable']//following-sibling::tr/td[5]"));
		List<WebElement> status1 = driver
				.findElements(By.xpath("//table[@id='VisitingTable']//td[text()='Analyst']//following-sibling::td[3]/select"));
		for(WebElement state:status1) {
			Select s=new Select(state);
			String text1=s.getFirstSelectedOption().getText();
			if(text1.equals("Pending")) {
				s.selectByVisibleText("Rejected");
				
			}
			
		}

		/*
		 * for (int i = 0; i < design1.size(); i++) { String text0 =
		 * design1.get(i).getText(); if (text0.equals("Analyst")) { for (WebElement
		 * option : status1) { if ("Rejected".equals(option.getText())) option.click();
		 * System.out.println(option.getText()); Thread.sleep(20); break;
		 * 
		 * }
		 * 
		 * } }
		 */	}

}
