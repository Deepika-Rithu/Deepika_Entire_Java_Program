package AmazonScenarios_Assertion;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Scenario7
{
	@Test
	public void scenario7()
	{
		//dropdown->amazon fresh->search for mango, click on first product
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
				WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
				Select s1=new Select(dropdown);
				s1.selectByValue("search-alias=nowstore"); 
				WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
				search.sendKeys(Keys.ENTER);
				WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
				search1.sendKeys("mango");
				search1.sendKeys(Keys.ENTER);
				WebElement mango_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
				mango_select.click();
				Set<String> s=driver.getWindowHandles();
				int count=s.size();
				System.out.println(count);
				Assert.assertEquals(count>1, true, "mango was not selected");
	}
}
