package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_19_30_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.skillrary.com/");
		Thread.sleep(2000);
		
		if(driver1.findElement(By.xpath("//body")).getText().contains("SPANISH"))
		{
			driver1.findElement(By.partialLinkText("SPANISH")).click();
			Thread.sleep(3000);
		    driver1.findElement(By.partialLinkText("ENGLISH")).click();
		}
		Thread.sleep(4000);
		
		driver1.findElement(By.linkText("SIGN IN")).click();
		Thread.sleep(2000);
		WebElement email = driver1.findElement(By.id("email"));
		email.clear();
		email.sendKeys("abc@gmail.com");
		String name=email.getAttribute("value");
		System.out.println(name);


	}

}
