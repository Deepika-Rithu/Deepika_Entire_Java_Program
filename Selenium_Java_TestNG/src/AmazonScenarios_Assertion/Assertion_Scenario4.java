package AmazonScenarios_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertion_Scenario4 
{
	@Test
	public void scenario4() throws InterruptedException
	{
		//Search mobile cover, Include Out of Stock checkbox
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile cover");
		search.sendKeys(Keys.ENTER);
		WebElement checkbox=driver.findElement(By.id("p_n_availability/1318485031"));
		checkbox.click();
		Thread.sleep(3000);
		boolean b=checkbox.isSelected();
		Assert.assertEquals(b, true,"checkbox not selected");
	}
}
