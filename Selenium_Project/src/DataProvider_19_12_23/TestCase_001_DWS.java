package DataProvider_19_12_23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_001_DWS {
	@DataProvider(name="Data_1")
	public String[][] datas()
	{
		String[][] arr= {
				             {"chandu@123","cha@1234"},
				             {"chandu@gmail","cha@1234"},
				             {"pooo@612","pooo@612"}
		                };
	return arr;
	}
	
	@Test(dataProvider = "Data_1")
	public void login(String[] data)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement Email_Box = driver.findElement(By.id("Email"));
		Email_Box.clear();
		//Email_Box.sendKeys("chandu@123");
		Email_Box.sendKeys(data[0]);
		WebElement pswd_Box = driver.findElement(By.id("Password"));
		pswd_Box.clear();
		//pswd_Box.sendKeys("cha@1234");
		pswd_Box.sendKeys(data[1]);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}
}
