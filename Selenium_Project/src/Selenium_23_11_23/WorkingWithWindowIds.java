package Selenium_23_11_23;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowIds
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("file:///C:/Users/Lenovo/Downloads/MultipleWindow.html");
		driver1.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
        Thread.sleep(2000);
        Set<String> windowsId=driver1.getWindowHandles();
        
        for(String ids:windowsId)
        {
        	driver1.switchTo().window(ids);
        	System.out.println(driver1.getTitle());
        }
        
        driver1.close();
       // driver1.quit();
        
        driver1.switchTo().newWindow(WindowType.TAB);
        driver1.switchTo().newWindow(WindowType.WINDOW);
        
	}

}
