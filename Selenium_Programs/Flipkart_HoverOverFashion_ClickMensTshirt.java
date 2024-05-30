package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_HoverOverFashion_ClickMensTshirt 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//WebElement Fashion=driver.findElement(By.xpath("//div[.='Fashion']"));
		WebElement Fashion=driver.findElement(By.xpath("//div[@class='_1ch8e_'][1]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Fashion).perform();
		WebElement mens_tshirt=driver.findElement(By.linkText("Men's T-Shirts"));
		mens_tshirt.click();
	}
}
