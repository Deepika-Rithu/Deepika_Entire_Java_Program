package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_isSelected 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/learningHTML1.html");
		WebElement male_radio=driver.findElement(By.id("123"));
		boolean b1=male_radio.isSelected();
		if(b1==true) 
		{
			System.out.println("It is selected");
		}
		else
		{
			System.out.println("It is not selected");
			male_radio.click();
			System.out.println("Now it is selected");
		}
	}
}
