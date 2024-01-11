//SKILLRARY LOGIN(PARTIAL=>ONLY SELECTED FIELDS)

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_9_28_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.skillrary.com/user/login");
		Thread.sleep(3000);
		driver1.findElement(By.name("email")).sendKeys("chandana.m@testyantra.in");
		driver1.findElement(By.name("password")).sendKeys("chandana@123");
		driver1.findElement(By.name("captcha")).sendKeys("chandana");

		

	}

}
