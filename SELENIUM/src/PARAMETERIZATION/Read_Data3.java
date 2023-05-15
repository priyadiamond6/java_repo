package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data3 {

	public static void main(String[] args) throws IOException {
	
		String Path = "C:\\Main\\Manual\\STUDENTS.xlsx";
		
        FileInputStream File  = new FileInputStream(Path);
        
        XSSFWorkbook work = new XSSFWorkbook(File);
        
        XSSFSheet sheet = work.getSheet("Sheet1");
        
        int Row = sheet.getLastRowNum();
        
        System.out.println(Row);
        
        int column = sheet.getRow(1).getLastCellNum();
        
        System.out.println(column);
        
        for(int R=0;R<=Row ;R++) {    //Row
       	 
       	XSSFRow row=sheet.getRow(R);
       	 
       	 for(int C=0;C<column;C++) {  //Cell
       		 
       		String Value = row.getCell(C).toString();
       		 //XSSFCell cell = row.getCell(C);
       		System.out.println(" | " +Value);
       		 
       	 }
       	 System.out.println();
       	 
        }

	}

}
