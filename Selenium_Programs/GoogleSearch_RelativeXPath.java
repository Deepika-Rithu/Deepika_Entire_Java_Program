package Selenium_Basic_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_RelativeXPath
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.xpath("(//textarea)[1]"));
		search.sendKeys("Bangalore");
		search.sendKeys(Keys.ENTER);

	}

}
