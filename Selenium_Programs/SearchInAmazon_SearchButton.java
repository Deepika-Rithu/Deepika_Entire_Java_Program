package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInAmazon_SearchButton
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.name("field-keywords")).sendKeys("Books");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
