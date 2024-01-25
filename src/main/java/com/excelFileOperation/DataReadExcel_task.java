package com.excelFileOperation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReadExcel_task {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book =new XSSFWorkbook("C:\\Users\\sures\\eclipse-workspace\\Idc_BBP\\Sheet1.xlsx");
		XSSFSheet sheet =book.getSheetAt(0);
		
		int rowCount =sheet.getLastRowNum();
		int columnCoun = sheet.getRow(0).getLastCellNum();
		
		String [][] data =new String[rowCount][columnCoun];
		
		for (int i=1;i<=rowCount;i++) {
		XSSFRow row = sheet.getRow(i);
		
		for(int j=0;j<columnCoun;j++) {
			XSSFCell cell =row.getCell(j);
			
			data[i-1][j]=cell.getStringCellValue();
			System.out.println(cell.getStringCellValue());
		}
		}
	}

}
