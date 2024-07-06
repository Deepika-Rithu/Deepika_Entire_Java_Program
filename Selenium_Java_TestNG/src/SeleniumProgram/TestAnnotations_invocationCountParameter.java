package SeleniumProgram;

import org.testng.annotations.Test;

public class TestAnnotations_invocationCountParameter
{
	@Test(priority=-1)
	public void registration()
	{
		System.out.println("Registration");
	}
	@Test(invocationCount=3)
	public void login()
	{
		System.out.println("Login");
	}

}
