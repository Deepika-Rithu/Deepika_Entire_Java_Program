package AmazonScenarios_Assertion;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Scenario2 
{
	@Test
	public void scenario2()
	{
		//Search mobile and click on first mobile
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		WebElement firstmobile_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstmobile_select.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid); 
		WebElement buynow= driver.findElement(By.id("buy-now-button"));
		Assert.assertEquals(buynow.isDisplayed(),true,"first mobile is not selected");
	}

}
