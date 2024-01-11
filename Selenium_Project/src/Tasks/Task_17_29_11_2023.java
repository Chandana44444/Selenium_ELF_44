//DEMO WEB SHOP =>REGISTER

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_17_29_11_2023 
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
		driver1.findElement(By.id("LastName")).sendKeys("M");
		driver1.findElement(By.id("Email")).sendKeys("chandana.p.m.4444@gmail.com");
		driver1.findElement(By.id("Password")).sendKeys("Chandu121*");
		driver1.findElement(By.id("ConfirmPassword")).sendKeys("Chandu121*");
		driver1.findElement(By.id("register-button")).click();
		
	}

}
