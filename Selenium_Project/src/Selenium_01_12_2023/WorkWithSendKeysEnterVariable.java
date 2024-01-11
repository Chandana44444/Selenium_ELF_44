package Selenium_01_12_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithSendKeysEnterVariable
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("c","a","r",Keys.ENTER);
		//write on which element , enter is applicable
	}
}
