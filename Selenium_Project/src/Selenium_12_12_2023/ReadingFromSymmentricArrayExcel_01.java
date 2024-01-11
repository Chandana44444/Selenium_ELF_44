package Selenium_12_12_2023;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingFromSymmentricArrayExcel_01 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file=new File("./resources/SymmentricData_01.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		int rowCount = wb.getSheet("Sheet1").getPhysicalNumberOfRows()-1;
		System.out.println(rowCount);
		int cellCount = wb.getSheet("Sheet1").getRow(3).getPhysicalNumberOfCells();
		System.out.println(cellCount);

		
		String[][] arr=new String[rowCount][cellCount];
		
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				arr[i][j]=wb.getSheet("Sheet1").getRow(i+1).getCell(j).toString();
			}
		}
		
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}
