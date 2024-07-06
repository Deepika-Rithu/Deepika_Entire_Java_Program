package AmazonScenarios_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scenario7 extends Launch_Quit 
{
	@Test
	public void Testcase7()
	{
		//dropdown->amazon fresh->search for mango, click on first product
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dropdown);
		s1.selectByValue("search-alias=nowstore"); 
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(Keys.ENTER);
		WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("mango");
		search1.sendKeys(Keys.ENTER);
		WebElement mango_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		mango_select.click();
	}
}
