package Selenium_Basic_Programs;
//Launch google, search India and take a screenshot and save to deepicurrenttime.png

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot_GoogleSearch_Program3
{
	public static void main(String[] args) throws IOException
	{
		Date d1=new Date();
		String date=d1.toString();
		String date_with_underscore=date.replace(':', '_');
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		TakesScreenshot a1=driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\Users\\HP\\OneDrive\\Documents\\Deepika\\Core Java and Selenium\\Screenshots\\deepi".concat(date_with_underscore)+".png");
		FileHandler.copy(source, destination);
	}
}