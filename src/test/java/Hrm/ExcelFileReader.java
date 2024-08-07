package Hrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFileReader {
  @Test
  public void Readfiledata() throws IOException 
  {
	  //String excelpath="D:\\Chandrasekar_Selenium_Demo\\OrangeHrm\\Dataset\\Data.xlsx";
	  File f1=new File(System.getProperty("user.dir")+"//Dataset\\Data.xlsx");
	  FileInputStream fs= new FileInputStream(f1);
	  
       XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //number of rows
	  int rows=wb.getSheet("username").getPhysicalNumberOfRows();
	  
	  //number of cells
	  int cells=wb.getSheet("username").getRow(0).getPhysicalNumberOfCells();
	  
	  //creating array of same size to file
	  Object data[][]=new Object[rows-1][cells];//5 rows 2 cells
	  
	  
	  //read data from file and keep it inside the array
	  
	  for(int i=1;i<rows;i++)//rows
	  {
		  for(int j=0;j<cells;j++)//cells
		  {
			  data[i-1][j]=wb.getSheet("username").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data[i-1][j]+"   ");
		  }
		  System.out.println();//next line
	  }
	  
	 
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
}
