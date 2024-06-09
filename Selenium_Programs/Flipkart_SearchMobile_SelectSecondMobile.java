package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_SearchMobile_SelectSecondMobile 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Mobile");
		search.sendKeys(Keys.ENTER);
		WebElement select_second_mobile=driver.findElement(By.xpath("(//div[@class='_75nlfW'])[2]"));
		select_second_mobile.click();

	}

}
