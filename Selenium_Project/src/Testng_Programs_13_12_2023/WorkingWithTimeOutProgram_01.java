package Testng_Programs_13_12_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithTimeOutProgram_01 
{
	//if timeout is passed correct output else wrong output
	@Test(timeOut=2000)
	public void demo_web_shop()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("From Demo Web Shop",true);
		driver.quit();
	}	
}
