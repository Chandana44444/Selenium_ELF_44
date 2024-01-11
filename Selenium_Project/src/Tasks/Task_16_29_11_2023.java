//VTIGER => ERROR MESSAGE

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_16_29_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userName = driver1.findElement(By.id("username"));
		userName.clear();
		WebElement passWord = driver1.findElement(By.id("password"));
		passWord.clear();
		Thread.sleep(1000);
		userName.sendKeys("Chandana");
		passWord.sendKeys("123");
		Thread.sleep(1000);
		//driver1.findElement(By.className("class=\"button buttonBlue\"")).click();//invalid selector type
		driver1.findElement(By.cssSelector("button[class=\"button buttonBlue\"]")).click();
		String errorMessage = driver1.findElement(By.id("validationMessage")).getText();
		System.out.println(errorMessage);
	}

}
