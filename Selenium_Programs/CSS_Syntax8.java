package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Amazon search using CSS with help of tagname, attribute name and substring of attribute value
public class CSS_Syntax8 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.cssSelector("input[id^='two']"));
		search.sendKeys("shoe");

	}

}
