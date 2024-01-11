//SBI

package Tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_12_28_29_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(3000);
		driver1.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(4000);
		driver1.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		Thread.sleep(3000);
		
		Set<String> windowsId = driver1.getWindowHandles();
		Thread.sleep(4000);
		
		for(String s:windowsId)
		{
			driver1.switchTo().window(s);
			Thread.sleep(3000);
			if(driver1.getCurrentUrl().contains("https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0"))
			{
				driver1.findElement(By.name("nextStep")).click();
			}
		}
		Thread.sleep(3000);
//		driver1.switchTo().newWindow(WindowType.WINDOW);
//		driver1.get("https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0");
//	    Thread.sleep(3000);
//		driver1.findElement(By.name("nextStep")).click();
//		Thread.sleep(3000);
		driver1.findElement(By.name("userName")).sendKeys("Chandana");
		driver1.findElement(By.name("accountNo")).sendKeys("ACNO_12345678");
		driver1.findElement(By.name("mobileNo")).sendKeys("9876543210");
		driver1.findElement(By.name("dob")).sendKeys("06/12/1977");
		driver1.findElement(By.name("captchaValue")).sendKeys("8291D");
		Thread.sleep(2000);
		driver1.findElement(By.name("Submit")).click();

	}
}
