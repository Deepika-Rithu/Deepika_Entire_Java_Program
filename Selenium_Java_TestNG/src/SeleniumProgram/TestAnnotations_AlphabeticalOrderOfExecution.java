package SeleniumProgram;

import org.testng.annotations.Test;

public class TestAnnotations_AlphabeticalOrderOfExecution
{
	@Test
	public void sub()
	{
		System.out.println("Subtraction");
	}
	@Test
	public void mul()
	{
		System.out.println("Multiplication");
	}
	@Test
	public void add()
	{
		System.out.println("Addition");
	}

}
