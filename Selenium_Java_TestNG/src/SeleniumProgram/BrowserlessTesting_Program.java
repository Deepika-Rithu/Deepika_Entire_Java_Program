package SeleniumProgram;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class BrowserlessTesting_Program
{
public static void main(String[] args)
{
	ChromeOptions c1=new ChromeOptions();
	c1.addArguments("--headless");
	ChromeDriver driver=new ChromeDriver(c1);
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
	Assert.assertEquals(count==2, true, "camera was not selected");
}
}
