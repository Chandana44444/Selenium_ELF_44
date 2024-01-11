package DataProvider_18_12_23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_02_urls {
	@DataProvider
	public String[] diff_urls()
	{
		String[] arr= {"https://demowebshop.tricentis.com/",
				       "https://www.kalkifashion.com/",
				       "https://www.skillrary.com/"
		              };
		return arr;			       
	}
	
	@Test(dataProvider = "diff_urls")
	public void launchBrowsers(String apps_to_be_launched) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get(apps_to_be_launched);
		
		}

}
