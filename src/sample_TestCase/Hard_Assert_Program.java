package sample_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Program {
	@Test
public void strictlevelComparison()
{
	String act="Raja";
	String exp="raja";
	Assert.assertEquals(act, exp);
	System.out.println("Strict level pass");
}
	@Test
public void containslevelComparison()
{
	String act="maharaja";
	String exp="raja";
	Assert.assertTrue(act.contains(exp));
	System.out.println("Strin level contains pass");
}
}
