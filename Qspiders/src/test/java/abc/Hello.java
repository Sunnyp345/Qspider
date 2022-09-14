package abc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Hello {
	public String readDataFromExcel(String sheet,int RowNum,int ColNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/excelsheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String string = wb.getSheet(sheet).getRow(RowNum).getCell(ColNum).toString();
		return string;
		
	}

}
