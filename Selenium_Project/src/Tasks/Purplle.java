package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Purplle
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver1.get("https://www.purplle.com/brand/maybelline");
		driver1.findElement(By.xpath("//div[contains(text(),'Maybelline New York Colossal Bold Eyeliner, Black, 3g')]")).click();
		driver1.findElement(By.linkText("Add To Cart")).click();

	}

}
