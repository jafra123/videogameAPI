package readDataExcelSDETAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		String excelFilePath ="C:\\Users\\manmo\\Desktop\\LearningSelenium";
		FileInputStream inputstream = new FileInputStream(excelFilePath);		
		HSSFWorkbook workbook = new HSSFWorkbook(inputstream);
		HSSFSheet sheet = workbook.getSheet("TestData");
		// using for loop 
		int rows = sheet.getLastRowNum();
		int cols =sheet.getRow(1).getLastCellNum();
		
		
		
		for(int r=1;r<=rows; r++) {
			sheet.getRow(r);
			
			for (int c=0; c<cols;c++) {
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
