//FACEBOOK->ALLIGNED/NOT

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_22_11_2023 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailid = driver1.findElement(By.id("email"));
		//WebElement password = driver1.findElement(By.id("pass"));//will get wrong answer
		WebElement password = driver1.findElement(By.id("passContainer"));

		Point email_X = emailid.getLocation();
		Point pass_X = password.getLocation();
//		System.out.println(email_X);
//		System.out.println(pass_X);
//		
//		if(email_X.getX()==pass_X.getX())
//		{
//			System.out.println("X:Aligned properly");
//		}
//		else
//		{
//			System.out.println("X:Not alligned properly");
//		}
//		
		
		Dimension emailBoxSize = emailid.getSize();
		Dimension passBoxSize = password.getSize();
		
		int emailWidth = emailBoxSize.getWidth();
		int passwordWidth = passBoxSize.getWidth();
		
//		int res1 = emailWidth+email_X.getX();
//		int res2= passwordWidth+pass_X.getX();
	
		if(emailWidth+email_X.getX()==passwordWidth+pass_X.getX())
		{
			System.out.println("Aligned Properly");
		}
		else
		{
			System.out.println("Not Aligned Properly");
		}
				
	}
}
