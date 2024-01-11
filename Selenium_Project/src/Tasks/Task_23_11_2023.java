//SKILLRARY->REGISTER->YES/NO(GROUP CODE)

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_23_11_2023 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.skillrary.com/user/register");
		Thread.sleep(2000);
		boolean before_Selecting_Yes = driver1.findElement(By.id("usertype_yes")).isSelected();
		System.out.println("Before Selecting Yes:"+ before_Selecting_Yes);
		boolean box_Displayed_Before_Click = driver1.findElement(By.id("groupcode")).isDisplayed();
		System.out.println("Group Box:"+box_Displayed_Before_Click);
		Thread.sleep(2000);
		driver1.findElement(By.id("usertype_yes")).click();
		boolean after_Selecting_Yes = driver1.findElement(By.id("usertype_yes")).isSelected();
		System.out.println("After Selecting Yes:"+ after_Selecting_Yes);
		boolean box_Displayed_After_Click = driver1.findElement(By.id("groupcode")).isDisplayed();
		System.out.println("Group Box:"+box_Displayed_After_Click);
		
	}
}
