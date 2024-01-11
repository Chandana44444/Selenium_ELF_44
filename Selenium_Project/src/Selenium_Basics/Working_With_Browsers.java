package Selenium_Basics;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_Browsers
{
	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver.exe");
//		ChromeDriver d1=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		FirefoxDriver d3=new FirefoxDriver();	
	}
}
