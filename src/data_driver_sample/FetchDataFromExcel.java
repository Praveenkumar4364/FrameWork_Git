package data_driver_sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class FetchDataFromExcel {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("D:\\Our_Class\\OurClassTestCase.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	Row r=sh.getRow(1);
	Cell c=r.getCell(1);
	String d=c.getStringCellValue();
	System.out.println(d);
}
}
