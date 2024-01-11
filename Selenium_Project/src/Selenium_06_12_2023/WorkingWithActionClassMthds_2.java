package Selenium_06_12_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionClassMthds_2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://demowebshop.tricentis.com/");
		WebElement ele1 = driver1.findElement(By.partialLinkText("COMPUTERS"));

		Actions a1=new Actions(driver1);
		a1.moveToElement(ele1).perform();//mouse hover action
		//a1.contextClick(ele1).perform();//right click(to prove that cursor is placed exactly at center)
		driver1.findElement(By.linkText("Desktops")).click();
		
		//end all action class methods with perform().
		//if any pop-ups,close it.
	}

}
