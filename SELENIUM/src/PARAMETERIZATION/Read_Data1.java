package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data1 {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	

String Path = "C:\\Main\\Manual\\STUDENTS.xlsx";

FileInputStream file = new FileInputStream(Path);
String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
//Double Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(2).getNumericCellValue();

System.out.println(Data);

	}

}
