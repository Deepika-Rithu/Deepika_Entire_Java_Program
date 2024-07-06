package SeleniumProgram;

import org.testng.annotations.Test;

public class Grouping_Testcases
{
	@Test(groups= {"smoke","system"})
	public void Testcase1()
	{
		System.out.println("Testcase1");
	}
	@Test(groups= {"smoke","system","integration"})
	public void Testcase2()
	{
		System.out.println("Testcase2");
	}
	@Test(groups= {"smoke"})
	public void Testcase3()
	{
		System.out.println("Testcase3");
	}
	@Test(groups= {"component"})
	public void Testcase4()
	{
		System.out.println("Testcase4");
	}
	@Test(groups= {"system"})
	public void Testcase5()
	{
		System.out.println("Testcase5");
	}
}
