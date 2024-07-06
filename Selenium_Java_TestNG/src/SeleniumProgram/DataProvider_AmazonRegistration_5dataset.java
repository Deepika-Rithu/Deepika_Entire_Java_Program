package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_AmazonRegistration_5dataset
{
	@DataProvider(name="RegistrationDetails")
	public Object[][] method1()
	{
		Object d1[][]=new Object[5][3];
		d1[0][0]="deepik27@gmail.com";
		d1[0][1]="9965463818";
		d1[0][2]="fdsgD@1523HJE";
		d1[1][0]="deepik27@gmail.com";
		d1[1][1]="9965463818";
		d1[1][2]="fdsgD@152326";
		d1[2][0]="deepik27@gmail.com";
		d1[2][1]="9965463818";
		d1[2][2]="fdsgD@1523543";
		d1[3][0]="deepik27@gmail.com";
		d1[3][1]="9965463818";
		d1[3][2]="fdsgD@1523523r";
		d1[4][0]="deepik27@gmail.com";
		d1[4][1]="9965463818";
		d1[4][2]="fdsgD@15252r3";
		return d1;
	}
	
	@Test(dataProvider="RegistrationDetails")
	public void register(String username, String mobno, String pwd)
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	WebElement Account_List=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(Account_List).perform();
	WebElement registration_link=driver.findElement(By.linkText("Start here."));
	registration_link.click();
	WebElement name=driver.findElement(By.name("customerName"));
	name.sendKeys(username);
	WebElement phno=driver.findElement(By.id("ap_phone_number"));
	phno.sendKeys(mobno);
	WebElement password=driver.findElement(By.id("ap_password"));
	password.sendKeys(pwd);
	driver.findElement(By.id("continue")).click();
	}
}
