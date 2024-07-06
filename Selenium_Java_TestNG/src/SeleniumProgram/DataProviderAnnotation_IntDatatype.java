package SeleniumProgram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation_IntDatatype 
{
	@DataProvider(name="data2")
	public Object[][] method2()
	{
		return new Object[][] {{10},{11},{12},{20},{22},{41}};
	}
	
	@Test(dataProvider="data2")
	public void testcase1(int rollno)
	{
		System.out.println(rollno+100);
	}

}
