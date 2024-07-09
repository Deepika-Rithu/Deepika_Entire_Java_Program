package SeleniumProgram;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HardAssert_Program 
{
	public static void main(String[] args)
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("camera");
	search.sendKeys(Keys.ENTER);
	WebElement camera_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[13]"));
	camera_select.click();
	Set<String> s1=driver.getWindowHandles();
	Assertion a1=new Assertion(); //HardAssert
	a1.assertEquals(s1.size(), 2);
	Iterator<String> pcid=s1.iterator();
	pcid.next();
	String childid=pcid.next();
	driver.switchTo().window(childid);
	WebElement addtocart= driver.findElement(By.id("add-to-cart-button"));
	addtocart.click();
	}
}

