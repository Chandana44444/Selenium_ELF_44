package Selenium_07_12_2023;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class WorkingWithActionsClassMthds_3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver1.get("https://onepagelove.com");
		// WebElement ele1 =
		// driver1.findElement(By.xpath("//a[@title=\"Supershine\"]"));

		Actions a1 = new Actions(driver1);

//		ScrollOrigin ref=ScrollOrigin.fromElement(ele1);
//		a1.scrollFromOrigin(ref, 0, 600).perform();//NoSuchElementException

		// so put it in infinite for loop
		for (;;) {
			try {
				// ele1.click();
				driver1.findElement(By.xpath("//a[@title=\"Supershine\"]")).click();
				break;
			} catch (NoSuchElementException e) {
				a1.scrollByAmount(0, 500).perform();// ElementClickInterceptedException
				// ScrollOrigin.fromElement(ele1, 0, 600);//to scroll infinite time
			} catch (ElementClickInterceptedException i) {
				driver1.findElement(By.xpath("//a[@title=\"Supershine\"]")).click();
			}
		}

//		a1.dragAndDropBy(null, 0, 0);

	}
}
