//

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_24_11_2024_DemoShop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver1.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
		driver1.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
	
	}

}
