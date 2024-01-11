package Selenium_Basics;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigation
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.meesho.com/");
		driver1.get("https://google.co.in");
		driver1.navigate().to("https://www.flipkart.com/");
//		driver1.navigate().to("https://www.flipkart.com/");
//		driver1.navigate().to("https://www.flipkart.com/");
		
		//Thread.sleep(4000);
		Navigation driver2=driver1.navigate();
		driver2.back();//google
		//Thread.sleep(2000);
		driver2.back();//meesho
		//Thread.sleep(2000);
		driver2.forward();//google
		//Thread.sleep(2000);
		driver2.refresh();//refreshes current focusing webpage i.e google.
		
	}
}
