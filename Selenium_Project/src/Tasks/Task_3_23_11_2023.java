//TO CHANGE DIMENSION OF "MULTIPLE POP-UP" WEBPAGE 

package Tasks;

import java.util.Set;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3_23_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		
		driver1.get("file:///C:/Users/Lenovo/Downloads/MultipleWindow.html");
		driver1.findElement(By.xpath("//input[@value='Open Food Sites']")).click();

		Set<String> ids=driver1.getWindowHandles();
		
        Point p1=new Point(100,200);
        Dimension d1=new Dimension(400,500);
        
//        Point p2=new Point(200,300);
//        Dimension d2=new Dimension(600,700);
//        
//        Point p3=new Point(100,200);
//        Dimension d3=new Dimension(800,900);
        
        //for(Position p:p1)
	
		for(String id:ids)
		{
			driver1.switchTo().window(id);
			driver1.manage().window().maximize();
			Thread.sleep(3000);
			driver1.manage().window().setPosition(p1);
			driver1.manage().window().setSize(d1);	
		}
		
		//driver1.close();
		
	}
}
