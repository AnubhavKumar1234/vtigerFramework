package comcast.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility 
{
	public String getExcelData(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row r = sh.getRow(rownum);
		Cell cel = r.getCell(cellnum);
		String data = cel.getStringCellValue();
		return data;
		
//		DataFormatter format=new DataFormatter();
//		return format.formatCellValue(wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue());
	}

}
