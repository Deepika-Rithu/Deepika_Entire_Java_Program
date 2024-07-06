package AmazonScenarios_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario9 extends Launch_Quit 
{
	@Test
	public void Testcase9()
	{
		//click on todays deals->deals of the day->click on the 1st product
		WebElement TodaysDeals=driver.findElement(By.linkText("Today's Deals"));
		TodaysDeals.click();
		WebElement Dealoftheday=driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[1]"));
		Dealoftheday.click();
		WebElement firstproduct=driver.findElement(By.xpath("(//div[@class='ProductCard-module__card_uyr_Jh7WpSkPx4iEpn4w'])[1]"));
		firstproduct.click();
	}
}