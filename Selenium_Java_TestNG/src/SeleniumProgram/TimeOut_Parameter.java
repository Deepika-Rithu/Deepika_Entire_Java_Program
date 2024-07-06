package SeleniumProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut_Parameter 
{
	@Test(timeOut=5000)
	public void testcase1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

}
