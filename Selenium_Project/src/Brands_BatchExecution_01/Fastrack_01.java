package Brands_BatchExecution_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Fastrack_01
{
	@Test
	public void fastrack()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fastrack.in/");
		Reporter.log("From Fastrack",true);
		driver.quit();
	}
	
//https://www.boat-lifestyle.com/
}
