package Selenium_11_12_2023_ROBOT_CLASS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EaseMyTrip_Prgm_01 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions settings=new ChromeOptions();
		//settings.addArguments("--disable-notifications");//to avoid notification
		//settings.addArguments("--incognito");//to open in incognito mode
		
		ChromeDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		driver.get("https://www.easemytrip.com/");
//		Thread.sleep(4000);
//		Robot ref1=new Robot();
//		ref1.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		ref1.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		ref1.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		ref1.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		ref1.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		ref1.keyRelease(KeyEvent.VK_ENTER);

//tab and toggle to as much as option choice u want and to click write enter.
		//Robot class->handle

	

	}

}
