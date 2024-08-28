package com.com.Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelfileReading {
  @Test
  public void fileReadTest() throws IOException
  {
	  File f1=new File(System.getProperty("user.dir")+"//Data\\Dataset.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row-->cell--->data
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  
	  //number of cells
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  
	  //creating array of same size to file
	  Object data[][]=new Object[rows-1][cells];//5 rows 2 cells
	  
	  
	  //read data from file and keep it inside the array
	  
	  for(int i=1;i<rows;i++)//rows
	  {
		  for(int j=0;j<cells;j++)//cells
		  {
			  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data[i-1][j]+"   ");
		  }
		  System.out.println();//next line
	  }
	
	 
	
	  
  }
}