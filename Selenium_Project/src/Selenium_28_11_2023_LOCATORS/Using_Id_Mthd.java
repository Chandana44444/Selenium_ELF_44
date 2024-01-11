package Selenium_28_11_2023_LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Id_Mthd 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver1.findElement(By.id("Email")).sendKeys("Chandana@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.id("Password")).sendKeys("pass@123");
		Thread.sleep(2000);
		driver1.findElement(By.id("RememberMe")).click();
	}
}
