package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_27_04_12_23 
{
	public static void main(String[] args)
	{
		//h2[contains(text(),'Historical Gold Rates')]/../..//tbody//tr//td[1]
		//h2[contains(text(),'Historical Gold Rates')]/../..//tbody//tr//td[2]
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		for(int i=1;i<=10;i++)
		{
	    String val1 = driver1.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//tbody//tr["+i+"]/td[1]")).getText();
		String val2 = driver1.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//tbody//tr["+i+"]//td[2]")).getText();
		System.out.println(val1+"-"+val2);
		}
		
	}

}
