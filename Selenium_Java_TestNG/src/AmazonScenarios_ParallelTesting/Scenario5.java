package AmazonScenarios_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario5 extends Launch_Quit 
{
	@Test
	public void Testcase5()
	{
		//Search camera, Click on 15th camera
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("camera");
		search.sendKeys(Keys.ENTER);
		WebElement camera_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[15]"));
		camera_select.click();
	}
}