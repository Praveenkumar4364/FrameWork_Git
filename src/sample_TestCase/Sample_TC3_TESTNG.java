package sample_TestCase;

import org.testng.annotations.Test;

/*
 * Conclusion:-
 * 1.If we want build a dependency in between methods we have to use a method called as dependsOnMethods.
 *   Example:---@Test(dependsOnMethods="createUser")
 * 2.we can use multiple methods in the @Test argument.
 *   Example:-@Test(priority=2,dependsOnMethods="createUser")
 * 3.If we want to exclude a test case from execution then we have to use a method called as(enabled=false)..
 *   Example:-@Test(enabled=false)
 * 4.If we want to execute a test case multiple times we need to use a method called as(invocationCount=count)..
 *   Example:-@Test(invocationCount=5)
 */
public class Sample_TC3_TESTNG {

	@Test(priority=1,invocationCount=2,enabled = true)
	public void createUser()
	{
		System.out.println("User created Successfully!!");
	}
	@Test(priority=2,dependsOnMethods = "createUser")
	public void modifyUser()
	{
		System.out.println("User modified Successfully!!");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("User deleted Successfully!!");
	}
}
