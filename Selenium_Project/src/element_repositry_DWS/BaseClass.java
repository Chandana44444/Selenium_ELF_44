package element_repositry_DWS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	WebDriverWait explicitwait=null;
	@BeforeClass
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void login()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		explicitwait=new WebDriverWait(driver,Duration.ofSeconds(8));
		driver.get("https://demowebshop.tricentis.com/");
	}
}
