package sample_TestCase;

import org.testng.annotations.Test;

/*
 * Conclusion:
 * 1.If-we don't provide @Test for any test case it will not consider as test case and it
 *   will not participate in the execution.
 * 2.We will never declare @Test in class level because inside class many generic methods
 *   will be present and if we declare in class those things will also consider as test case
 *   and we will not get Exact output..That's why we should always declare @test in method 
 *   level or TestCase level..  
 */
public class Sample_TC1_TESTNG {

	@Test
	public void createUser()
	{
		System.out.println("User created Successfully!!");
	}
	@Test
	public void modifierUser()
	{
		System.out.println("User modified Successfully!!");
	}
	@Test
	public void deleteUser()
	{
		System.out.println("User deleted Successfully!!");
	}
}
