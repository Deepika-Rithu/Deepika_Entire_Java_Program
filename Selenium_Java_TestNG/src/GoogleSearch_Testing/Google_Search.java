package GoogleSearch_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google_Search 
{
	WebDriver driver;
@Test
@Parameters("browser")
public void SearchGoogle(String nameofbrowser)
{
	if(nameofbrowser.equals("Chrome")) 
	{
	driver=new ChromeDriver();
	}
	if(nameofbrowser.equals("Firefox")) 
	{
	driver=new FirefoxDriver();
	}
	if(nameofbrowser.equals("Edge")) 
	{
	driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
	w1.until(ExpectedConditions.titleIs("Google"));
	driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}
}
