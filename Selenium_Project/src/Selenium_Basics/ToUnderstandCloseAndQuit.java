package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseAndQuit
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
//        driver1.get("https://www.shoppersstack.com/products_page/4");
        driver1.get("https://demowebshop.tricentis.com/");
        Thread.sleep(6000);//NoSuchElementException
//        driver1.findElement(By.id("compare")).click();
        //Thread.sleep(2000);//After clicking should make us visible so make a delay
//        driver1.close();
        //driver1.quit();
        
        ChromeDriver driver2=new ChromeDriver();
//      driver1.get("https://www.shoppersstack.com/products_page/4");
      driver2.get("https://demowebshop.tricentis.com/");
      Thread.sleep(6000);//NoSuchElementException
//      driver2.get("https://demowebshop.tricentis.com/apparel-shoes");
//      driver2.findElement(By.id("compare")).click();
      //Thread.sleep(2000);//After clicking should make us visible so make a delay
      driver1.close();
      driver1.quit();
	}
}

