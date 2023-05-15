package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LastRowLastCell {

	public static void main(String[] args) throws IOException {
String Path = "C:\\Users\\dell\\Desktop\\EMPLOYEE.xlsx";
	
        FileInputStream File  = new FileInputStream(Path);
        
        XSSFWorkbook work = new XSSFWorkbook(File);
        
        XSSFSheet sheet = work.getSheet("Sheet1");
        
        int Row = sheet.getLastRowNum();
        
        System.out.println(Row);
        
        int Column = sheet.getRow(1).getLastCellNum();
        
        System.out.println(Column);

	}

}
