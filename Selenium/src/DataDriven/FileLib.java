package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public static String getCellData(String path,String sheet,int row,int cell) throws Throwable, IOException
	{
		FileInputStream fis = new FileInputStream(path);
	Workbook wb =	WorkbookFactory.create(fis);
	String excelValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	return excelValue;
			
	}

}
