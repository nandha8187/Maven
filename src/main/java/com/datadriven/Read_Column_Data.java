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

public class Read_Column_Data {

	public static void Read_AllColumnData() throws IOException {


		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_NK\\src\\main\\java\\Sample.Data.xlsx");

		FileInputStream fil =new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fil);

		Sheet s = wb.getSheetAt(0);

		Row row = s.getRow(1);

		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {

			Row r =s.getRow(i);

			Cell c = r.getCell(2);

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

		wb.close();
	}

}









	