//SKILLRARY > SPANISH > ENGLISH > LOGIN
//NOT WORKING

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_11_28_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.skillrary.com/");
		Thread.sleep(20000);
//		WebElement v1 = driver1.findElement(By.partialLinkText("SPANISH"));
//		v1.click();
//		Thread.sleep(3000);
		//if(v1==driver1.findElement(By.partialLinkText("SPANISH")))
		if(driver1.findElement(By.xpath("//body")).getText().contains("SPANISH"))
		{
			driver1.findElement(By.partialLinkText("SPANISH")).click();
			Thread.sleep(3000);
		    driver1.findElement(By.partialLinkText("ENGLISH")).click();
		}
		Thread.sleep(4000);
		driver1.findElement(By.linkText("SIGN IN")).click();
		driver1.findElement(By.id("email")).sendKeys("chandana.p.m.4444@gmail.com");
		driver1.findElement(By.name("password")).sendKeys("Chandu121*");
		driver1.findElement(By.id("usertype_yes")).click();
		driver1.findElement(By.id("groupcode")).sendKeys("TYSS123");
		driver1.findElement(By.name("remember")).click();
		
}
}
