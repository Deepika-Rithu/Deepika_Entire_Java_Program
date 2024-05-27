package Selenium_Basic_Programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverClass_Methods 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.close();
		driver.quit();
	}

}
