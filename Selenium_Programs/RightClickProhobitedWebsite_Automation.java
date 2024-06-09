package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickProhobitedWebsite_Automation 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement continue_login=driver.findElement(By.className("login_button"));
		continue_login.click();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Deepika");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Deepika@123");
		WebElement captcha=driver.findElement(By.id("loginCaptchaValue"));
		captcha.sendKeys("ygkm8");
	}

}
