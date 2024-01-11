//DEMO WEB SHOP:-REGISTER > LOGIN > ADD PRODUCT > REMOVE
//change register mail-id before trying
//after clicking electronics module ,to go with phone,camera go with linktext.

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_13_29_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		//Register
		driver1.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver1.findElement(By.linkText("Register")).click();
		driver1.findElement(By.id("gender-female")).click();
		driver1.findElement(By.id("FirstName")).sendKeys("Chanadana");
		driver1.findElement(By.id("LastName")).sendKeys("P");
		driver1.findElement(By.id("Email")).sendKeys("chandana.12@gmail.com");
		driver1.findElement(By.id("Password")).sendKeys("Chandu121*");
		driver1.findElement(By.id("ConfirmPassword")).sendKeys("Chandu121*");
		driver1.findElement(By.id("register-button")).click();
		
		Thread.sleep(4000);
		
		//Logout//not working from here
		driver1.findElement(By.linkText("Log out")).click();
		
		Thread.sleep(3000);
		
		//Login
		driver1.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver1.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver1.findElement(By.id("Email")).sendKeys("chandana.44@gmail.com");
		Thread.sleep(3000);
		driver1.findElement(By.id("Password")).sendKeys("Chandu121*");
		Thread.sleep(3000);
		driver1.findElement(By.id("RememberMe")).click();
		Thread.sleep(3000);
		driver1.findElement(By.cssSelector("input[value='Log in']")).click();
		
		Thread.sleep(2000);
		
		//Add Product to Cart
		//driver1.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
		Thread.sleep(3000);
		driver1.findElement(By.linkText("Electronics")).click();
		Thread.sleep(3000);
		driver1.findElement(By.cssSelector("a[title=\"Show products in category Cell phones\"]")).click();
		Thread.sleep(1000);
		driver1.findElement(By.cssSelector("input[value=\"Add to cart\"]")).click();
		
		Thread.sleep(2000);
		
		//Remove
		driver1.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);
		//driver1.findElement(By.cssSelector("input[value='Go to cart']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("removefromcart")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("updatecart")).click();	

	}
}
