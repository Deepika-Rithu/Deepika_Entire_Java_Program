package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTM_HoverOver
{
	public static void main(String[] args) throws InterruptedException 
	{
			//HoverOver Demo1 and click Practice3
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.grotechminds.com/hoverover/");
		
		
		WebElement demo1=driver1.findElement(By.xpath("//div[@data-id='1857001']"));
		Actions a1=new Actions(driver1);
		a1.moveToElement(demo1).perform();
		Thread.sleep(2000);
		WebElement Practice3=driver1.findElement(By.xpath("//div[@class='popup4'][3]"));
		Practice3.click();
		

		//HoverOver Demo4 and click Practice10
		ChromeDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.grotechminds.com/hoverover/");
		WebElement demo4=driver2.findElement(By.xpath("//div[@data-id='824f369']"));
		Actions a2=new Actions(driver2);
		a2.moveToElement(demo4).perform();
		Thread.sleep(2000);
		WebElement Practice10=driver2.findElement(By.xpath("//div[@class='popup6'][10]"));
		Practice10.click();
	
		
		//HoverOver Demo5 and click Practice1
				ChromeDriver driver3=new ChromeDriver();
				driver3.manage().window().maximize();
				driver3.get("https://www.grotechminds.com/hoverover/");
				WebElement demo5=driver3.findElement(By.xpath("//div[@data-id='551f3a8']"));
				Actions a3=new Actions(driver3);
				a3.moveToElement(demo5).perform();
				Thread.sleep(2000);
				WebElement Practice1=driver3.findElement(By.xpath("//div[@class='popup7'][1]"));
				Practice1.click();
				
	}

}
