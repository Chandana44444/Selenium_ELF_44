package TestNG_14_12_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Car_Brand_01 
{
	//@Test(groups="Regression",dependsOnGroups="Regression")//Cyclic dependency
	@Test(groups="System",dependsOnGroups="Regression")//non Cyclic dependency
	public void BMW()
	{
		//int divide=10/0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw-bavariamotors.in/");
		Reporter.log("From BMW",true);
		driver.quit();
	}
	//dependsongroup-->project level
}
