package SeleniumProgram;
import org.testng.annotations.Test;
public class TestAnnotations_All3Parameters
{
	@Test(priority=-1,invocationCount=2,enabled=true)
	public void registration()
	{
		System.out.println("Registration");
	}
	@Test(priority=1,invocationCount=1,enabled=true)
	public void login()
	{
		System.out.println("Login");
	}
}
