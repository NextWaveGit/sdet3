package com.fannie.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelRead {
	
	public static void main(String[] args) throws IOException{
		String path = "C:\\Users\\Huser\\Desktop\\sample.xlsx";
		
		
		String sheetName = "Sheet1";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		XSSFCell cell = sheet.getRow(0).getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		workBook.close();		
		
		
	}
	
	
	public static XSSFSheet getSheet(String path, String sheetName) throws FileNotFoundException, IOException{
XSSFWorkbook workBook = new XSSFWorkbook(new FileInputStream(path));
	
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		return sheet;
	}
	

}
