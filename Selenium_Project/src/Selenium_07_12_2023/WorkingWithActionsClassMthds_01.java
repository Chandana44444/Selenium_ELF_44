package Selenium_07_12_2023;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionsClassMthds_01 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://parivahan.gov.in/parivahan/");
		List<WebElement> all_nav_ele = driver1.findElements(By.xpath("//li[@data-type=\"menu_item\" and @data-level=\"1\"]"));
	
		Actions a1=new Actions(driver1);
		
		for(WebElement nav_ele:all_nav_ele)
		{
//			a1.keyDown(Keys.SHIFT).perform();//shift+click>new window
//			nav_ele.click();
//			a1.keyUp(Keys.SHIFT).perform();
			
			a1.keyDown(Keys.CONTROL).perform();//control+click>new tab
			nav_ele.click();
			a1.keyUp(Keys.CONTROL).perform();
		}
		
		Set<String> ids = driver1.getWindowHandles();
		for(String id:ids)
		{
		driver1.switchTo().window(id);
		if(driver1.getTitle().contains("Site map"))
		{
			driver1.close();
		}
		}

	}
}

