package Tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTask 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("file:///C:/Users/Lenovo/Downloads/MultipleWindow.html");
		System.out.println(driver1.manage().window().getPosition().getX());
		System.out.println(driver1.manage().window().getPosition().getY());

		driver1.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Set<String> windowsId = driver1.getWindowHandles();
		for(String id:windowsId)
		{
			driver1.manage().window().maximize();
			System.out.println(driver1.manage().window().getSize());
		}
		
//		Dimension d=new Dimension(345,186);
//		driver1.manage().window().setSize(d);
//		
		
//		driver1.get("file:///C:/Users/Lenovo/Downloads/MultipleWindow.html");
//		driver1.manage().window().setSize(d);
//		driver1.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
//		Set<String> windowsId1 = driver1.getWindowHandles();
//		for(String id:windowsId1)
//		{
////			driver1.manage().window().maximize();
////			driver1.manage().window().setSize(d);
//			driver1.manage().window().getPosition().getX();
//			driver1.manage().window().getPosition().getY();
//
//		}
		
		
	}

}
