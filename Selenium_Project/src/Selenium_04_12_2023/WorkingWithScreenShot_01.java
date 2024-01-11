package Selenium_04_12_2023;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenShot_01 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver1.get("https://www.purplle.com/brand/maybelline");
		File source = driver1.getScreenshotAs(OutputType.FILE);
		
		File destiny=new File("./ScreenShots/purplle2.jpg");
		//FileHandler.copyResource(source,destiny);
		FileHandler.copy(source, destiny);
		
		//.png
		//jpeg,jpg--->system editor
		//FileUtils(jars,download)-FileIOS
		

	}

}
