package SeleniumProgram;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Annotations_3Test_1BM_1AM
{
	@Test
	public void TestCase1()
	{
		System.out.println("Testcase1");
	}
	@Test
	public void TestCase2()
	{
		System.out.println("Testcase2");
	}
	@Test
	public void TestCase3()
	{
		System.out.println("Testcase3");
	}
	@AfterMethod
	public void close_browser()
	{
		System.out.println("Browser Close");
	}
	@BeforeMethod
	public void launch_browser()
	{
		System.out.println("Browser Launch");
	}
}
