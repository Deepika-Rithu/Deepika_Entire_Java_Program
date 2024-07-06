package Selenium_Basic_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSAM_JavaScriptPopup 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/learningHTML1.html");
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();         //javascript popup handled
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
