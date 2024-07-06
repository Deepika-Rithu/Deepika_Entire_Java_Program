package AmazonScenarios_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario2 extends Launch_Quit
{
	@Test
	public void Testcase2()
	{
		//Search mobile and click on first mobile
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		WebElement firstmobile_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstmobile_select.click();
	}

}
