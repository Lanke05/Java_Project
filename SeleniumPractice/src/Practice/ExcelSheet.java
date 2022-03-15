package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//String path = "C:\\Users\\hp-pc\\Desktop\\Company List.xlsx";
		
		//FileInputStream file = new FileInputStream(path);
		//input stream
		//String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(value);
		//double value2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(8).getCell(5).getNumericCellValue();
		//System.out.println(value2);
		String path = "C:\\Users\\hp-pc\\Desktop\\Company List.xlsx";
		
		FileInputStream file = new FileInputStream(path);
	Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastrowNo = sheet.getLastRowNum();
		System.out.println(lastrowNo);
		
		Row row = sheet.getRow(1);
		
		int lastcellNo = row.getLastCellNum();
		System.out.println(lastcellNo);
		
		for (int i = 0 ; i <= 2 ; i++)         //no of rows
		{
			for (int j = 0 ; j <= 2 ; j++)    // no. of cells
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(" " + value);
				System.out.print(",");
			}	
			System.out.println();
		}	
	}	
}
