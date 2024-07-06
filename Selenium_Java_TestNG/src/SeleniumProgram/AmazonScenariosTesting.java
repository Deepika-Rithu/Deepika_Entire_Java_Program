package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonScenariosTesting
{
	@Test
	public void Testcase() throws InterruptedException
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
	}

}
