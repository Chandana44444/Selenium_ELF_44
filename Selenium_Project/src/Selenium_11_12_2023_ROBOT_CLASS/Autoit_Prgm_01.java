package Selenium_11_12_2023_ROBOT_CLASS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autoit_Prgm_01 
{
	public static void main(String[] args) throws IOException 
	{
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		driver.get("https://www.totaljobs.com/account/register");
		driver.findElement(By.id("ccmgt_explicit_accept")).click();
		driver.findElement(By.id("btnCVUpload")).click();
		driver.findElement(By.xpath("//label[text()='from this device']")).click();
		
		//Runtime.getRuntime().exec("./Auto_It_Scripts/Autoit_01.exe");
		Runtime.getRuntime().exec("./Auto_It_Scripts/Auto_it_prgm_01.exe");

	}

}
