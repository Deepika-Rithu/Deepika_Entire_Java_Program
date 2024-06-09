package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GTM_RegistrationApplication 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grotechminds.com/registration/");
		WebElement fname=driver.findElement(By.id("fname"));
		fname.sendKeys("Deepika");
		WebElement lname=driver.findElement(By.id("lname"));
		lname.sendKeys("S");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("deepik27@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Deepika@27");
		WebElement female_radiobutton=driver.findElement(By.id("Female"));
		female_radiobutton.click();
		WebElement skill=driver.findElement(By.id("Skills"));
		Select s1=new Select(skill);
		s1.selectByIndex(1);
		WebElement country=driver.findElement(By.id("Country"));
		Select s2=new Select(country);
		s2.selectByValue("India");
		WebElement Present_Address=driver.findElement(By.id("Present-Address"));
		Present_Address.sendKeys("21,DSR street, Bangalore 34");
		WebElement Permanent_Address=driver.findElement(By.id("Permanent-Address"));
		Permanent_Address.sendKeys("21,DSR street, Bangalore 34");
		WebElement Pincode=driver.findElement(By.id("Pincode"));
		Pincode.sendKeys("560987");
		WebElement religion=driver.findElement(By.id("Relegion"));
		Select s3=new Select(religion);
		s3.selectByVisibleText("Hindu");
		WebElement file=driver.findElement(By.id("file"));
		file.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Validation_Testing.docx");
		WebElement relocate=driver.findElement(By.id("relocate"));
		relocate.click();
		WebElement submit=driver.findElement(By.name("Submit"));
		submit.click();

	}

}
