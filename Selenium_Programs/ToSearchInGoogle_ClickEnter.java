package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchInGoogle_ClickEnter {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
