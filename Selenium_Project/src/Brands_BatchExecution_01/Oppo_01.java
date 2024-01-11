package Brands_BatchExecution_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Oppo_01
{
	
	public void oppo()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com/in/");
		Reporter.log("From Oppo",true);
		driver.quit();
	}
}
