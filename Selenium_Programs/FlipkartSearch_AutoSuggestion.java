package Selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch_AutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> auto_suggestion=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count=auto_suggestion.size();
		System.out.println("Number of auto suggestions:" +count);
		auto_suggestion.get(4).click();
		}

}
