package TASK_DWS_GENERIC_LIBRARY;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_003 {
	//@DataProvider
	@DataProvider(name="test1",parallel = true)
	public String[][] datas() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(new File("./resources/Dec11.xlsx"));
		Workbook wb=WorkbookFactory.create(fis);//excel library
		
		Sheet sheetName = wb.getSheet("demo");
		int rowCount = sheetName.getPhysicalNumberOfRows()-6;
		int info = sheetName.getRow(6).getPhysicalNumberOfCells();
		
		System.out.println(rowCount);
		System.out.println(info);
		
		String[][] arr=new String[rowCount][info];
		
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<info;j++)
			{
				arr[i][j]=sheetName.getRow(i+6).getCell(5).toString();
			}
		}
		return arr;
	}
	
//	@DataProvider(name="test2")
//	public String[][] data() 
//	{
//		String[][] arr= {
//				            {"female","Chandana","Manjesh","chandu@gmail.com","Chandu@123","Chandu@123"},
//				            {"female","Poornima","Anjanappa","pooo@gmail.com","Poo@612","Poo@612"},
//				            {"male","Appu","Punith","pooo@gmail.com","Poo@613","Poo@613"}
//                
//		};
//		return arr;
//	}
//	
	@Test(dataProvider = "test1")
	public void login(String[] data)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-"+data[0].toLowerCase()+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data[1]);
		driver.findElement(By.id("LastName")).sendKeys(data[2]);
		driver.findElement(By.id("Email")).sendKeys(data[3]);
		driver.findElement(By.id("Password")).sendKeys(data[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[5]);
	    driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
	}


}
