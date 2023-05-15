package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ForLoopToString {

	public static void main(String[] args) throws IOException {
	
	String Path = "C:\\Users\\dell\\Desktop\\Employee.xlsx";
	FileInputStream File = new FileInputStream(Path);
	XSSFWorkbook work = new XSSFWorkbook(File);
	XSSFSheet sheet = work.getSheet("Sheet1");
	
	int Row = sheet.getLastRowNum();
	System.out.println(Row);
	
	int Column = sheet.getRow(0).getLastCellNum();
	System.out.println(Column);
	
	for (int R=0; R<=Row; R++) {
		
		XSSFRow row = sheet.getRow(R);
		
		   for (int C=0; C<Column; C++) {
			   
			   String Value = row.getCell(C).toString();
			   System.out.print( " "+Value);
		   }
		   System.out.println(" | ");
	}
	System.out.println();
	}

}
