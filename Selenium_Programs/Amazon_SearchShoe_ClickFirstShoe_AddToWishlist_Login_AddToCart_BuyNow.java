package Selenium_Basic_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchShoe_ClickFirstShoe_AddToWishlist_Login_AddToCart_BuyNow
{
	public static void main(String[] args) throws InterruptedException 
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
		Thread.sleep(2000);
		WebElement wishlist= driver.findElement(By.linkText("Add to Wish List"));
		wishlist.click();
		WebElement username=driver.findElement(By.id("ap_email"));
		username.sendKeys("deepik27@gmail.com");
		WebElement un_continue=driver.findElement(By.id("continue"));
		un_continue.click();
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Deepika@27");
		WebElement signin_button=driver.findElement(By.id("signInSubmit"));
		signin_button.click();
		WebElement cart= driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		WebElement proceedtobuy= driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
	}

}
