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

public class Assertion_Scenario3 
{
	@Test
	public void scenario3() throws InterruptedException
	{
		//Search mouse, sort get it in 2 days and click on first product
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mouse");
		search.sendKeys(Keys.ENTER);
		WebElement getin2days=driver.findElement(By.xpath("//li[@id='p_90/20912642031']"));			
		getin2days.click();
		WebElement firstmouse_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
		firstmouse_select.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		WebElement cart= driver.findElement(By.id("add-to-cart-button"));
		Assert.assertEquals(cart.isDisplayed(),true,"first mouse is not selected");
	}
}
