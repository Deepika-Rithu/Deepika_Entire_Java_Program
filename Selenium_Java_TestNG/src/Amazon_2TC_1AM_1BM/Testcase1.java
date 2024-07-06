package Amazon_2TC_1AM_1BM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1 extends Login_Logout
{
	@Test
	public void Search_ClickFirstProduct() throws InterruptedException
	{
	//Search and click on first product
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoe");
	search.sendKeys(Keys.ENTER);
	WebElement firstshoe_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	firstshoe_select.click();
	
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> pcid=s1.iterator();
	pcid.next();
	String childid=pcid.next();
	driver.switchTo().window(childid);
	Thread.sleep(2000);
	}
}
