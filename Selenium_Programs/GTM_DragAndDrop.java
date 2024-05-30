package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTM_DragAndDrop
{
	public static void main(String[] args) throws InterruptedException
	{
		/*ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grotechminds.com/drag-and-drop/");
		WebElement drag1=driver.findElement(By.id("drag7"));
		WebElement drop1=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag1, drop1).perform();*/
		

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grotechminds.com/drag-and-drop/");
		WebElement drag1=driver.findElement(By.id("drag5"));
		WebElement drop1=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(2000);
		
		WebElement drag2=driver.findElement(By.id("drag5"));
		WebElement drop2=driver.findElement(By.xpath("(//div[@id='container'])[5]"));
		a1.dragAndDrop(drag2, drop2).perform();
		

	}

}
