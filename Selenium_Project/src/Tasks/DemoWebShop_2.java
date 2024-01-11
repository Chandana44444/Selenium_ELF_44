package Tasks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://demowebshop.tricentis.com/apparel-shoes");
		driver1.findElement(By.xpath("//a[text()=\"50's Rockabilly Polka Dot Top JR Plus Size\"]/../../..//input[@value=\"Add to cart\"]")).click();
		driver1.findElement(By.id("add-to-cart-button-5")).click();
		driver1.navigate().to("https://demowebshop.tricentis.com/apparel-shoes");
		driver1.findElement(By.xpath("(//a[text()='Casual Golf Belt'])/../../..//input[@value=\"Add to cart\"]")).click();
		driver1.navigate().to("https://demowebshop.tricentis.com/apparel-shoes");
		driver1.findElement(By.xpath("//a[text()='Blue and green Sneaker']/../../..//input[@value=\"Add to cart\"]")).click();
		driver1.findElement(By.xpath("//input[@data-productid=\"28\"]")).click();
//		driver1.navigate().to("https://demowebshop.tricentis.com/apparel-shoes");
//		driver1.findElement(By.xpath("(//a[text()=\"Blue Jeans\"])[2]/../../..//input[@value=\"Add to cart\"]")).click();

		driver1.navigate().to("https://demowebshop.tricentis.com/cart");
		String prdt1 = driver1.findElement(By.xpath("//span[@class=\"product-unit-price\"]")).getText();
		driver1.navigate().to("https://demowebshop.tricentis.com/apparel-shoes");
		String prdt2 = driver1.findElement(By.xpath("(//span[@class='price actual-price'])[4]")).getText();
		driver1.navigate().to("https://demowebshop.tricentis.com/cart");
		String prdt3 = driver1.findElement(By.xpath("//span[@class=\"product-unit-price\"]")).getText();
		//String prdt4 = driver1.findElement(By.xpath("//span[@class=\"product-unit-price\"]")).getText();

		Double value1 =Double.parseDouble(prdt1);
		Double value2=Double.parseDouble(prdt2);
		Double value3=Double.parseDouble(prdt3);
		//Double value4=Double.parseDouble(prdt3);

		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(value1);
		a1.add(value2);
		a1.add(value3);
		Collections.sort(a1);
		System.out.println(a1);
		
		driver1.findElement(By.xpath("//span[contains(text(),'"+a1.get(0)+"')]/../..//input[@name='removefromcart']")).click();
		driver1.findElement(By.name("updatecart")).click();	
	}

}
