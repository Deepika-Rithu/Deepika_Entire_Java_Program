package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Dropdown_UsingKeys 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
	}

}
