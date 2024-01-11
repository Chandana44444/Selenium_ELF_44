//PURPLEE->ADD TO CART

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_24_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.purplle.com/");
		Thread.sleep(10000);
		//driver1.findElement(By.linkText("NEW ")).click();
		//Thread.sleep(2000);
		//driver1.findElement(By.xpath("//img[contains(@alt,'Buy Alps Goodness Fenugreek, Biotin & Redensyl')]")).findElement(By.partialLinkText("Add to Cart")).click();
//		driver1.findElement(By.linkText("SHOP CATEGORIES ")).click();
//		Thread.sleep(4000);
		driver1.findElement(By.partialLinkText("Add to Cart")).click();
		driver1.findElement(By.partialLinkText("Add to Cart")).click();
		driver1.findElement(By.partialLinkText("Add to Cart")).click();

	}

}
