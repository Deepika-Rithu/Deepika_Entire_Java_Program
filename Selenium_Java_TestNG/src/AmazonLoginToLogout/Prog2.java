package AmazonLoginToLogout;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Prog2 
{
	@Test
	public static void Amazon_Login_Search()
	{
		//Login
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement Account_List=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Account_List).perform();
		WebElement signin_button1=driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
		signin_button1.click();
		WebElement username=driver.findElement(By.id("ap_email"));
		username.sendKeys("deepik27@gmail.com");
		WebElement un_continue=driver.findElement(By.id("continue"));
		un_continue.click();
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Deepika@27");
		WebElement signin_button2=driver.findElement(By.id("signInSubmit"));
		signin_button2.click();
		
		//Search
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		WebElement firstshoe_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstshoe_select.click();
		
	}

}
