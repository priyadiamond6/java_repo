package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ALLDataSwitchStatement {

	public static void main(String[] args) throws IOException {
	
		String Path = "C:\\Users\\dell\\Desktop\\EMPLOYEE.xlsx";
		
		FileInputStream File = new FileInputStream (Path);
		
		XSSFWorkbook work = new XSSFWorkbook(File);
		
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		int Row = sheet.getLastRowNum();
		
		System.out.println(Row);
		
		int Column = sheet.getRow(1).getLastCellNum();
		
		System.out.println(Column);
		
		for (int R=1; R<=Row; R++ ) {
			
			XSSFRow row = sheet.getRow(R); 
			
				for (int C=0; C<Column; C++) {
					
					XSSFCell cell = row.getCell(C);
					
					switch (cell.getCellType()) {
					
					case STRING :
						System.out.print(cell.getStringCellValue());
						break;
					case NUMERIC :
						System.out.print(cell.getNumericCellValue());
						break;
						case BOOLEAN : 
						System.out.print(cell.getBooleanCellValue());
						default :
							System.out.print("different type of data");
					}
					
					System.out.print("|");
					
				}
				
				System.out.println();
						
						}
				}
			}
			


