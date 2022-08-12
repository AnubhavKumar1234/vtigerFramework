package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis=new FileInputStream("./Book1.xlsx");
		
		Workbook wb=  WorkbookFactory.create(fis) ;
		
		Sheet sh=wb.getSheet("Organization");
		int last = sh.getLastRowNum();
		for(int i=0;i<=last;i++)
		{
		
		Row row=sh.getRow(i);
		 short row1 = row.getLastCellNum();
		  for(int j=0;j<=row1;j++)
		  {
		
		Cell cell=row.getCell(j);
		
		  
		
		String cellvalue1=cell.getStringCellValue();
		System.out.println(cellvalue1);
		
		  }
		
		  
//		System.out.println(cellvalue1);
		  
		}
		

	}

}
