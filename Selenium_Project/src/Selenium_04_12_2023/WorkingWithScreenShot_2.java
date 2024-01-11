package Selenium_04_12_2023;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenShot_2 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver1.get("https://www.purplle.com/brand/maybelline");
		File source1 =driver1.findElement(By.xpath("//img[@alt=\"purplle logo\"]")).getScreenshotAs(OutputType.FILE);
		String source2=driver1.findElement(By.xpath("//img[@alt='purplle logo'])[2]")).getScreenshotAs(OutputType.BASE64);
		byte[] source3=driver1.findElement(By.xpath("//img[@alt='purplle logo'])[2]")).getScreenshotAs(OutputType.BYTES);
        //FileOutputStream fos1=new FileOutputStream();
		File destiny=new File("./ScreenShots/purplle1.png");
		//FileHandler.copyResource(source,destiny);
		//FileHandler.copy(source, destiny);
		

	}

}
