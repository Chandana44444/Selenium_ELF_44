package Testng_Programs_13_12_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHelperAttributes_01 
{
	final int p_count=-1;
	final int invoc_Count=3;
	@Test(priority=1,enabled=false)
	public void meesho()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Reporter.log("From meesho",true);
		driver.quit();
	}
	
	@Test(timeOut =2000)
	public void purplle()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/");
		Reporter.log("From purplle",true);
		driver.quit();
	}

	@Test(priority=1,invocationCount=4,enabled=false)
	public void nykaa()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		Reporter.log("From nykaa",true);
		driver.quit();
	}
	
	//@Test(priority=1,invocationCount=3,threadPoolSize=-1)
	public void Method1()
	{
		Reporter.log("From Method-1",true);
	}



}
