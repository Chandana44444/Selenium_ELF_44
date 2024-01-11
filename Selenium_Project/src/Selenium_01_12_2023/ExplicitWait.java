package Selenium_01_12_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
	    driver1.manage().window().maximize();
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//S4
	    WebDriverWait explicitwait=new WebDriverWait(driver1,Duration.ofSeconds(20));
	    driver1.get("https://www.shoppersstack.com/");
	    driver1.findElement(By.xpath("//img[@alt=\"HP Envy x360 Ryzen 5 Hexa Core 5600U\"]")).click();
	    driver1.findElement(By.id("Check Delivery")).sendKeys("578686");
	    WebElement button = driver1.findElement(By.id("Check"));//ElementClickInterceptedException
	    explicitwait.until(ExpectedConditions.elementToBeClickable(button));
	    //explicitwait.until(ExpectedConditions.invisibilityOf(button));
	    //while(!button.isEnabled()){    }
		button.click();
	}

}
