package SeleniumProgram;

import org.testng.annotations.Test;

public class TestAnnotations_enabledParameter
{
@Test(priority=1)
public void registration()
{
	System.out.println("Registration");
}
@Test(priority=2)
public void login()
{
	System.out.println("Login");
}
@Test(enabled=false)
public void logout()
{
	System.out.println("Logout");
}
}
