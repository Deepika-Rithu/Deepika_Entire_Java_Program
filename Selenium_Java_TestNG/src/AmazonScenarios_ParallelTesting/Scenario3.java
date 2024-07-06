package AmazonScenarios_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario3 extends Launch_Quit 
{
	@Test
	public void Testcase3()
	{
		//Search mouse, sort get it in 2 days and click on first product
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mouse");
		search.sendKeys(Keys.ENTER);
		WebElement getin2days=driver.findElement(By.xpath("//li[@id='p_90/20912642031']"));
		getin2days.click();
		WebElement firstmouse_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
		firstmouse_select.click();
	}
}
