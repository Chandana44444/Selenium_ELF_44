package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_28_05_12_23 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
		
		for(int i=1;i<=17;i++)
		{
			if(i%2==1)
			{
			WebElement parent = driver1.findElement(By.xpath("(//table)[1]//tbody//tr["+i+"]"));
			String val1 = parent.findElement(By.xpath("td[1]")).getText();;
			String val2 = parent.findElement(By.xpath("td[3]")).getText();
			System.out.print(val1+"-");
			System.out.println(val2);
			}
		}

	}

}
