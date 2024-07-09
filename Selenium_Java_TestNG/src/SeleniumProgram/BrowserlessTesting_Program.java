package SeleniumProgram;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class BrowserlessTesting_Program
{
	@Test
	public void Googlesearch()
	{
		//ChromeOptions c1=new ChromeOptions();
		//c1.addArguments("--headless");
		//ChromeDriver driver=new ChromeDriver(c1);
		EdgeOptions c1=new EdgeOptions();
		c1.addArguments("--headless");
		EdgeDriver driver=new EdgeDriver(c1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(),"India - Google Search","Titles are mismatching");
}
}
