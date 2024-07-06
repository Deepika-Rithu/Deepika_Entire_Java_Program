package Amazon_2TC_1AM_1BM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends Login_Logout
{
@Test
public void Search_ClickFirstProduct_Wishlist_Cart() throws InterruptedException
{
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
	 WebElement view_wishlist = driver.findElement(By.linkText("View Your List"));
	 view_wishlist.click();
	 Thread.sleep(2000);
	 
	//Add to cart
	//WebElement cart= driver.findElement(By.id("add-to-cart-button"));
	//cart.click();
	WebElement cart= driver.findElement(By.linkText("Add to Cart"));
	cart.click();
	Thread.sleep(2000);
}
}
