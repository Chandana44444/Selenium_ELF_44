package Testng_Programs_13_12_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MutipleDependencyProgram_01 
{
	@Test(priority=1)
	public void open_acc()
	{
		int divide=10/0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/");
		Reporter.log("From Account Created",true);
		driver.quit();
	}
	
	@Test(priority=5)
	public void delete_acc()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Reporter.log("From Account Deleted",true);
		driver.quit();
	}
	
	@Test(priority=2,dependsOnMethods="open_acc")
	public void update_mobile_no()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		Reporter.log("From Update Mobile number",true);
		driver.quit();
	}
	
	@Test(priority=3,dependsOnMethods={"open_acc","update_mobile_no"})
	public void add_beneficiary()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		Reporter.log("From Add Beneficiary",true);
		driver.quit();
	}
	
	@Test(priority=4,timeOut=4000)
	public void transfer_amt()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("From Transfer Amount",true);
		driver.quit();
	}			

}
