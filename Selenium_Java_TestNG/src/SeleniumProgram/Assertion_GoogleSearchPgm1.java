package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion_GoogleSearchPgm1
{
	@Test
	public void Googlesearch()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(),"India - Google Search","Titles are mismatching");	
		Reporter.log("Successfully searched");
	}
}