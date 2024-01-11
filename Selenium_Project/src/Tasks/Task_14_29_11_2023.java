//DEMO WEB SHOP => ERROR MSG(WRONG EMAIL-ID)

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_14_29_11_2023 
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
		Email.sendKeys("abcjoj");
		password.sendKeys("7687");
		driver1.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
//		String errorMsg = driver1.findElement(By.className("validation-summary-errors")).getText();
//		System.out.println(errorMsg);
		String errorMessage=driver1.findElement(By.className("field-validation-error")).getText();
		System.out.println(errorMessage);

		//String errorMessage=driver1.findElement(By.className("field-validation-error")).getCssValue(errorMessage);

	}

}
