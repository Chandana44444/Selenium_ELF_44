package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsDemo1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		driver1.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		WebElement email = driver1.findElement(By.id("Email"));
		email.clear();
		WebElement pass = driver1.findElement(By.id("Password"));
		pass.clear();
		Thread.sleep(1000);
		email.sendKeys("chandana.p.m.4444@gmail.com");
		pass.sendKeys("Chandu121*");
		driver1.findElement(By.id("RememberMe")).click();
		driver1.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
		
		String texts = driver1.findElement(By.xpath("//div[@class='block block-category-navigation']")).getText();
		System.out.println(texts);
		
		System.out.println();
		System.out.println();

		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
		System.out.println(driver1.findElement(By.xpath("//div[@class=\"validation-summary-errors\"]")).getText());
		
		System.out.println();
		System.out.println();

		System.out.println(driver1.findElement(By.id("Email")).getSize().getHeight());
		System.out.println(driver1.findElement(By.id("Email")).getSize().getWidth());
		System.out.println(driver1.findElement(By.id("Email")).getLocation().getX());
		System.out.println(driver1.findElement(By.id("Email")).getLocation().getY());

		System.out.println();

		System.out.println(driver1.findElement(By.id("Password")).getSize().getHeight());
		System.out.println(driver1.findElement(By.id("Password")).getSize().getWidth());
		System.out.println(driver1.findElement(By.id("Password")).getLocation().getX());
		System.out.println(driver1.findElement(By.id("Password")).getLocation().getY());
		
		System.out.println();

		Rectangle d1 = driver1.findElement(By.id("Email")).getRect();
		Rectangle d2=driver1.findElement(By.id("Password")).getRect();
		System.out.println(d1);
        System.out.println(d2);
	}
}
