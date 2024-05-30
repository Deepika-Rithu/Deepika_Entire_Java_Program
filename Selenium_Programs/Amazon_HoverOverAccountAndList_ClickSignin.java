package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HoverOverAccountAndList_ClickSignin
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement Account_List=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Account_List).perform();
		//WebElement signin_button=driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
		WebElement signin_button=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));  //xpath using text message
		signin_button.click();
		WebElement username=driver.findElement(By.id("ap_email"));
		username.sendKeys("deepik27@gmail.com");
		WebElement un_continue=driver.findElement(By.id("continue"));
		un_continue.click();
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("ygfe7*6jhjk");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		
	}

}
