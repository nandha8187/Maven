package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	
	
	public static void particular_Cell_Data() throws IOException {
		
		
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Sample.Data.xlsx");
		
		FileInputStream fil =new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fil);
		
		Sheet sheet = wb.getSheetAt(0);
		
		Row row = sheet.getRow(3);
		
		Cell cell = row.getCell(1);
		
		CellType type = cell.getCellType();
		
		if (type.equals(CellType.STRING)) {
		
		  String cellValue = cell.getStringCellValue();
			
		  System.out.println(cellValue);
			
		}else if(type.equals(CellType.NUMERIC)) {		
		
	        double cellValue = cell.getNumericCellValue();
	         
	        int value = (int) cellValue;
	        
	        System.out.println(value);
	        
			
		}
			
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		particular_Cell_Data();
	
	
	}
	

}