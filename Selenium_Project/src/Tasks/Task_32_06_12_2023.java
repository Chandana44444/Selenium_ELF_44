package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_32_06_12_2023 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://www.paiinternational.in/shop/categories/television-audio/");
		WebElement ele1 = driver1.findElement(By.xpath("//span[@class=\"irs-slider from\"]"));
		WebElement ele2 = driver1.findElement(By.xpath("//span[@class=\"irs-slider to\"]"));

		Actions a1=new Actions(driver1);
		//a1.dragAndDropBy(ele1, 10, 0).perform();
		//a1.dragAndDropBy(ele2, -10, 0).perform();
		
		a1.clickAndHold(ele1).moveByOffset(20, 0).release().perform();
        a1.moveToElement(ele2).clickAndHold().moveByOffset(-30, 0).release().perform();

	}

}
