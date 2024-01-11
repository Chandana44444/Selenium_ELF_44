package Reading_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class P1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File file1=new File("./resources/Excel_Prgm_01.xlsx");
		FileInputStream fis=new FileInputStream(file1);
		
		Workbook workbook=WorkbookFactory.create(file1);
		
		String data1 = workbook.getSheet("Sheet4").getRow(0).getCell(10).toString();
		String data2 = workbook.getSheet("Sheet3").getRow(10).getCell(3).toString();
		String data3 = workbook.getSheet("Sheet2").getRow(12).getCell(15).toString();
		String data4 = workbook.getSheet("Sheet1").getRow(3).getCell(10).toString();
		
		double data11 = workbook.getSheet("Sheet4").getRow(7).getCell(10).getNumericCellValue();
		boolean data12 = workbook.getSheet("Sheet3").getRow(10).getCell(3).getBooleanCellValue();
		LocalDateTime data13 = workbook.getSheet("Sheet2").getRow(12).getCell(15).getLocalDateTimeCellValue();
		String data14 = workbook.getSheet("Sheet1").getRow(3).getCell(10).getStringCellValue();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
		System.out.println();
		
		System.out.println(data11);
		System.out.println(data12);
		System.out.println(data13);
		System.out.println(data14);

	}

}
