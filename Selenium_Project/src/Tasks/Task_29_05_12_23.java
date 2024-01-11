package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_29_05_12_23
{
	public static void mthd(WebElement dropdownele)
	{
		Select listbox=new Select(dropdownele);
		int totalnoofoptions = listbox.getOptions().size();
		listbox.selectByIndex(totalnoofoptions-1);
	}
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://demoapp.skillrary.com/");
		WebElement multilistbox = driver1.findElement(By.id("cars"));
		//Select op1=new Select(multilistbox);
		mthd(multilistbox);
	
	}

}
