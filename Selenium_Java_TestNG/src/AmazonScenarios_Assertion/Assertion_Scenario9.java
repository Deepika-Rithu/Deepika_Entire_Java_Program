package AmazonScenarios_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Scenario9 
{
	@Test
	public void scenario9()
	{
		//click on todays deals->deals of the day->click on the 1st product
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
				WebElement TodaysDeals=driver.findElement(By.linkText("Today's Deals"));
				TodaysDeals.click();
				WebElement Dealoftheday=driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[2]"));
				Dealoftheday.click();
				WebElement firstproduct=driver.findElement(By.xpath("(//div[@class='ProductCard-module__card_uyr_Jh7WpSkPx4iEpn4w'])[1]"));
				firstproduct.click();
				WebElement buynow= driver.findElement(By.id("buy-now-button"));
				Assert.assertEquals(buynow.isDisplayed(), true,"product is not selected");
	}
}
