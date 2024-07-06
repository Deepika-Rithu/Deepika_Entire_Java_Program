package SeleniumProgram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionOfAllNineAnnotations_WithThreeTestcases 
{
	@Test
	public static void testcase1()
	
	{
		System.out.println("testcase1");
	}
	@Test
	public static void testcase2()
	{
		System.out.println("testcase2");
	}
	@Test
	public static void testcase3()
	{
		System.out.println("testcase3");
	}
	@BeforeSuite
	public static void bs()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public static void as()
	{
		System.out.println("after suite");
	}
	@BeforeTest
	public static void bt()
	{
		System.out.println("before test");
	}
	@AfterTest
	public static void at()
	{
		System.out.println("after test");
	}
	@BeforeClass
	public static void bc()
	{
		System.out.println("before class");
	}
	@AfterClass
	public static void ac()
	{
		System.out.println("after class");
	}
	@BeforeMethod
	public static void bm()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public static void am()
	{
		System.out.println("after method");
	}

}
