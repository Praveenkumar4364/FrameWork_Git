package data_driver_sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel2 {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("D:\\Our_Class\\OurClassTestCase.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	DataFormatter df=new DataFormatter();
	String d=df.formatCellValue(sh.getRow(1).getCell(1));
	String d1=df.formatCellValue(sh.getRow(1).getCell(2));
	System.out.println(d1);
	System.out.println(d);
}
}
