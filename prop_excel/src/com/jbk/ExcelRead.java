package com.jbk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelRead {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		FileInputStream fis = new FileInputStream("xyz.xls");
		System.out.println(2);
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet(0);

		Cell cell = sheet.getCell(0, 0);
		System.out.println(cell.getContents());
		int rows = sheet.getRows();
		System.out.println(rows);
		int cols = sheet.getColumns();
		System.out.println(cols);
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				
				System.out.println("i >> "+i);
				System.out.println("j >> "+j);
				Cell cell1 = sheet.getCell(i, j);
				System.out.println(cell1.getContents());
			}
		}

	}
}







