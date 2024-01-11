package Tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_30_05_12_2023
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://www.speedtest.net/");
		Thread.sleep(4000);
		WebElement frame1 = driver1.findElement(By.xpath("(//iframe)[4][@title='3rd party ad content']"));
		driver1.switchTo().frame(frame1);
		driver1.findElement(By.id("cbb")).click();
		
	}
}
