package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_IsDisplayed_IsEnabled
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.name("q"));
		if(search.isDisplayed() && search.isEnabled())
		{
			search.sendKeys("India");
		}

	}

}
