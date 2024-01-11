package Selenium_01_12_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithSendKeysControl
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("abcde",Keys.CONTROL+"a");
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");

	}
}
