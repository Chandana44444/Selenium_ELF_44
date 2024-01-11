package DataProvider_18_12_23;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Skillrary {
	
	@DataProvider(parallel=true)
	public String[] data_to_be_entered() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(new File("./resources/SymmentricData_01.xlsx"));
		Workbook wb=WorkbookFactory.create(fis);
		int cellcount = wb.getSheet("SkillRary").getRow(0).getPhysicalNumberOfCells()-1;
		System.out.println(cellcount);
		String[] data= {"123","abc","123abc"};
//		String[] data=new String[cellcount];
//		for(int i=0;i<cellcount;i++)
//		{
//			data[i]=wb.getSheet("SkillRary").getRow(0).getCell(i+1).toString();
//		}
		return data;
	}
	
	@Test(dataProvider = "data_to_be_entered")
	public void login(String testdata) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.skillrary.com/user/login");
		//driver.findElement(By.id("email")).sendKeys("abcde");
		driver.findElement(By.id("email")).sendKeys(testdata);

	}

}
