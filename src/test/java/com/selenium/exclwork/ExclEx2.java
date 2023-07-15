package com.selenium.exclwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExclEx2 {

	@Test
	/*public static XSSFCell appLogin() throws Exception {
		File f = new File("Testdata\\Testdata2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);

		// int rcount = sheet.getLastRowNum();
		XSSFCell browser = sheet.getRow(0).getCell(0);
		return browser;
		
	}
	*/
	public static String getcelldata() throws IOException {
		
		int rownumber1=1;
		int colNumber1=0;
		
		String sheetName="Testdata2.xlsx";
		String celltext=null;
		File file=new File("E:\\Selenium\\Selenium_Project\\Testdata\\Testdata2.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb= null;
		if(sheetName.endsWith(".xlsx")) {
			wb=new XSSFWorkbook(inputStream);
		}
		else {
			
		}
		 // Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet worksheet = workbook.getSheet(sheetName);
		Row row=worksheet.getRow(rownumber1-1);
		System.out.println(row);
		Cell c=row.getCell(colNumber1);
		if(c!=null) {
			celltext =row.getCell(colNumber1).getStringCellValue();
		}
		else {
			
		}


		return celltext;
		
	}
}
