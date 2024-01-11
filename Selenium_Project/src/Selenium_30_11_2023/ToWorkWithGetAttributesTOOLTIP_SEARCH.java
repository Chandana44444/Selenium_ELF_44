//TOOL_TIP(TITLE) AND SEARCH(VALUE)

package Selenium_30_11_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetAttributesTOOLTIP_SEARCH
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
	    //Wooden street->tool tip
		driver1.get("https://www.woodenstreet.com/");
		Thread.sleep(9000);
		WebElement data1 = driver1.findElement(By.cssSelector("img[alt='Home Decor Items ']"));
		//data1.click();//no need of clicking
		System.out.println(data1.getAttribute("title"));
		
		ChromeDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		
		driver2.switchTo().newWindow(WindowType.TAB);
		
		driver2.get("https://www.woodenstreet.com/");
		Thread.sleep(9000);		
		WebElement searchBox = driver2.findElement(By.id("search-user"));
		Thread.sleep(1000);
		searchBox.clear();
		System.out.println(searchBox.getAttribute("value"));//empty
		Thread.sleep(2000);
		searchBox.sendKeys("abcde");
		//System.out.println(searchBox.getAttribute("placeholder value"));//no space allowed for attribute name
		System.out.println(searchBox.getAttribute("value"));//abcde
	
	}
}
