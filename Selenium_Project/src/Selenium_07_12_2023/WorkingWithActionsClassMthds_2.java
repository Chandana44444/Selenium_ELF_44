package Selenium_07_12_2023;

import java.awt.Scrollbar;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class WorkingWithActionsClassMthds_2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://www.naukri.com/");
		WebElement ele1 = driver1.findElement(By.xpath("//span[text()=\"Resume writing\"]"));
//		ele1.click();
		
		Actions a1=new Actions(driver1);
//		a1.scrollByAmount(0,2900).perform();
//		a1.click(ele1).perform();
		ScrollOrigin s1=ScrollOrigin.fromElement(ele1);
		a1.scrollFromOrigin(s1, 0, 200).click().perform();
		
	}
}

