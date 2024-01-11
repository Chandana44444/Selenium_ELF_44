//FAVOURITE COLOR CAPTURE

package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_21_11_2023
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		//Register
		driver1.get("https://www.shoppersstack.com/");
		Thread.sleep(3000);
		driver1.findElement(By.id("loginBtn")).click();
		driver1.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver1.findElement(By.id("First Name")).clear();
		driver1.findElement(By.id("First Name")).sendKeys("Chandana");
		driver1.findElement(By.id("Last Name")).clear();
		driver1.findElement(By.id("Last Name")).sendKeys("Manjesh");
		driver1.findElement(By.id("Female")).click();
		driver1.findElement(By.id("Phone Number")).sendKeys("0123456789");
		driver1.findElement(By.id("Email Address")).sendKeys("chandana.p.m.4444@gmail.com");
		driver1.findElement(By.id("Password")).sendKeys("Chandu121*");//8
		driver1.findElement(By.id("Confirm Password")).sendKeys("Chandu121*");
        driver1.findElement(By.id("Terms and Conditions")).click();
        driver1.findElement(By.id("btnDisabled")).click();
        
        Thread.sleep(2000);
        
        //Login
        driver1.findElement(By.id("loginBtn")).click();
        driver1.findElement(By.id("Email")).sendKeys("chandana.p.m.4444@gmail.com");
        driver1.findElement(By.id("Password")).sendKeys("Chandu121*");
        driver1.findElement(By.xpath("//span[text()='Login']")).click();
        
        //favourite
        Thread.sleep(2000);
        WebElement fav = driver1.findElement(By.id("addToWishlist"));
        fav.click();
        String beforeClick = fav.getAttribute("fill"); 
        System.out.println(beforeClick);      
	}

}
