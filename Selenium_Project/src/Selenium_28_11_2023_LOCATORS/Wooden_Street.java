package Selenium_28_11_2023_LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wooden_Street {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://www.woodenstreet.com");
		Thread.sleep(6000);
//		driver1.findElement(By.linkText("Dining & Kitchen")).click();
//		Thread.sleep(2000);
//		driver1.findElement(By.linkText("Modular Kitchen")).click();
		
		//driver1.findElement(By.linkText("Study & Office")).click();//doesnot click
		//driver1.findElement(By.partialLinkText("Study & Office")).click();//doesnot click
		
		driver1.findElement(By.linkText("Mattresses")).click();
	
	}

}
