package sample_TestCase;

import org.testng.annotations.Test;

/*
 * Conclusion:-
 * 1.If we want to execute test cases in customized order then we need to use a method called
 *   as priority...Example:-@Test(priority=1)
 *   NOTE:-Lowest value will get the first priority for execution..
 * 2.If we don't provide priority test cases will executed alphabetical order..
 * 3.If we test cases having same priority then those test case will execute alphabetical order..
 * 4.Priority can be negative also.. 
 */
public class Sample_TC2_TESTNG {

	@Test(priority=1)
	public void createUser()
	{
		System.out.println("User Created Successfully!!");
	}
	@Test(priority=2)
	public void modifierUser()
	{
		System.out.println("User Modified Successfully!!");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("User Deleted Successfully!!");
	}
}
