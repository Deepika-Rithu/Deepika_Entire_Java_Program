package Selenium_Basic_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegistration_LoginUsingGoogle_EnterEmail
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		WebElement Register=driver.findElement(By.id("register_Layer"));
		Register.click();
		WebElement google=driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		Set<String> id=driver.getWindowHandles();
		Iterator<String> pcid=id.iterator();
		String pa_id=pcid.next();
		String ch_id=pcid.next();
		driver.switchTo().window(ch_id);
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("deepik27@gmail.com");
	}

}
