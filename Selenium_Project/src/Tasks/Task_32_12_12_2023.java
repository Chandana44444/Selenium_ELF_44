package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_32_12_12_2023 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file=new File("./resources/DemoWebShopTask_01.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		Workbook worksheet=WorkbookFactory.create(file);
		
		String username = worksheet.getSheet("Sheet1").getRow(7).getCell(5).toString();
		String pswd = worksheet.getSheet("Sheet1").getRow(8).getCell(5).toString();
		
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(pswd);
		
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
	
	}

}
