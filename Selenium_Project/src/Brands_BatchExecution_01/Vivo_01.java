package Brands_BatchExecution_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Vivo_01
{
	@Test
	public void vivo()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.vivo.com/in/");
		Reporter.log("From Vivo",true);
		driver.quit();
	}
}
