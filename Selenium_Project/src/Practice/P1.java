package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 
{
	public static void main(String[] args) throws  InterruptedException 
	{
		//URL ref=new URL("https:google.com");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.meesho.com/");
		System.out.println(driver1.manage().window().getSize());//will get both height and width
		System.out.println(driver1.manage().window().getSize().getHeight());//will get only height
//		System.out.println(driver1.manage().window().getSize().getWidth());
//		System.out.println(driver1.manage().window().getPosition().getX());
//		System.out.println(driver1.manage().window().getPosition().getX());
		//driver1.manage().window().setPosition(100,200);
		
//		Thread.sleep(2000);
//		Point targetPosition = new Point(100, 200);
//		driver1.manage().window().setPosition(targetPosition);
//		
//		Thread.sleep(2000);
//		int height=200;
//		int width=100;
//		Dimension d=new Dimension(height,width);
		//driver1.manage().window().setSize(d);
		//driver1.manage().window().setSize(d);


	}

}
