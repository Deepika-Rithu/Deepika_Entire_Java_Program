package AmazonScenarios_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Scenario6 
{
	@Test
	public void scenario6() throws InterruptedException
	{
		//click on Electronics major tab, select brand as Redmi
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement Electronics=driver.findElement(By.linkText("Electronics"));
		Electronics.click();
		WebElement Redmi_checkbox=driver.findElement(By.linkText("Redmi"));
		Redmi_checkbox.click();
		Thread.sleep(5000);
		Assert.assertEquals(Redmi_checkbox.isSelected(),true,"Redmi is not selected");
		
	}

}
