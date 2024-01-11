package Scripts_01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_003 extends BaseScript{
	@Test
	public void mthd3_1()
	{
		Reporter.log("From Test mthd-3_1",true);
	}
	@Test
	public void mthd4_1()
	{
		Reporter.log("From Test mthd-4_1",true);
	}
}
