package com.selenium.exclwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelEx1 {

	@Test
	public void readExcel() throws Exception {
		File f = new File("Testdata\\Testdata2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rcount = sheet.getLastRowNum();
		for (int i = 0; i <= rcount; i++) {
			int Ccount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < Ccount; j++) {

				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Data in the sheet are: " + data);
			}
		}

	}

}
