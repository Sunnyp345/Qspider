package abc;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class execution {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	Hello h = new Hello();
	String value = h.readDataFromExcel("Sheet1", 0, 1);
	System.out.println(value);

	}

}
