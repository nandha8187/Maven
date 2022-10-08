package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("‪‪C://Users//ADMIN//Documents//Write_Excel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
//		Sheet createSheet = wb.createSheet("PassWord_Data");
//		
//		Row createRow = createSheet.createRow(0);
//		
//		Cell createCell = createRow.createCell(0);
//		
//		createCell.setCellValue("Email");
		

		wb.createSheet("PassWord_Data").createRow(0).createCell(0).setCellValue("Email");
		
		wb.getSheet("PassWord_Data").getRow(0).createCell(1).setCellValue("PassWord");
		
		wb.getSheet("PassWord_Data").createRow(1).createCell(0).setCellValue("nandha");
	
		wb.getSheet("PassWord_Data").createRow(1).createCell(1).setCellValue("suresh@619");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("write sussefully");
		
		
		
	
	}
	
}

	
