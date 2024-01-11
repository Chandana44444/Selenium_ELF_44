package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Upcasting_Downcasting 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver.chrome", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
//     	driver1.get("https://google.co.in");

//		WebDriver driver3=new ChromeDriver();
//		driver3.get("https://www.google.co.in/");
		
//		WebDriver driver4=new ChromeDriver();
//		ChromeDriver d=(ChromeDriver)driver4;
//		d.get("https://www.google.co.in/");

	}

}

//can launch only on firefox and chrome.
