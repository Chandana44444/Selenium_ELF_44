package Selenium_Assessment_01;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arranging_in_Alphabetical_Program_02 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/Lenovo/Downloads/TestPage%20(1).html");
		driver.findElement(By.xpath("//button[@onclick=\"open_win()\"]")).click();
		
		ArrayList<String> a=new ArrayList();

		Set<String> allwindowsid = driver.getWindowHandles();
		for(String id:allwindowsid)
		{
			driver.switchTo().window(id);
			Thread.sleep(6000);
			String titles = driver.getTitle();
			a=new ArrayList();
			a.add(titles);
//			Collections.sort(a);
//			System.out.println(a);
		}
		
		Collections.sort(a);
		System.out.println(a);
		
		//Thread.sleep(3000);
		
		for(String s1:a)
		{
			driver.switchTo().window(s1);
			Thread.sleep(3000);
			driver.close();
		}
		
	}
}
