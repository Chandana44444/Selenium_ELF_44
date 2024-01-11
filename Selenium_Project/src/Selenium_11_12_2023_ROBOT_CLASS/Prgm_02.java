package Selenium_11_12_2023_ROBOT_CLASS;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Prgm_02 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","./drivers/geckodriver.exe");
		
		FirefoxOptions settings=new FirefoxOptions();//browser version mismatch
		settings.setCapability("dom.webnotifications.enabled", true);//to avoid popup
		//settings.addArguments("--disable-notifications");//to avoid notification
		//settings.addArguments("--incognito");//to open in incognito mode
		
		FirefoxDriver driver=new FirefoxDriver(settings);
		//ChromeDriver driver=new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		driver.get("https://www.easemytrip.com/");
		//Thread.sleep(4000);

		
	}
}
