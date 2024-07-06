package SeleniumProgram;

import org.testng.annotations.Test;

public class TestAnnotations_priorityParameter
{
	@Test(priority=-1)
	public void sub()
	{
		System.out.println("Subtraction");
	}
	@Test(priority=1)
	public void add()
	{
		System.out.println("Addition");
	}
	@Test
	public void mul()
	{
		System.out.println("Multiplication");
	}
}
