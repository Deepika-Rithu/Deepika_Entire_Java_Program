package Selenium_Basic_Programs;
//Launch google, search India and take a screenshot with name as class name

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot_GoogleSearch_Program4
{
	public static void main(String[] args) throws IOException
	{
		TakeScreenshot_GoogleSearch_Program4 s1=new TakeScreenshot_GoogleSearch_Program4();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		TakesScreenshot a1=driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\Users\\HP\\OneDrive\\Documents\\Deepika\\Core Java and Selenium\\Screenshots\\deepi"+s1.getClass()+".png");
		FileHandler.copy(source, destination);
	}
}
