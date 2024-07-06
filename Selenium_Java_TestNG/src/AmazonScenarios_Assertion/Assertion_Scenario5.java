package AmazonScenarios_Assertion;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Scenario5 
{
	@Test
	public void scenario5()
	{
		//Search camera, Click on 15th camera
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("camera");
		search.sendKeys(Keys.ENTER);
		WebElement camera_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[15]"));
		camera_select.click();
		Set<String> s1=driver.getWindowHandles();
		int count=s1.size();
		System.out.println(count);
		Assert.assertEquals(count>1, true, "camera was not selected");
	}
}
