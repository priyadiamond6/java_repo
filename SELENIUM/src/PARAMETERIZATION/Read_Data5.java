package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String Path = "C:\\Users\\dell\\Desktop\\STUDENTS.xlsx";
		
FileInputStream File  = new FileInputStream(Path); // to open the file
        
XSSFWorkbook work = new XSSFWorkbook(File); // XSSFWorkbook is used to read the data of the file
        
XSSFSheet sheet = work.getSheet("Sheet1"); // XSSFSheet is used to fetch sheet inside the file
        
int Row = sheet.getLastRowNum();
        
    System.out.println(Row);
    
    int Column = sheet.getRow(0).getLastCellNum();
    
   System.out.println(Column);
   String str =  sheet.getRow(8).getCell(1).getStringCellValue();
   System.out.println(str);

	}

}
