package com.selenium.TestNG1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingMastersEx2 {
	@Test
	public void designation() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> eid = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[2]"));
		List<WebElement> email = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[4]"));
		List<WebElement> days = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[7]"));
		for (int i = 0; i < days.size(); i++) {
			String sdays = days.get(i).getText();
			int c = Integer.parseInt(sdays);
			if (c <= 5) {
				String empID=eid.get(i).getText();
				String text=email.get(i).getText();
				System.out.println(empID+" : "+text+" : "+c);
			}

		}

	}
}
