package Tasks;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_25_01_12_2023 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver1=new ChromeDriver();
    driver1.manage().window().maximize();
    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//S4
    driver1.get("https://www.shoppersstack.com/");
    driver1.findElement(By.xpath("//span[text()='HP']")).click();
//    driver1.findElement(By.id("Check Delivery")).sendKeys("578686");
//    driver1.findElement(By.id("Check")).click();//ElementClickInterceptedException
    System.out.println(driver1.findElement(By.id("Check Delivery")).isDisplayed());

//    if(driver1.findElement(By.id("Check Delivery")).isDisplayed()==false)
//    {
//        driver1.findElement(By.id("Check Delivery")).sendKeys("578686");
//        driver1.findElement(By.id("Check")).submit();//ElementClickInterceptedException
//    }
		
	}

}
