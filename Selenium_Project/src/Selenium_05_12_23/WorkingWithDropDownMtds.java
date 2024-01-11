package Selenium_05_12_23;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDownMtds 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.linkText("Create new account")).click();
		
		WebElement date = driver1.findElement(By.id("day"));
		WebElement month = driver1.findElement(By.id("month"));
		WebElement year = driver1.findElement(By.id("year"));
		
		Select dateref=new Select(date);
		dateref.selectByIndex(5);
		Select monthref=new Select(month);
		monthref.selectByValue("Dec");
		Select yearref=new Select(year);
		yearref.selectByVisibleText("2023");
		
		System.out.println(dateref.isMultiple());//false
		
	}
}
