package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Flipkart search using CSS with help of tagname, classname, attribute name and attribute value
public class CSS_Syntax7 
{
	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement search=driver.findElement(By.cssSelector("input.Pke_EE[name='q']"));
		search.sendKeys("Shoe");

	}

}
