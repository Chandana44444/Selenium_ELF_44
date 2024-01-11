package Selenium_Assessment_01;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Program_01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.linkText("Forgot Username / Login Password")).click();
		
		Set<String> allwindowsid = driver.getWindowHandles();
		for(String id:allwindowsid)
		{
		driver.switchTo().window(id);
		if(driver.getTitle().contains("troublelogin"))
		{
			int height = driver.manage().window().getSize().getHeight();
			int width = driver.manage().window().getSize().getWidth();
			Dimension d=new Dimension(100,100);
			driver.manage().window().setSize(d);	
		}
		}
		
		driver.findElement(By.id("nextStep")).click();
		
		WebElement usernamebox = driver.findElement(By.id("userName"));
		WebElement submitbutton = driver.findElement(By.id("go"));
		submitbutton.click();
		
		Alert a1=driver.switchTo().alert();//name
		Thread.sleep(2000);
		System.out.println("invalid username:"+a1.getText());
		a1.accept();
		
		usernamebox.sendKeys("Chandana");//valid		
		submitbutton.click();
		
		Alert a2=driver.switchTo().alert();//name
		Thread.sleep(2000);
		System.out.println("invalid acc_no:"+a2.getText());
		a2.accept();
		
		WebElement accnobutton = driver.findElement(By.id("accountNo"));
		accnobutton.sendKeys("12345678901");//valid
		//accnobutton.sendKeys(" ");//invalid
		submitbutton.click();
		
		Alert a3=driver.switchTo().alert();//name
		Thread.sleep(2000);
		System.out.println("invalid mobile_no:"+a3.getText());
		a3.accept();
	
		WebElement countrybutton = driver.findElement(By.id("selCountry"));
		countrybutton.click();
		countrybutton.sendKeys("india");
		
		WebElement mobile_no = driver.findElement(By.id("mobileNo"));
		mobile_no.sendKeys("1234567890");//valid
		//mobile_no.sendKeys("123456789");//invalid
		submitbutton.click();
		Alert a4=driver.switchTo().alert();//name
		Thread.sleep(2000);
		System.out.println("invalid DOB:"+a4.getText());
		a4.accept();
	
		WebElement DOB = driver.findElement(By.id("datepicker5"));
		//DOB.sendKeys("01/01/2001");//valid
		//DOB.sendKeys("56/01/2001");//invalid date
		//DOB.sendKeys("01/122/2001");//invalid month
		//DOB.sendKeys("01/01/2090");//invalid year
		
		usernamebox.clear();
		accnobutton.clear();
		mobile_no.clear();
		DOB.clear();
		usernamebox.sendKeys("chandana");
		accnobutton.sendKeys("1234567890");
		mobile_no.sendKeys("123456789");
		DOB.sendKeys("01/01/2023");//invalid date		
		submitbutton.click();
		Alert a5=driver.switchTo().alert();//valid name
		Thread.sleep(2000);
		System.out.println("valid name:"+a5.getText());
		a5.accept();

	}

}
