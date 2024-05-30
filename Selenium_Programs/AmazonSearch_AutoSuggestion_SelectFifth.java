package Selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch_AutoSuggestion_SelectFifth
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> auto_suggestion=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=auto_suggestion.size();
		System.out.println("Number of auto suggestions:" +count);
		auto_suggestion.get(4).click();
	}

}
