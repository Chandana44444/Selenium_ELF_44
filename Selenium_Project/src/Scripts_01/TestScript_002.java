package Scripts_01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_002 extends BaseScript{
	@Test
	public void mthd2()
	{
		Reporter.log("From Test mthd-2",true);
	}

}
