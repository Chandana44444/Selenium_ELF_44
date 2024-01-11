package Selenium_08_12_2023_Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Alert_02 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		//driver.findElement(By.linkText("Pay Premium")).click();
		driver.findElement(By.xpath("//a[@title=\"Pay Premium Online\"]")).click();
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		//a1.accept();//click ok
		a1.dismiss();//click cancel
		
	}

}
