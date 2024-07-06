package AmazonScenarios_ParallelTesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quit
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameofbrowser)
	{
			if(nameofbrowser.equals("Chrome")) 
			{
			driver=new ChromeDriver();
			}
			if(nameofbrowser.equals("Firefox")) 
			{
			driver=new FirefoxDriver();
			}
			if(nameofbrowser.equals("Edge")) 
			{
			driver=new EdgeDriver();
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		TakesScreenshot a1=(TakesScreenshot) driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\HP\\OneDrive\\Documents\\Deepika\\Core Java and Selenium\\Screenshots\\deepi"+Math.random()+".png");
		FileHandler.copy(source, destination);
		driver.quit(); 
	}	
}
