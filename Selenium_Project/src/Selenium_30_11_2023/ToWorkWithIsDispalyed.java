package Selenium_30_11_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithIsDispalyed
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		System.out.println(driver1.findElement(By.xpath("//button[.='Log in']")).isEnabled());//accessing parent tag from child
		//System.out.println(driver1.findElement(By.xpath("//div[text()='Log in']/..")).isEnabled());//forward
		//System.out.println(driver1.findElement(By.xpath("//div[text()='Log in']/span")).isEnabled());//backward	
	}

}
