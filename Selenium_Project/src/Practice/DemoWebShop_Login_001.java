package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_Login_001 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("chandana.p.m.4444@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu121*");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		driver.quit();

	}

}
