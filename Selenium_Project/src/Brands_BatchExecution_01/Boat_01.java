package Brands_BatchExecution_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Boat_01
{
	@Test
	public void boat()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.boat-lifestyle.com/");
		Reporter.log("From Boat",true);
		driver.quit();
	}
	//https://in.event.mi.com/in/
}
