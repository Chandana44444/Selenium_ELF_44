//TO WRITE TITLE AND URL IN FILE

package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1_22_11_2023 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://google.co.in");
		String title=driver1.getTitle();
		String url=driver1.getCurrentUrl();
		
		File f1=new File("./Tasks/Task1.txt");
		f1.createNewFile();
		FileOutputStream fos=new FileOutputStream(f1);
		fos.write(title.getBytes());
		System.out.println();
		fos.write(url.getBytes());
		

	}

}
