//TO NAVIGATE TO ALL SUB WEBPAGES OF "MULTIPLE POP-UP" WEBPAGE AND CLOSE "ALL SUB WEBPAGES"
//RETAIN PARENT ONLY

package Tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_6_23_11_2023 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		//driver1.manage().window().maximize();
		driver1.get("file:///C:/Users/Lenovo/Downloads/MultipleWindow.html");
		driver1.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		String Parentid = driver1.getWindowHandle();
		Set<String> ids=driver1.getWindowHandles();
		ids.remove(Parentid);
		for(String id:ids)
		{
			driver1.switchTo().window(id);
			//driver1.manage().window().maximize();
//			if(!driver1.getTitle().contains("Multiple popups"))//contains() or equals() or geturl()
//			{
//				driver1.close();
//			}
			driver1.close();
		}
	}
}
