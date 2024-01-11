package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 
{
	public static void main(String[] args)
	{
		System.setProperty("weddriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
//		System.out.println(driver1.manage().window().getPosition());
//		System.out.println(driver1.manage().window().getSize());
		driver1.get("https://google.com");
		
		Dimension d1=new Dimension(500,708);
		Point p1=new Point(10,10);
		
		//Dimension d2=new Dimension(500,708);
		//Point p2=new Point(10,10);
		
		driver1.manage().window().setPosition(p1);
		driver1.manage().window().setSize(d1);
		
		driver1.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://google.com");
		
//		driver1.manage().window().setPosition(p2);
//		driver1.manage().window().setSize(d2);
		
		driver1.navigate().back();

//		String id = driver1.getWindowHandle();
//		driver1.switchTo().window(id);
		//driver1.manage().window().minimize();
		driver1.close();
		
		
	}

}
