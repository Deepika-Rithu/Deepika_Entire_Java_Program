package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_Login 
{

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("deepik27@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("yge8^bhsh");
		driver.findElement(By.name("login")).click();

	}

}
