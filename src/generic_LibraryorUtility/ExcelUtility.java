package generic_LibraryorUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This Class is generic class to fetch data from excel
 * @author praveen
 *
 */
public class ExcelUtility {
public String getDataFromExcel(String SheetName,int rowNum,int cellNum) throws Exception
{
	FileInputStream fis=new FileInputStream(IconstantUtility.ExcelPath);
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(SheetName);
	DataFormatter df=new DataFormatter();
	String Data=df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
	return Data;	
}
}
