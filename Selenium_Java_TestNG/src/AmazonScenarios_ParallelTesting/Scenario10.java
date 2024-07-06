package AmazonScenarios_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario10 extends Launch_Quit 
{
	@Test
	public void Testcase10()
	{
		//search shoe->go back go home page
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		driver.navigate().back();
	}
}
