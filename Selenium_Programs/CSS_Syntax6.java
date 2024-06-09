package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Google search using CSS with help of tagname, attribute name and attribute value
public class CSS_Syntax6 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.cssSelector("textarea[id='APjFqb']"));
		search.sendKeys("India");

	}

}
