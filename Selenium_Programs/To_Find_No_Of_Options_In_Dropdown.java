package Selenium_Basic_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class To_Find_No_Of_Options_In_Dropdown 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		List<WebElement> count=s1.getOptions();
		int options_count=count.size();
		System.out.println(options_count);
	}

}
