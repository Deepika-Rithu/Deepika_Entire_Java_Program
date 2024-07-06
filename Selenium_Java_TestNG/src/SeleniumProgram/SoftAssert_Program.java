package SeleniumProgram;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Program
{
	@Test
	public void SoftAssert() throws InterruptedException
	{
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
	SoftAssert a2=new SoftAssert();
	a2.assertEquals(s1.size(), 3);
	Iterator<String> pcid=s1.iterator();
	pcid.next();
	String childid=pcid.next();
	driver.switchTo().window(childid);
	Thread.sleep(2000);
	WebElement addtocart= driver.findElement(By.id("add-to-cart-button"));
	addtocart.click();
	}
}
