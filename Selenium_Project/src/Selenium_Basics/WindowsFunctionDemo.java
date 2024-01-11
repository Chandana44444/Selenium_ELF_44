package Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsFunctionDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https:google.co.in");
		//driver1.get("https://portal.zinghr.com/2015/pages/authentication/zing.aspx?ccode=testyantra");
		System.out.println(driver1.getWindowHandle());
		//System.out.println(driver1.getWindowHandles());
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getPageSource());

	}

}
