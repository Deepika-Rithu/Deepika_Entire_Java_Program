package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToSearchInGoogle_SearchButton {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("forest");
	driver.findElement(By.name("btnk")).click();
	}

}
