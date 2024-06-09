package Selenium_Basic_Programs;
//Search in flipkart using class name

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Syntax2 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement search=driver.findElement(By.cssSelector(".Pke_EE"));
		search.sendKeys("Shoe");

	}

}
