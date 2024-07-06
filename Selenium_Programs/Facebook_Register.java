package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Register {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/signup");
		driver.get("https://www.facebook.com");
		WebElement new_account=driver.findElement(By.linkText("Create new account"));
		new_account.click();
		driver.findElement(By.name("firstname")).sendKeys("deepika");
		driver.findElement(By.name("lastname")).sendKeys("sivakumar");
		driver.findElement(By.name("reg_email__")).sendKeys("deepik27@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("deepik27@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("gfs%87ghgh");
		driver.findElement(By.name("websubmit")).click();
	}

}
