package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_isSelected
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grotechminds.com/is-selected/");
		WebElement checkbox1=driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
		boolean ans=checkbox1.isSelected();
		if(ans==true)
		{
			System.out.println("checkbox 1 is selected");
		}
		else
		{
			System.out.println("checkbox1 is not selected");
			checkbox1.click();
			System.out.println("Now it is selected");
		}
	}

}
