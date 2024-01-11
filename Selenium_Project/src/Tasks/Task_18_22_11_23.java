//DEMO WEB SHOP => ERROR MESSAGE(W/O DATA)

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_18_22_11_23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver1.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		WebElement Email = driver1.findElement(By.id("Email"));
		Email.clear();//best practise followed in industries
		WebElement password = driver1.findElement(By.id("Password"));
		password.clear();
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		String errorMsg = driver1.findElement(By.className("validation-summary-errors")).getText();
		System.out.println(errorMsg);

	}

}
