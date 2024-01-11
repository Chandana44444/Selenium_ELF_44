package Selenium_08_12_2023_Pop_ups;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Alert_01 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.get("https://www.ilovepdf.com/pdf_to_word");
		WebElement select_Button = driver.findElement(By.xpath("//span[text()='Select PDF file']/../..//input"));
		//select_Button.click();
		Actions a=new Actions(driver);
		a.scrollToElement(select_Button).scrollByAmount(0, 200).perform();
		select_Button.sendKeys("C:\\Users\\Lenovo\\OneDrive\\Desktop\\BE\\cg report.pdf");
		
		//input[@multiple="multiple"]-->img converter
		//https://cloudconvert.com/image-converter
					
	}
}
