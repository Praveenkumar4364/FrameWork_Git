package data_driver_sample;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Multiple_Data_FromExcel {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("D:\\Our_Class\\OurClassTestCase.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet2");
	DataFormatter df=new DataFormatter();
	for(int i=1;i<=sh.getLastRowNum();i++)
	{
		Row r=sh.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++)
		{
			Cell c= r.getCell(j);
			String s= df.formatCellValue(c);
			System.out.println(s);
		}
	}
}
}
