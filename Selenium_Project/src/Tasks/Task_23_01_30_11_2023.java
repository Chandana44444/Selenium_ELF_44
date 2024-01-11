//SKILLRARY->REGISTER->YES/NO(GROUP CODE)

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_23_01_30_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.skillrary.com/user/register");
		Thread.sleep(2000);
		WebElement no_Value = driver1.findElement(By.id("usertype_no"));
		WebElement yes_Value = driver1.findElement(By.id("usertype_yes"));
		WebElement group_Value = driver1.findElement(By.id("groupcode"));
		
		if(no_Value.isEnabled())
		{
			System.out.println("Before Click: "+group_Value.isDisplayed());
			yes_Value.click();
			System.out.println("After Click: "+group_Value.isDisplayed());
		}
		
		System.out.println();
		
		System.out.println(driver1.findElement(By.tagName("div")).getText());
		//if not present null
		//if head will give you ntg bcoz can work only on DOM/Body part.
		

		
	}

}
