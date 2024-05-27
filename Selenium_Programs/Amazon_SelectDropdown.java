package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_SelectDropdown 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		s1.selectByValue("search-alias=fashion");   //select by value
		WebElement e2=driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys(Keys.ENTER);                  //To search for the selected value
		s1.selectByVisibleText("Amazon Pharmacy");   //select by visible text
		s1.selectByIndex(12);   //select by index

	}

}
