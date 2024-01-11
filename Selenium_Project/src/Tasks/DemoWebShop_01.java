package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_01 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver1.get("https://demowebshop.tricentis.com/");
		driver1.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../../..//input[@value='Add to cart']")).click();
		driver1.findElement(By.xpath("//a[text()='Build your own cheap computer']/../../..//input[@value='Add to cart']")).click();
		driver1.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver1.findElement(By.id("product_attribute_75_5_31_96")).click();
		driver1.navigate().to("https://demowebshop.tricentis.com/");
		driver1.findElement(By.xpath("//a[text()='Simple Computer']/../../..//input[@value='Add to cart']")).click();
		driver1.findElement(By.xpath("//input[@data-productid=\"75\"]")).click();

	}

}
