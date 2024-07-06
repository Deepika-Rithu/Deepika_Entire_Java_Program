package SeleniumProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTestcase 
{
	@Test
	public void login()
	{
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}

}
