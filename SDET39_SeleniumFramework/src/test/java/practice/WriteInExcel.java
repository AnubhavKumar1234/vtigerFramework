package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteInExcel 
{

	public static void main(String[] args) throws Throwable 
	{
        FileInputStream fis=new FileInputStream("./Book1.xlsx");
		
		Workbook wb=  WorkbookFactory.create(fis) ;
		
		Sheet sh=wb.getSheet("Organization");
		
		Row r=sh.createRow(6);
		
		Cell cel=r.createCell(6);
		cel.setCellValue("Divya");
		
		FileOutputStream fos=new FileOutputStream("./Book1.xlsx");
		wb.write(fos);
		wb.close();
		
		
		

	}

}
