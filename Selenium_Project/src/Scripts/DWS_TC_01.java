package Scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Chandana
 * 
 */

public class DWS_TC_01 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		// Steps to read data form Excel
		Workbook workbook=WorkbookFactory.create(new FileInputStream(new File("./resources/DemoWebShopTask_01.xlsx")));
		String username = workbook.getSheet("Sheet2").getRow(0).getCell(0).toString();
		String password = workbook.getSheet("Sheet2").getRow(1).getCell(0).toString();

		// Expected Data
		String welcomePageTitle ="Demo Web Shop";
		String homePageTitle = "Demo Web Shop";
		
		// Test step 1 : Open the browser and enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actualWelcomePageTitle = driver.getTitle();
		//System.out.println(actualWelcomePageTitle);
		if (actualWelcomePageTitle.equals(welcomePageTitle)) 
		{
			System.out.println("Welcome page is displayed");
		} 
		else 
		{
			System.out.println("Welcome page is not displayed");
		}
		
		// Test step 2 : Click on login in button
		driver.findElement(By.linkText("Log in")).click();
		if (driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).isDisplayed())
		{
			System.out.println("Login page is displayed");
		}
		else 
		{
			System.out.println("Login Page is not displayed");
		}
		
		// Test step 3 : Enter given data in Username txt field
		WebElement usernameTextField = driver.findElement(By.id("Email"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String usernameEntered = usernameTextField.getAttribute("value");//entered value will be stored in value "attribute"
		if (usernameEntered.equals(username)) 
		{
			System.out.println("Username was entered sucessfully");
		}
		else 
		{
			System.out.println("Username was not entered sucessfully");
	    }
		
		// Test step 4 : Enter given data in password txt field
		WebElement passowrdTextField = driver.findElement(By.id("Password"));
		passowrdTextField.clear();
		passowrdTextField.sendKeys(password);
		String passwordEntered = passowrdTextField.getAttribute("value");
		if (passwordEntered.equals(password))
		{
			System.out.println("Password was entered sucessfully");
		}
		else
		{
			System.out.println("Password was not entered sucessfully");
		}
		
		//Test step 5 : Click on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String actualHomePageTitle = driver.getTitle();
		//System.out.println(actualHomePageTitle);
		if (actualHomePageTitle.equals(homePageTitle)) 
		{
            System.out.println("Home page is displayed");
		}
		else 
		{
			System.out.println("Home page is not displayed");
		}

	}
}
