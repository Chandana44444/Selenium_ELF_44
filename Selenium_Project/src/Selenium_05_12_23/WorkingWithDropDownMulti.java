package Selenium_05_12_23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDownMulti 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://demoapp.skillrary.com/");
		WebElement multilistbox = driver1.findElement(By.id("cars"));
		
		Select op1=new Select(multilistbox);
	    op1.selectByIndex(4);
	    Thread.sleep(1000);
		op1.selectByVisibleText("INR 50 - INR 99 ( 1 )");//give full text
	    Thread.sleep(1000);
		op1.selectByValue("399");//copy and paste ,value data in this
	    Thread.sleep(1000);//to see changes
		op1.deselectByIndex(1);
	    Thread.sleep(1000);
		op1.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
	    Thread.sleep(1000);
		op1.deselectByValue("399");
			
	}

}
