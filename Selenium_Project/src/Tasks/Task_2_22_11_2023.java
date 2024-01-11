//TO STORE CODE IN FILE

package Tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2_22_11_2023 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://google.co.in");
		String sourcecode=driver1.getPageSource();
		
		File f1=new File("./Tasks/Task-2.html");
		f1.createNewFile();
		FileOutputStream fos=new FileOutputStream(f1);
		fos.write(sourcecode.getBytes());
		
	}

} 
