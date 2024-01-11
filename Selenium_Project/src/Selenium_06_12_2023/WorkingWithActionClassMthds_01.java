package Selenium_06_12_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionClassMthds_01 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement ele1 = driver1.findElement(By.id("password"));
		int ele1_Size = ele1.getSize().getWidth();
        ele1.sendKeys("Demo123");
		Actions a1=new Actions(driver1);
		//a1.moveToElement(ele1,290,0).clickAndHold().perform();//mouse hover action
		a1.moveToElement(ele1,(ele1_Size/2),0).click().perform();//mouse hover action
//                         ref,x,y
		//end all action class methods with perform().
		//if any pop-ups,close it.
		
		//clickandhold-->longpress
		//movetoele-->rating,filter slider,pswrd
		//extension-->move>move(subtract).
	}

}
