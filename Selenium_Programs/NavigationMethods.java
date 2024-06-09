package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/signup");  //navigation method to launch URL
		Thread.sleep(2000);
		driver.navigate().back();                                //navigation method to go back
		Thread.sleep(2000);
		driver.navigate().forward();                            //navigation method to move forward
		driver.findElement(By.name("firstname")).sendKeys("deepika");
		driver.findElement(By.name("lastname")).sendKeys("sivakumar");
		driver.findElement(By.name("reg_email__")).sendKeys("deepik27@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("deepik27@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("gfs%87ghgh");
		Thread.sleep(2000);
		driver.navigate().refresh();            //navigation method to refresh the page
	}

}
