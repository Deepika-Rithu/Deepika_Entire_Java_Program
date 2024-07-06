package AmazonScenarios_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Scenario10 
{
	@Test
	public void scenario10()
	{
		//search shoe->go back go home page
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
				WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
				search.sendKeys("shoe");
				search.sendKeys(Keys.ENTER);
				driver.navigate().back();
				Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Homepage is not displayed");
	}
}
