package iRetry;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1
{
	@Test(retryAnalyzer=iRetry.Retry_Pgm1.class)
	public void scenario1()
	{
		//Search shoe and click on first shoe
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		WebElement firstshoe_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstshoe_select.click();
		Set<String> s1=driver.getWindowHandles();
		int count=s1.size();
		System.out.println(count);
		Assert.assertEquals(count==2, false, "First shoe was not selected");
		//Assert.assertEquals(count==2, true, "First shoe was not selected");
	}

}
