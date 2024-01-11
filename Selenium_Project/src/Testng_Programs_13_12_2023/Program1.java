package Testng_Programs_13_12_2023;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1 
{
	int invoc_Count=3;
	@Test(priority=-'a',invocationCount=2)
	public static void m1()
	{
		Reporter.log("From static m1()",true);
	}
	
	@Test(priority='A',invocationCount=-2)//should not be executed even once
	public void m2()
	{
		Reporter.log("From non static m2()",true);
	}
	
	@Test(priority=-1,invocationCount=-2,threadPoolSize=3)
	public void m3()
	{
		Reporter.log("From non static m3()",true);
	}


}
