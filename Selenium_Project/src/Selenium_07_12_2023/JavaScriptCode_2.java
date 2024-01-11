package Selenium_07_12_2023;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.language.Argument;

public class JavaScriptCode_2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		WebElement disabled_button = driver1.findElement(By.name("custom_gender"));
		disabled_button.clear();
		driver1.executeScript("arguments[0].value='practise';", disabled_button);
		
		//arguments[]->can write anything since it will be in the form of array
		//and can access all indexs.
		//Object act as input on which actions can be performed
		//using js we can easily identify with the help of id
		
		
		//document.getElementById("navbar-search-input").style.border="3px solid red";
		//document.getElementById("navbar-search-input").style.background="black";

	    //will work only for id(since findelement),all other mthds are findelements
	}
}

