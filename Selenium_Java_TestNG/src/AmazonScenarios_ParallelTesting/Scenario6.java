package AmazonScenarios_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario6 extends Launch_Quit 
{
	@Test
	public void Testcase6()
	{
		//click on Electronics major tab, select brand as Redmi
		WebElement Electronics=driver.findElement(By.linkText("Electronics"));
		Electronics.click();
		WebElement Redmi_checkbox=driver.findElement(By.linkText("Redmi"));
		Redmi_checkbox.click();
	}
}