//DEMO WEB SHOP => ERROR MSG(CORRECT EMAIL,WRONG PASSWORD)

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_15_29_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver1.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		WebElement Email = driver1.findElement(By.id("Email"));
		Email.clear();//best practise followed in industries
		WebElement password = driver1.findElement(By.id("Password"));
		password.clear();
		Thread.sleep(2000);
		Email.sendKeys("chandana.p.m.4444@gmail.com");
		password.sendKeys("6878");
		driver1.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		String errorMessage=driver1.findElement(By.className("message-error")).getText();
		System.out.println(errorMessage);
	}

}
