package TASK_DWS_GENERIC_LIBRARY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadMultipleRows {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Creating FIS
		File abspath = new File("./resources/Dec11.xlsx");		
		FileInputStream fis = new FileInputStream(abspath);
		
		//Step 2 : Respective File object creation
		Workbook workbook = WorkbookFactory.create(fis);
	
		//Step 3 : read methods
		int rowCount = workbook.getSheet("demo").getPhysicalNumberOfRows()-6;
		int cellCount = workbook.getSheet("demo").getRow(7).getPhysicalNumberOfCells();
		
		System.out.println(rowCount);
		System.out.println(cellCount);

		
		String[][] arr = new String[rowCount][cellCount];
		
		for(int i=0; i<rowCount; i++) {
			for(int j=0; j<cellCount; j++) {
				arr[i][j] = workbook.getSheet("demo").getRow(i+6).getCell(5).toString();
			}
		}

		for(int i=0; i<rowCount; i++) {
			for(int j=0; j<cellCount; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}
}
