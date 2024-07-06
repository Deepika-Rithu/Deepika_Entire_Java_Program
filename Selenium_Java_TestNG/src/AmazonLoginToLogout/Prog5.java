package AmazonLoginToLogout;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Prog5
{
	@Test
	public static void Amazon_Login_Search_Wishlist_Cart_Logout() throws InterruptedException
	{
		//Login
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in");
				WebElement Account_List=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
				Actions a1=new Actions(driver);
				a1.moveToElement(Account_List).perform();
				WebElement signin_button1=driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
				signin_button1.click();
				WebElement username=driver.findElement(By.id("ap_email"));
				username.sendKeys("deepik27@gmail.com");
				WebElement un_continue=driver.findElement(By.id("continue"));
				un_continue.click();
				WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("Deepika@27");
				WebElement signin_button2=driver.findElement(By.id("signInSubmit"));
				signin_button2.click();
				
				//Search and Select first product
				WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
				search.sendKeys("shoe");
				search.sendKeys(Keys.ENTER);
				WebElement firstshoe_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
				firstshoe_select.click();
				
				//Add to wishlist
				Set<String> s1=driver.getWindowHandles();
				Iterator<String> pcid=s1.iterator();
				pcid.next();
				String childid=pcid.next();
				driver.switchTo().window(childid);
				Thread.sleep(2000);
				WebElement wishlist= driver.findElement(By.id("add-to-wishlist-button-submit"));
				wishlist.click();
				Thread.sleep(2000);
				// WebElement close_popup_button = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-close'])[2]"));
				 //close_popup_button.click();
				 WebElement close_popup_button = driver.findElement(By.linkText("View Your List"));
				 close_popup_button.click();
				 Thread.sleep(2000);
				 
				//Add to cart
				//WebElement cart= driver.findElement(By.id("add-to-cart-button"));
				//cart.click();
				WebElement cart= driver.findElement(By.linkText("Add to Cart"));
				cart.click();
				Thread.sleep(2000);
				 
				//Logout
				WebElement Account_List1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
				Actions a2=new Actions(driver);
				a2.moveToElement(Account_List1).perform();
				Thread.sleep(2000);
				WebElement signout= driver.findElement(By.id("nav-item-signout"));
				signout.click();
				
	}

}
