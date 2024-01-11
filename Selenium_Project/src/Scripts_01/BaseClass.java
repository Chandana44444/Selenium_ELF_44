package Scripts_01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	public void reportconfig()
	{
		Reporter.log("for Before Suite",true);
	}
	@Test
	public void reportconfigflush()
	{
		Reporter.log("for After Suite",true);
	}
	@Test
	public void browserlaunch()
	{
		Reporter.log("for Before Class",true);
	}
	@Test
	public void browserclose()
	{
		Reporter.log("for After Class",true);
	}
	@Test
	public void login()
	{
		Reporter.log("for Before Method",true);
	}
	@Test
	public void logout()
	{
		Reporter.log("for After Method",true);
	}
	@Test
	public void jdbc_open()
	{
		Reporter.log("for Before Suite",true);
	}
	@Test
	public void jdbc_close()
	{
		Reporter.log("for After Suite",true);
	}
	
	
//can't run since no @Test method	

}
