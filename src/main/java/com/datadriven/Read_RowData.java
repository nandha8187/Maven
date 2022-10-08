package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class Read_RowData {

	public static void Read_AllRowData() throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Sample.Data.xlsx");

		FileInputStream fil =new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fil);

		Sheet s = wb.getSheetAt(0);

		Row row = s.getRow(0);
		
		for (int i = 0; i < 2; i++) {

			Cell cell = row.getCell(i);
		
			DataFormatter dft = new DataFormatter();
		
			String value = dft.formatCellValue(cell);
			System.out.println(value);
			}
		
		wb.close();
		
}
	public static void main(String[] args) throws IOException {

		Read_AllRowData();

	}

}