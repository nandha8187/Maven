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

public class Read_All_Data {

	public static void All_Cell_Data() throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Sample.Data.xlsx");

		FileInputStream fil =new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fil);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);    // i represents row index
			
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				
				
				Cell c = r.getCell(j);  // j represents column
				
				CellType type = c.getCellType();
				
				if(type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					
					System.out.println(value);
					
				}
					
				else if (type.equals(CellType.NUMERIC)) {
					
					double numericValue = c.getNumericCellValue();
					
					int v =(int) numericValue;   //narrowing type casting 
					
				    String value = Integer.toString(v);
					
					System.out.println(value);
					
				 }
		
			}
					
			}
			wb.close();
		}
           
			public static void main(String[] args) throws IOException {
				
				All_Cell_Data();
				
				
			}
			


}



