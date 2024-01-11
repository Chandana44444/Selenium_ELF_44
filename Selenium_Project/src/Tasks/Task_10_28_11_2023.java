//MAYBELINE > NYKAA > MEN'S > CARRERS , CLOSE MAYBELINE

package Tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_10_28_11_2023
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.maybelline.com/");
		String parentId=driver1.getWindowHandle();
		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://www.nykaafashion.com/");
		Thread.sleep(5000);
		driver1.findElement(By.partialLinkText("Men")).click();
		Thread.sleep(6000);
		//driver1.findElement(By.linkText("Careers")).click();
	    Set<String> s1 = driver1.getWindowHandles();
		for(String s:s1)
		{
			driver1.switchTo().window(s);
			//if(driver1.getCurrentUrl().equals("https://www.nykaafashion.com/men/c/6823?root=topnav_1"))
			if(driver1.getTitle().contains("Buy "))
			{
				//Thread.sleep(2000);
				driver1.findElement(By.partialLinkText("Careers")).click();
				break;
			}
		}
		driver1.switchTo().window(parentId).close();
			
	}

}
