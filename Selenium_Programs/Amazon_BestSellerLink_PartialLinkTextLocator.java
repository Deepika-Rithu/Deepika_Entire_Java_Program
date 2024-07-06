package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_BestSellerLink_PartialLinkTextLocator 
{
	public static void main(String[] args)
	{ 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement BestSeller_link=driver.findElement(By.partialLinkText("Best"));
		BestSeller_link.click();
	}

}
