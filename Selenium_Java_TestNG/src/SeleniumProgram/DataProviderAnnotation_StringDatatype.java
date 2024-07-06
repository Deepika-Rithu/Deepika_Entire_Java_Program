package SeleniumProgram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation_StringDatatype
{
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{"Ram"},{"Laxman"},{"Vishnu"},{"Shiva"},{"Ganesh"},{"Laxmi"}};
	}
	
	@Test(dataProvider="data1")
	public void testcase1(String name)
	{
		System.out.println(name.concat(" Tiwari"));
	}
}
