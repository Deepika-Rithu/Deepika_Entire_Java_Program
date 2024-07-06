package Amazon_2TC_1AM_1BM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Login_Logout
{
	WebDriver driver;
@BeforeMethod
@Parameters("browser")
public void login(String nameofbrowser)
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
}
@AfterMethod
public void logout() throws InterruptedException, IOException
{
	TakesScreenshot a1=(TakesScreenshot) driver;
	File source=a1.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\HP\\OneDrive\\Documents\\Deepika\\Core Java and Selenium\\Screenshots\\deepi"+Math.random()+".png");
	FileHandler.copy(source, destination);
	WebElement Account_List=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a2=new Actions(driver);
	a2.moveToElement(Account_List).perform();
	Thread.sleep(2000);
	WebElement signout= driver.findElement(By.id("nav-item-signout"));
	signout.click();
	Thread.sleep(2000);
}
}
