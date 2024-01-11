package Selenium_08_12_2023_Pop_ups;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Alert_01 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.get("https://www.agoda.com/");
		
		LocalDateTime ldt=LocalDateTime.now();
	//	LocalDateTime ldt=LocalDateTime.now().plusMonths(6);
		//LocalDateTime ldt=LocalDateTime.now().minusDays(6);
		int date = ldt.getDayOfMonth();
		String month = ldt.getMonth().name();
		String monthname = month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
		int year = ldt.getYear();
		
		try 
		{
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		}
		catch(NoSuchElementException e)
		{
			
		}
		driver.findElement(By.xpath("//div[@data-selenium=\"checkInBox\"]")).click();
		//driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		//driver.findElement(By.xpath("//div[text()='December 2023']/..//span[text()='8']")).click();
		//will select particular date,need to change manually everytime
//		driver.findElement(By.xpath("//div[text()='"+monthname+" "+year+"']/..//span[text()='"+(date)+"']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='"+monthname+" "+year+"']/..//span[text()='"+(date+1)+"']")).click();

		
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//div[text()='"+monthname+" "+(year+1)+"']/..//span[text()='"+(date-2)+"']")).click();
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='"+monthname+" "+(year+1)+"']/..//span[text()='"+(date-1)+"']")).click();
				break;
			}
			catch(NoSuchElementException n)
			{
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
			
	}
}
