package Practice;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3
{
	public static void main(String[] args) 
	{
		System.setProperty("webdiver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		//c1.manage().window().maximize();
		c1.manage().window().fullscreen();//will give more than max size(Escape)
		//c1.manage().window().getPosition();
		c1.get("https://google.com");
		c1.switchTo().newWindow(WindowType.TAB);
		c1.navigate().to("https://google.com");
//		c1.switchTo().newWindow(WindowType.WINDOW);
//		c1.navigate().to("https://google.com");
		c1.close();//newwindow
		//c1.quit();
		
	}

}
