package DataProvider_19_12_23;

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

public class TestCase_002 {
	@DataProvider
	//@DataProvider(parallel = true)
	public String[][] datas() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(new File("./resources/SymmentricData_01.xlsx"));
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheetName = wb.getSheet("DWS_Login");
		int rowCount = sheetName.getPhysicalNumberOfRows();
		int info = sheetName.getRow(0).getPhysicalNumberOfCells()-1;
		
		String[][] arr=new String[rowCount][info];
		
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<info;j++)
			{
				arr[i][j]=sheetName.getRow(i).getCell(j+1).toString();
			}
		}
		return arr;
	}
	
	@Test(dataProvider = "datas")
	public void login(String[] data)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement Email_Box = driver.findElement(By.id("Email"));
		Email_Box.clear();
		//Email_Box.sendKeys("chandu@123");
		Email_Box.sendKeys(data[0]);
		WebElement pswd_Box = driver.findElement(By.id("Password"));
		pswd_Box.clear();
		//pswd_Box.sendKeys("cha@1234");
		pswd_Box.sendKeys(data[1]);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}


}
