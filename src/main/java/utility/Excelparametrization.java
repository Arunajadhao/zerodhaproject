package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelparametrization {
	public static String excelsheet(String SheetName, int row,int cell ) throws EncryptedDocumentException, IOException
	{
	FileInputStream file= new FileInputStream("C:\\Users\\chavan\\eclipse-workspace\\zerodha\\src\\test\\resources\\zerodhasheet.xlsx");
	String value = WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	return value;
	}

}

