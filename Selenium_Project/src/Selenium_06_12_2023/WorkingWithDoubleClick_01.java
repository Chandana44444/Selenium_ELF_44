package Selenium_06_12_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDoubleClick_01
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://demoapp.skillrary.com/product.php?product=testing");
		WebElement plus = driver1.findElement(By.id("add"));
		WebElement minus = driver1.findElement(By.id("minus"));

		Actions a1=new Actions(driver1);
		a1.doubleClick(plus).perform();
		a1.doubleClick(plus).perform();
		a1.doubleClick(minus).perform();
		
	}

}
