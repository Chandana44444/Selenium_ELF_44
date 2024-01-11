package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver1.navigate().to("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		//WebElement parent = driver1.findElement(By.xpath("//h2[text()='Trend of Gold Rates in Bangalore']/../..//tbody"));
		
		for(int i=1;i<=6;i++)
		{
			WebElement parent = driver1.findElement(By.xpath("//h2[text()='Trend of Gold Rates in Bangalore']/../..//tbody"));
			String val1 = parent.findElement(By.xpath("tr["+i+"]//td[1]")).getText();
			String val2 = parent.findElement(By.xpath("tr["+i+"]//td[2]")).getText();
			System.out.println(val1+"-"+val2);
		}
		
	}

}
