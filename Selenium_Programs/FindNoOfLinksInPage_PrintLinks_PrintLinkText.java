package Selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfLinksInPage_PrintLinks_PrintLinkText
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int count_of_links=links.size();
		System.out.println(count_of_links);
		for (int i=0;i<count_of_links;i++)
		{
			WebElement s1=links.get(i);
			String link=s1.getAttribute("href");
			System.out.println(link);
			String linktext=s1.getText();
			System.out.println(linktext);
		}

	}

}
