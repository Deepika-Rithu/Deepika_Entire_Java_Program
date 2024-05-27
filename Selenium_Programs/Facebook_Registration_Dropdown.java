package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Registration_Dropdown
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement day=driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByValue("22");
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Aug");
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByIndex(24);
	}

}
