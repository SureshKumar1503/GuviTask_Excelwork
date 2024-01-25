package com.excelFileOperation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataToExcel_task {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		
		Object [][] data = {
				{"Name","Age","Email"},
				{"John Doe","30","john@test.com"},
				{"Jane Doe","28","jane@test.com"},
				{"Bob Smith","35","jacky@example.com"},
				{"Swapnil","37","swapnil@example.com"}
		};
		int rowcount = 0;
		for(Object[] row1: data) {
			
			XSSFRow row=sheet.createRow(rowcount++);
			
			
			int columncount = 0;
			for(Object col : row1) {
				XSSFCell cell= row.createCell(columncount++);
				
				if (col instanceof String) {
					cell.setCellValue((String) col);
				} else if (col instanceof Integer) {
					
					cell.setCellValue((Integer) col);
					
					
				}		
			}
			
			}
		
		try( 
			FileOutputStream excel = new FileOutputStream("C:\\Users\\sures\\eclipse-workspace\\Idc_BBP\\Sheet1.xlsx");){
		    book.write(excel);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


