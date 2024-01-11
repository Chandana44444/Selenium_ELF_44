//SHOPPERS STACK REGISTRATION

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_8_28_29_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		driver1.findElement(By.id("loginBtn")).click();
		//Thread.sleep(2000);
		driver1.findElement(By.id("Create Account")).click();
		//Thread.sleep(2000);
		driver1.findElement(By.id("First Name")).sendKeys("Chandana");
		//Thread.sleep(2000);
		driver1.findElement(By.id("Last Name")).sendKeys("Manjesh");
		//Thread.sleep(2000);
		driver1.findElement(By.id("Female")).click();
		//Thread.sleep(2000);
		driver1.findElement(By.id("Phone Number")).sendKeys("9663702812");
		driver1.findElement(By.id("Email Address")).sendKeys("chandana.p.m.4444@gmail.com");
		driver1.findElement(By.id("Password")).sendKeys("Chandu121*");
		driver1.findElement(By.id("Confirm Password")).sendKeys("Chandu121*");
		driver1.findElement(By.id("Terms and Conditions")).click();
		driver1.findElement(By.id("btnDisabled")).click();

	}
}
