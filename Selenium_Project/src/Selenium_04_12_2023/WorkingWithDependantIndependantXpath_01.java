package Selenium_04_12_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDependantIndependantXpath_01 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver1.get("https://www.purplle.com/brand/maybelline");
		driver1.findElement(By.xpath("//div[contains(text(),'Maybelline New York Tattoo Eye Liner')]/../../../..//a[text()=' Add to Cart ']")).click();
		
		//input[@value='Add To Cart']
	}

}
