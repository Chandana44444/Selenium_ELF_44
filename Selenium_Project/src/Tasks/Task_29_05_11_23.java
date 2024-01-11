package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_29_05_11_23 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		ChromeDriver driver1=new ChromeDriver();
//		driver1.manage().window().maximize();
//		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		
//		driver1.get("https://www.dream11.com/");
//		driver1.findElement(By.id("regEmail")).clear();
//		driver1.findElement(By.id("regEmail")).sendKeys("123446689");//not possible since is inside a frame
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver1.get("https://www.dream11.com/");
		driver1.switchTo().frame(0);
		driver1.findElement(By.id("regEmail")).clear();
		driver1.findElement(By.id("regEmail")).sendKeys("123446689");
		
	}

}
