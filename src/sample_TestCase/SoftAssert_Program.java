package sample_TestCase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Program {
	@Test
public void strictlevelcomparision()
{
	String act="raja";
	String exp="Raja";
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(act, exp);
	System.out.println("Strict level comparision pass!!!!!!");
	sa.assertAll();
}
	@Test
public void containslevelComparisson()
{
	String act="maharaja";
	String exp="raja";
	SoftAssert sa=new SoftAssert();
	sa.assertTrue(act.contains(exp));
	System.out.println("Comparission level pass!!!!!!!");
	sa.assertAll();
}
}
