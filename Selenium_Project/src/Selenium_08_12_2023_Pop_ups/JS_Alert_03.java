package Selenium_08_12_2023_Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Alert_03 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");//frame by index,name,webelement
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.sendKeys("Hi all");
		System.out.println(a1.getText());
		a1.accept();
		//a1.dismiss();
		
	}

}
