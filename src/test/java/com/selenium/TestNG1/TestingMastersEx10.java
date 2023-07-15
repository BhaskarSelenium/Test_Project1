package com.selenium.TestNG1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingMastersEx10 {

	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> email1 = driver
				.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[4][starts-with(text(), 'demo')]"));
		for (int i = 0; i < email1.size(); i++) {
			System.out.println(email1.get(i).getText());
			//String text2 = email1.get(i).getText();
			//System.out.println(text2);
		}
	}
}
