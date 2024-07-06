package AmazonScenarios_Assertion;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Scenario8
{
	@Test
	public void scenario8()
	{
		//dropdown->books->search for power of mind, click on first product
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
				WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
				Select s1=new Select(dropdown);
				s1.selectByValue("search-alias=stripbooks"); 
				WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
				search.sendKeys(Keys.ENTER);
				WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
				search1.sendKeys("power of mind");
				search1.sendKeys(Keys.ENTER);
				WebElement book_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
				book_select.click();
				Set<String> s2=driver.getWindowHandles();
				Iterator<String> i1=s2.iterator();
				i1.next();
				String childid=i1.next();
				driver.switchTo().window(childid);
				WebElement readsample=driver.findElement(By.id("pbooksReadSampleButton-announce"));
				Assert.assertEquals(readsample.isDisplayed(),true,"book is not selected");
	}
}
