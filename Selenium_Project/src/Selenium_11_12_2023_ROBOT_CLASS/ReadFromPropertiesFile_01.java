package Selenium_11_12_2023_ROBOT_CLASS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile_01 
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("./resources/Sample1.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
	
		prop.load(fis);//to link properties and fis file
		System.out.println(prop.getProperty("subject"));//to fetch value
		
	}

}
