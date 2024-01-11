package Selenium_01_12_2023;

public class WorkingWithVarArgs 
{
	public static int add(int...a)
	{
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static double sub(double...a)
	{
		double sum=0;
		for(double i:a)
		{
			sum-=i;
		}
		return sum;
	}
	
	public static long multiply(long...a)
	{
		long mul=1;
		for(long i:a)
		{
			mul*=i;
		}
		return mul;
	}

	public static void main(String[] args)
	{
		System.out.println(add(10,20,'c',90,87));
		System.out.println(multiply(10,'b',988l));
	}

}
