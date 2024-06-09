package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_JavaScriptPopup
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grotechminds.com/javascript-popup/");
		WebElement click_button=driver.findElement(By.xpath("//button[@class='btnjs']"));
		click_button.click();
		
		
		
		
		
		
		
		driver.switchTo().alert().accept();

	}

}
