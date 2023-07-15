package com.selenium.TestNG1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestingMastersEx3 {
	@Test
	public void designation() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> checkbox = driver.findElements(
				By.xpath("//table[@id='VisitingTable']//td[text()='Manager']//preceding-sibling::td[4]/input"));
		List<WebElement> design = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[5]"));
		for (int i = 0; i < checkbox.size(); i++) {
			// String text = design.get(i).getText();
			// if (text.equals("Manager")) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", checkbox.get(i));
			//js.executeScript("window.scrollBy(0,1000)", checkbox.get(i) );
			
		}

	}
}
