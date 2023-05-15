package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HR_MANAGER {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		String Path = "C:\\Users\\dell\\Desktop\\EMPLOYEE.xlsx";

		FileInputStream file = new FileInputStream(Path); // fileinputstream is used to open the file
	
		// create of workbook is used to fetch data from third row & third column
		
String data = WorkbookFactory.create(file).getSheetAt(0).getRow(3).getCell(3).getStringCellValue();
		
		
		System.out.println(data);

}
}