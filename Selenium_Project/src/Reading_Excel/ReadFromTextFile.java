package Reading_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromTextFile 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("./resources/Demo.txt");
		FileInputStream fis=new FileInputStream(file);
		
		int value = fis.read();
		
		while(value!=-1)
		{
			System.out.print((char)value);
			value=fis.read();//reads if it is in multiple lines as well.
		}

	}

}
