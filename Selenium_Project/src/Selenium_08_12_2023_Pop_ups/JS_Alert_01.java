package Selenium_08_12_2023_Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Alert_01 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.id("small-searchterms")).click();//alert appears//not on search textbox
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();//on search button
		//Thread.sleep(2000);
		Alert a=driver.switchTo().alert();//so catch create alert ref
		Thread.sleep(2000);//if not present(Noalertexception)
		System.out.println(a.getText());//with ref access mthds of Alert interface
		a.accept();//click on ok
		//a.dismiss();//click on ok(Only one button)

	}

}
