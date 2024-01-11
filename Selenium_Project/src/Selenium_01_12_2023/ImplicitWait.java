package Selenium_01_12_2023;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
        driver1.manage().window().maximize();
        //driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//S3
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//S4
        driver1.get("https://www.shoppersstack.com/");
        driver1.findElement(By.id("loginBtn")).click();
	}

}
