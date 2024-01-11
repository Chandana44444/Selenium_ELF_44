package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_26_04_12_23 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		WebElement table1 = driver1.findElement(By.xpath("(//table)[1]"));

		//WebElement rows = table1.findElement(By.xpath("(//table)[1]//tr[@class=\"bodyBase\"]"));
		for(int i=1;i<=4;i++)
		{
			WebElement rows = table1.findElement(By.xpath("tbody/tr["+i+"]"));
			System.out.print(rows.findElement(By.xpath("td[1]")).getText()+" - ");
			System.out.println(rows.findElement(By.xpath("td[2]/div/div")).getText());	
		}
	}

}
