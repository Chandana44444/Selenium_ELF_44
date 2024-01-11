package Scripts_01;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseScript {
	@BeforeSuite
	public void beforesuite()
	{
		Reporter.log("From BeforeSuite",true);
	}
	@BeforeTest
	public void beforetest()
	{
		Reporter.log("From BeforeTest",true);
	}
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("From BeforeClass",true);
	}
	@BeforeMethod
	public void beforemethod()
	{
		Reporter.log("From BeforeMethod",true);
	}
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("From AfterMethod",true);
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("From AfterClass",true);
	}
	@AfterTest
	public void aftertest()
	{
		Reporter.log("From AfterTest",true);
	}
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("From AfterSuite",true);
	}


}
