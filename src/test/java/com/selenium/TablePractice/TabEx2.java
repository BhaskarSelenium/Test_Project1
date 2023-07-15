package com.selenium.TablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabEx2 {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List <WebElement> headerlist=driver.findElements(By.xpath("//table[@id='VisitingTable']/thead/tr/th"));
		System.out.println("list of headers in the table is:" +headerlist.size());
		
		for(WebElement ele:headerlist) {
			
			System.out.println(ele.getText());
		}
		
		List <WebElement> headerbody=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr"));
		System.out.println("list of headers in the table is:" +headerbody.size());
		
		for(WebElement row:headerbody) {
			
			System.out.println(row.getText());
		}
		WebElement cell=driver.findElement(By.xpath("//table[@id='VisitingTable']/tbody/tr[5]/td[3]"));
		
		System.out.println(cell.getText());
		
	}

}
