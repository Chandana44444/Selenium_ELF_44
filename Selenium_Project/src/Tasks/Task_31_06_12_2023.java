package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_31_06_12_2023 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver1.get("https://start.atlassian.com/");
//		//driver1.findElement(By.xpath("//div[@class=\"sc-bdVaJa kXHmcb\"])[3]")).click();
//		driver1.findElement(By.id("username")).sendKeys("chandana.p.m.4444@gmail.com");
//		driver1.findElement(By.id("login-submit")).click();
//		driver1.findElement(By.id("password")).sendKeys("CHANDUPOORNI612");
//		driver1.findElement(By.id("login-submit")).click();
		
		driver1.get("https://trello.com/login");//Preferred
		driver1.findElement(By.id("user")).sendKeys("chandana.p.m.4444@gmail.com");
		driver1.findElement(By.id("login")).click();
		//WebElement ele1 = driver1.findElement(By.id("password"));
		WebDriverWait explicitwait=new WebDriverWait(driver1,Duration.ofSeconds(20));
        explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver1.findElement(By.id("password")).sendKeys("CHANDUPOORNI612");
		driver1.findElement(By.id("login-submit")).click();
		
		//driver1.findElement(By.xpath("//div[@data-testid=\"start-product__TRELLO_TRELLO\"]")).click();
		driver1.findElement(By.xpath("//div[@title=\"Selenium_ELf_44\"]")).click();

		WebElement source_Ele = driver1.findElement(By.linkText("in Progress"));
		WebElement destiny_Ele = driver1.findElement(By.xpath("//h2[text()='Selenuim']/../../..//button[text()='Add a card']"));
        Actions a1=new Actions(driver1);
        a1.dragAndDrop(source_Ele, destiny_Ele).perform();
        
//  	WebElement ele2 = driver1.findElement(By.linkText("Completed"));
//       String data = driver1.findElement(By.xpath("//div[@data-testid=\"quick-card-editor-buttons\"]")).getText();
//       System.out.println(data);
              
	}
}
