package Selenium_29_11_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_ClassName_Mthd 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver1.findElement(By.linkText("Log in")).click();
		driver1.findElement(By.id("Email")).sendKeys("Chandana.p.m.4444@gmail.com");
		driver1.findElement(By.id("Password")).sendKeys("Chandu121*");
		driver1.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		//driver1.findElement(By.cssSelector("input[value='Log in']")).click();
		driver1.findElement(By.cssSelector("input[value=\"Log in\"]")).click();//escape character to add " "(String)


	}

}
