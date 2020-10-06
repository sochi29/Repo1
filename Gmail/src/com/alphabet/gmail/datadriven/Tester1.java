package com.alphabet.gmail.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester1
{
	public static void main(String[] args) throws IOException 
	{
		//Store the filePath and Sheet Name
		String filePath = "E:\\Ruchi Qspider\\Selenium program\\testdata.xlsx ";
		String sheetName = "TC001";
		
		//Create The Object of FileInputStream with Excel filePath
		FileInputStream excelFile = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(excelFile);
		
		//Get the Sheet from which you want to fetch the Data
		Sheet sheet = wb.getSheet(sheetName);
		
		//Get the Data from the Sheet's Rows and Colums
		Row row = sheet.getRow(1);
		String usernameData =row.getCell(1).getStringCellValue();
		System.out.println(usernameData);
	}
}
