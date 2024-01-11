package Selenium_11_12_2023_ROBOT_CLASS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Prgm_03 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// settings.addArguments("--disable-notifications");//to avoid notification
		// settings.addArguments("--incognito");//to open in incognito mode
		// can perform both at once as well(incognito and popup remove)

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// to avoid

		driver.get("https://the-internet.herokuapp.com/basic_auth");

		// Robot robot=new Robot();
		//
		// robot.keyPress(KeyEvent.VK_C);
		// robot.keyPress(KeyEvent.VK_H);
		// robot.keyPress(KeyEvent.VK_A);
		// robot.keyPress(KeyEvent.VK_N);
		// robot.keyPress(KeyEvent.VK_D);
		// robot.keyPress(KeyEvent.VK_A);
		// robot.keyPress(KeyEvent.VK_N);
		// robot.keyPress(KeyEvent.VK_A);
		//
		// Thread.sleep(1000);
		// robot.keyPress(KeyEvent.VK_TAB);
		//
		// robot.keyPress(KeyEvent.VK_C);
		// robot.keyPress(KeyEvent.VK_H);
		// robot.keyPress(KeyEvent.VK_A);
		// robot.keyPress(KeyEvent.VK_N);
		// robot.keyPress(KeyEvent.VK_D);
		// robot.keyPress(KeyEvent.VK_U);
		//
		// robot.keyPress(KeyEvent.VK_TAB);
		// robot.keyPress(KeyEvent.VK_ENTER);
		//
		//
		// robot.keyRelease(KeyEvent.VK_C);
		// robot.keyRelease(KeyEvent.VK_H);
		// robot.keyRelease(KeyEvent.VK_A);
		// robot.keyRelease(KeyEvent.VK_N);
		// robot.keyRelease(KeyEvent.VK_D);
		// robot.keyRelease(KeyEvent.VK_A);
		// robot.keyRelease(KeyEvent.VK_N);
		// robot.keyRelease(KeyEvent.VK_A);
		// robot.keyRelease(KeyEvent.VK_U);
		//
		// robot.keyRelease(KeyEvent.VK_TAB);
		// robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
