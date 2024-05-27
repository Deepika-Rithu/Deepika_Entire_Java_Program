package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_RelativeXPath
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/learningHTML1.html");
		
		WebElement username=driver.findElement(By.xpath("(//input)[1]"));
		username.sendKeys("Deepika");
		
		WebElement hint=driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("SD");
		
		WebElement password=driver.findElement(By.xpath("(//input)[3]"));
		password.sendKeys("hgf7&gg*87");
		
		WebElement firstname=driver.findElement(By.xpath("(//input)[4]"));
		firstname.sendKeys("Deepika");
		
		//WebElement submit_button1=driver.findElement(By.xpath("(//input)[6]"));
		//submit_button1.click();
		
		WebElement boy_checkbox=driver.findElement(By.xpath("(//input)[7]"));
		boy_checkbox.click();
		
		WebElement girl_checkbox=driver.findElement(By.xpath("(//input)[8]"));
		girl_checkbox.click();
		
		WebElement baby_checkbox=driver.findElement(By.xpath("(//input)[9]"));
		baby_checkbox.click();
		
		//WebElement submit_button2=driver.findElement(By.xpath("(//input)[10]"));
		//submit_button2.click();
		
		WebElement male_checkbox=driver.findElement(By.xpath("(//input)[11]"));
		male_checkbox.click();
		
		WebElement female_checkbox=driver.findElement(By.xpath("(//input)[12]"));
		female_checkbox.click();
		
		WebElement bangalore_checkbox=driver.findElement(By.xpath("(//input)[13]"));
		bangalore_checkbox.click();
		
		WebElement signup_button=driver.findElement(By.xpath("(//input)[14]"));
		signup_button.click();
		
		}

}
