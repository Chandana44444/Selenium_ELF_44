//TO CHANGE DIMENSION OF "MULTIPLE POP-UP" WEBPAGE AND CLOSE "CADBURY" WEBPAGE
//CHECK

package Tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_5_23_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		//driver1.manage().window().maximize();
		driver1.get("file:///C:/Users/Lenovo/Downloads/MultipleWindow.html");
		driver1.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> ids=driver1.getWindowHandles();
		for(String id:ids)
		{
			driver1.switchTo().window(id);
			//driver1.manage().window().maximize();
			if(driver1.getTitle().contains("Cadbury Chocolate"))//contains() or equals() or geturl()
			{
				driver1.close();
				break;//efficiency
			}
		}


	}

}
