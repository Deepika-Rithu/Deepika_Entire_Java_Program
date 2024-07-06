package AmazonScenarios_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario4 extends Launch_Quit 
{
	@Test
	public void Testcase4()
	{
		//Search mobile cover, Include Out of Stock checkbox
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile cover");
		search.sendKeys(Keys.ENTER);
		WebElement IncludeOutOfStock_checkbox=driver.findElement(By.linkText("Include Out of Stock"));
		IncludeOutOfStock_checkbox.click();
	}
}