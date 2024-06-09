package Selenium_Basic_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchShoe_SelectFirstShoe_AddToCart 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		WebElement firstshoe_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstshoe_select.click();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> pcid=s1.iterator();
		String parentid=pcid.next();
		String childid=pcid.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement cart= driver.findElement(By.id("add-to-cart-button"));
		cart.click();
	}

}
