package Tasks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_rediff_05_12_2023 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver1.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver1.findElement(By.id("password")).sendKeys("Testing@123");
		driver1.findElement(By.xpath("//input[@title=\"Sign in\"]")).click();
		
		driver1.findElement(By.xpath("//li[@title='Compose a new mail']")).click();
	    driver1.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com",Keys.ENTER);
	 
	    driver1.findElement(By.xpath("//input[@class=\"rd_inp_sub rd_subject_datacmp2\"]")).sendKeys("Chandana");
	    
	    WebElement frame1 = driver1.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
	    driver1.switchTo().frame(frame1);
	    driver1.findElement(By.tagName("body")).sendKeys("Hi all");
	    driver1.switchTo().defaultContent();
	    driver1.findElement(By.linkText("Send")).click();
	    
	    WebDriverWait explicitwait1=new WebDriverWait(driver1,Duration.ofSeconds(15));
	    WebElement button1 = driver1.findElement(By.xpath("//div[text()='Your mail has been sent']"));//ElementClickInterceptedException
	    explicitwait1.until(ExpectedConditions.visibilityOf(button1));
	    File capture1 = driver1.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(capture1, new File("./ScreenShots/mail_Sent1.png"));

	    driver1.findElement(By.xpath("//cite[@title='Refresh Inbox']")).click();
	    driver1.findElement(By.xpath("//span[@title=\"Chandana\"]/..//cite[@title=\"Select mail\"]")).click();
	    driver1.findElement(By.xpath("//span[@class=\"rd_fil_del\"]")).click();
	    driver1.findElement(By.id("jqi_state0_buttonOk")).click();
	    
	    //WebDriverWait explicitwait2=new WebDriverWait(driver1,Duration.ofSeconds(15));
	    WebElement button2 = driver1.findElement(By.xpath("//div[text()='1 mail deleted successfully']"));//ElementClickInterceptedException
	    explicitwait1.until(ExpectedConditions.visibilityOf(button2));
	    File capture2 = driver1.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(capture2, new File("./ScreenShots/mail_Deleted1.png"));

//		if(driver1.findElement(By.xpath("//body")).getText().contains("1 mail deleted successfully"))
//		{
//	    File capture2 = driver1.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(capture2, new File("./ScreenShots/mail_Deleted1.png"));
//		}

	    //frame1.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']")).sendKeys("Hi all");
		//driver1.findElement(By.id("//li[@class=\"fld_sub\"])[2]")).sendKeys("abc");
	    //driver1.findElement(By.xpath("(//iframe)[2][@title='Rich Text Editor, rdMailEditorcmp2')")).sendKeys("Hi all");
	    //frame.findElement(By.xpath("[@title='Rich Text Editor, rdMailEditorcmp2')")).sendKeys("Hey all?");
	    //driver1.findElement(By.linkText("Yes")).click();
		//System.out.println(capture);
		//driver1.findElement(By.xpath("//li[@subject='Sample1]")).click();
	    //li[@subject="test1"]//cite[@class="rd_mail_tickbox"]
	    //driver1.findElement(By.xpath("//img[@id=\"captchaImg\"]")).clear();
	    //driver1.switchTo().alert();
	    //if(driver1.findElement(By.linkText("Your mail has been sent")))


//		if(driver1.findElement(By.xpath("//body")).getText().contains("Your mail has been sent"))
//			{
//		    File capture1 = driver1.getScreenshotAs(OutputType.FILE);
//		    FileHandler.copy(capture1, new File("./ScreenShots/mail_Sent.png"));
//			}
	//	

	}
}
