package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GTM_Dropdowns 

{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		
		WebElement dropdown1=driver.findElement(By.id("Choice1"));
		Select s1=new Select(dropdown1);
		s1.selectByVisibleText("Demo2");
		
		WebElement dropdown2=driver.findElement(By.id("Choice2"));
		Select s2=new Select(dropdown2);
		s2.selectByIndex(4);
		
		WebElement dropdown3=driver.findElement(By.id("Choice3"));
		Select s3=new Select(dropdown3);
		
		s3.selectByValue("Power15");
		
		WebElement dropdown4=driver.findElement(By.id("Choice4"));
		Select s4=new Select(dropdown4);
		s4.selectByVisibleText("Energy7");
		
		WebElement dropdown5=driver.findElement(By.id("Choice5"));
		Select s5=new Select(dropdown5);
		s5.selectByIndex(5);
		
		WebElement dropdown6=driver.findElement(By.id("Choice6"));
		Select s6=new Select(dropdown6);
		s6.selectByValue("Night13");
		
		WebElement dropdown7a=driver.findElement(By.name("Choice7"));
		Select s7a=new Select(dropdown7a);
		s7a.selectByVisibleText("Night3");
		
		//WebElement dropdown7b=driver.findElement(By.name("Choice7"));
		//Select s7b=new Select(dropdown7b);
		//s7b.selectByVisibleText("Selenium9");
		
		WebElement dropdown8=driver.findElement(By.id("Choice8"));
		Select s8=new Select(dropdown8);
		s8.selectByIndex(13);
		
		WebElement dropdown9=driver.findElement(By.name("Choice9"));
		Select s9=new Select(dropdown9);
		s9.selectByValue("SQL15");
		
		WebElement dropdown10=driver.findElement(By.id("Choice10"));
		Select s10=new Select(dropdown10);
		s10.selectByVisibleText("CoreJava4");
	}

}
