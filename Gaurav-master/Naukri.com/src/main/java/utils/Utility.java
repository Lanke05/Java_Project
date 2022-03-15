package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static String getDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {	
		
		String data ="C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\TestData.xlsx";
		FileInputStream file = new FileInputStream(data);
		String value = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static void getScreenshot(WebDriver driver, int testID) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dateTime = new SimpleDateFormat("yyyy_MM_dd-hh-mm-ss").format(new Date());
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\Test-" + testID + "-" + dateTime + ".jpg");
		FileHandler.copy(source, destination);
	}

}
