package Scripts_01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_001 extends BaseScript{
	@Test
	public void mthd1()
	{
		Reporter.log("From Test mthd-1",true);
	}

}
