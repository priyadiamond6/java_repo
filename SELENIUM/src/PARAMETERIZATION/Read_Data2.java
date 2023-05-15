package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.harmony.pack200.CPInt;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		String Path = "C:\\Main\\Manual\\STUDENTS.xlsx";

		FileInputStream file = new FileInputStream(Path);
		
		String data = WorkbookFactory.create(file).getSheetAt(0).
//		getSheet("Sheet1").
		getRow(1).
		getCell(1).getStringCellValue();
		
		
		System.out.println(data);

	}

}
