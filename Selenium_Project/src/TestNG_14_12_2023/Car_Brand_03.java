package TestNG_14_12_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Car_Brand_03 
{
	@Test(groups={"Smoke","Regression"},timeOut=80000)
	public void BENZ()
	{
		//int divide=10/0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercedes-benz.co.in/");
		Reporter.log("From BENZ",true);
		driver.quit();
	}
	
}
