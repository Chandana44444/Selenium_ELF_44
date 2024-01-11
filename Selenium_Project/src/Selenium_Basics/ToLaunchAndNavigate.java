package Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchAndNavigate {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("www.google.co.in");
		System.out.println(driver1.getWindowHandle());
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getPageSource());
	}

}
