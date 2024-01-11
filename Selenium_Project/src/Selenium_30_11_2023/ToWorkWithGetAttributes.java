package Selenium_30_11_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithGetAttributes
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome,driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		//Kalki
		driver1.get("https://www.kalkifashion.com/");
		Thread.sleep(8000);
		WebElement search = driver1.findElement(By.xpath("//div[text()='Search for Style, Collections & more']"));
		Thread.sleep(2000);
       //search.clear();
        search.sendKeys("clothes");
        String data = search.getAttribute("value");
        System.out.println(data);
		
//		String alt_text = driver1.findElement(By.cssSelector("img[title='Pre-Pleated Sarees']")).getAttribute("alttext");
//	    System.out.println(alt_text);//since no alt-text for that image
	    
	   
		
	}

}
