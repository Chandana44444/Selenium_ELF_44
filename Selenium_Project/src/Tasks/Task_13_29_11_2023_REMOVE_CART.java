//DEMO WEB SHOP =>PRODUCT ADDING AND REMOVING

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_13_29_11_2023_REMOVE_CART 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
//		
//		//Register
//		driver1.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		driver1.findElement(By.linkText("Register")).click();
//		driver1.findElement(By.id("gender-female")).click();
//		driver1.findElement(By.id("FirstName")).sendKeys("Chanadana");
//		driver1.findElement(By.id("LastName")).sendKeys("M");
//		driver1.findElement(By.id("Email")).sendKeys("chandana.p.m.4444@gmail.com");
//		driver1.findElement(By.id("Password")).sendKeys("Chandu121*");
//		driver1.findElement(By.id("ConfirmPassword")).sendKeys("Chandu121*");
//		driver1.findElement(By.id("register-button")).click();
//		
//		Thread.sleep(2000);
//		
//		//Logout
//		driver1.findElement(By.linkText("Log out")).click();
//		
//		Thread.sleep(2000);
//		
		//Login
		driver1.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver1.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("Email")).sendKeys("chandana.p.m.4444@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.id("Password")).sendKeys("Chandu121*");
		Thread.sleep(2000);
		driver1.findElement(By.id("RememberMe")).click();
		driver1.findElement(By.cssSelector("input[value='Log in']")).click();
		
		Thread.sleep(2000);
		
		//Add Product to Cart
		//driver1.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
		driver1.findElement(By.linkText("Electronics")).click();
		driver1.findElement(By.cssSelector("a[title=\"Show products in category Cell phones\"]")).click();
		driver1.findElement(By.cssSelector("input[value=\"Add to cart\"]")).click();
		
		Thread.sleep(2000);
		
		//Remove
		driver1.findElement(By.linkText("Shopping cart")).click();
		//driver1.findElement(By.cssSelector("input[value='Go to cart']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("removefromcart")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("updatecart")).click();	

	}

}
